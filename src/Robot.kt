open class Robot(var name:String){
    fun Ring_The_alarm(Time:String,Day:String){
        var Alarm_specs= arrayListOf("10:00 AM","10:30 AM","11:00 AM","Sunday")
        if(Time in Alarm_specs && Day !in Alarm_specs) {
            println("Alarm is set for ${Day} and it will ring at ${Time}")
        }
    }
    fun Make_coffee(){
        println("Hey! Coffee is being prepared with below ingredients.Hope u like it :)")
    }
    fun Heat_the_water(Temperature:Double){
        println("I am heating your Water at ${Temperature} degree Celsius.")
    }
    fun Pack_your_bag(Which_Day:String){
        val mon= arrayListOf("Physics","History","Hindi")
        val tue= arrayListOf("Chemistry","Civics","Maths")
        val wed= arrayListOf("Physics","Geography","Maths")
        val thurs= arrayListOf("Maths","English","History")
        val fri= arrayListOf("Geography","Physics","Chemistry")
        val sat= arrayListOf("Maths","Hindi")
        if (Which_Day!="Sunday") {
            println("I am packing bag for ${Which_Day}.And below are the copies that I will keep in your bag.")
        }
        when(Which_Day){
            "Monday"-> println(mon)
            "Tuesday"->println(tue)
            "Wednesday"->println(wed)
            "Thursday"-> println(thurs)
            "Friday"-> println(fri)
            "Saturday"-> println(sat)
            "Sunday"->println("Hey! it's Sunday")
            else-> println("Enter valid day")
        }
    }
    fun Cook_brunch(){
        var Breakfast= arrayListOf("Poha","Idli","Samosa","Bread and butter","Boiled Egg","Omelete")
        var Lunch= arrayListOf("Roti with Arhar dal","Roti with Matar Paneer","Chole Bhature","Pav Bhaji","Roti with Dal Makhani")
        println("In breakfast I am making ${Breakfast.random()} for you.Hope you will like it :)")
        println("And for lunch I will make ${Lunch.random()} for you.Hope you will like it :)")
    }
    fun Iron(What_You_Want_To_Wear:String){
        println("I have ironed ${What_You_Want_To_Wear} for you.Please wear it fast so that you will be on time.")
    }
}