# PriceCompMobv0
●/○/◼️/◻️/◆/◇/▲/△ ✔

9.6.2025

● Database (not yet started)
    ○ Before accessing a formal database (if can't create one) 
        ◼️ Add lorem ipsum text on apprpriate files.
    ○ Creating/Using a database with SQLite/Room 
        ◼️ Create a db/
        ◼️ Add Dependencies
        ◼️ Database Files / User.kt (Entity) ??? 
        ◼️ DAO (Data Access Objects) [UserDao.kt]
        ◼️ Database [AppDatabase.kt] 
        ◼️ Using the Database [MainActivity.kt] 

● Add 3 Activities (started)
    ○ Activities (started) 
        ◼️ Activity Files ✔
            ◻️ GroceryListActivity.kt ✔
            ◻️ GroceryPricesActivity.kt ✔
            ◻️ GroceryBudgetActivity.kt ✔
        ◼️ Layout "app/src/main/res/layout/activity_main.xml"
            ◻️ Add A Layout File in Android Studio 
        ◼️ Add Child Activities to Father Main_Activity
            ◻️ Added the 3 activities UI on the Main Activity file ✔
            ◻️ Added Unit/UI testing
                ◆ Add a test classes 
                ◆ Run the test

● Add 3 Fragaments (not yet started) 
     ○ Fragments (not yet started)
         ◼️ Grocery List 
         ◼️ Grocery Prices 
         ◼️ Grocery Budget 
    
-------------------------------------

[features ideas] 

● General
    ○ Compare Prices 
    ○ Budget 

● Main View 
    ○ Grocery List (need to buy) ~
        ◼️ Categorize By Store, which would be the best 
    ○ Grocery Prices (items in user's database with the best price)
        ◼️ Have an option next to item to view all store item prices 
        ◼️ put best price in groups (with the best store) 
    ○ Grocery Budget (how often I buy)
        ◼️ Can manually add items (date)
            ◻️ If more than 4 purchases, make an estimate on how often item is purchased  

● Addings items (to Database) ~
     ○ Ways to submit item price data 
         ◼️ Add Reciept option 
            ◻️ Extract text from reciept and catogrize 
         ◼️ Add option to manually add items manually 

● Items/Groeceries 
            
● Item Prices  
     ○ Add tax info (to total price) 
     ○ Add store ad sales into consideration 
     ○ Compare similar item prices   
     
● Database
    ○ Basics
        ◼️ Only have one database (logically related)
    ○ What Database consist of 
        ◼️ Item Price/s
        ◼️ Purchased
        ◼️ Grocery List (future)
    ○ Item Prices 
        ◼️ Have my own database with item prices, for items that aren't known by API 
        ◼️ Add known item prices to my own database? (so I won't have to use API)
             Maybe not due to how often it can fluxuate? 
    ○ When (to add items) :
       ◼️ After every "inspection" of reciept   

    
    
