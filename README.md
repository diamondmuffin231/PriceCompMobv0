# PriceCompMobv0
●/○/◼️/◻️/◆/◇/▲/△ ✔

Via Android Studio 

-----------------------------------------------------------------------------------------------------------------------

9.22.2025 
● Test out/view UI ❌
● Start working on Database ❌

9.6.2025
● BackEnd 🟨
    ○ Database (Started)(Test out some files/functions)
        ◼️ Creating/Using a database with SQLite/Room 
            ◻️ Create a db/ 
            ◻️ Add Dependencies ✔ (Test) 
            ◻️ Database Files / User.kt (Entity) ??? 
            ◻️ DAO (Data Access Objects) [UserDao.kt]
            ◻️ Database [AppDatabase.kt] 
            ◻️ Using the Database [MainActivity.kt] 
        
● UI 🟨
    ○ Add 3 Activities (started)
        ◼️ Activities (started) 
            ◻️ Activity Files ✔
                ◆ GroceryListActivity.kt ✔
                ◆ GroceryPricesActivity.kt ✔
                ◆ GroceryBudgetActivity.kt ✔
            ◻️ Layout "app/src/main/res/layout/activity_main.xml"
                ◆ Add A Layout File in Android Studio 
            ◻️ Add Child Activities to Father Main_Activity??
                ◆ Added the 3 activities UI on the Main Activity file ✔
                ◆ Added Unit/UI testing
                    ◇ Add a test classes 
                    ◇ Run the test

                    
                    
    ~ OR

    ○ Add 3 Fragaments ❌
         ◼️ Fragments ❌
             ◻️ Grocery List 
             ◻️ Grocery Prices 
             ◻️ Grocery Budget 

● API ❌
    ○ Debit-card transactions on a user’s bank account
        ◼️ Plaid, Yodlee, TrueLayer, SaltEdge, MX
            ◻️ Link bank account once (OAuth / credentials)

-------------------------------------

[features ideas] 

● General
    ○ Policy and Aims 
        ◼️ Make it as simple as possible (even with lots of implementation and information)
            ◻️ Big Shapes, and soft colors 
        ◼️ Mobile and watch app 
        ◼️ Test it and allow user feedback

    ○ Included Items 
        ◼️ Grocery List (current/future)
            ◻️ Have a checklist option next to Groceries (due to slight inconsistency)
            ◻️ 
        ◼️ Grocery Prices (local) 
            ◻️ Include deals for stuff one grocery list
                ◆ Store ads 
        ◼️ Budget 
            ◻️ Determine how often one get's specific groceries 
    

● Main View 
    ○ Grocery List (need to buy) ~
        ◼️ Categorize By Store, which would be the best 
    ○ Grocery Prices (items in user's database with the best price)
        ◼️ Have an option next to item to view all store item prices 
        ◼️ put best price in groups (with the best store) 
    ○ Grocery Budget (how often I buy)
        ◼️ Can manually add items (date)
            ◻️ If more than 4 purchases, make an estimate on how often item is                      purchased. 

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

    
    
