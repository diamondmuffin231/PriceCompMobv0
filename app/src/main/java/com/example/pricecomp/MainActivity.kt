package com.example.pricecomp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pricecomp.ui.theme.PriceCompTheme

/*Added import*/
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        
        enableEdgeToEdge()
        setContent {
            PriceCompTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //Replace Greeting() w/ MainScreen()
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )    
                    
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PriceCompTheme {
        Greeting("Android")
    }
}

/*3 Boxes UI*/

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        BoxButton("Go to Activity One") {
            // navigate to ActivityOne
            val context = LocalContext.current
            context.startActivity(Intent(context, GroceryListActivity::class.java))
        }
        BoxButton("Go to Activity Two") {
            val context = LocalContext.current
            context.startActivity(Intent(context, GroceryPricesActivity::class.java))
        }
        BoxButton("Go to Activity Three") {
            val context = LocalContext.current
            context.startActivity(Intent(context, GroceryBudgetActivity::class.java))
        }
    }
}

@Composable
fun BoxButton(text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFBBDEFB))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}
