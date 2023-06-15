fun main(){

    var food1= Recipe.MoroccanRecipe(Recipess.FUFU,12,"HEATING")
    food1.prepareFood()
    var food2= Recipe.EthiopianRecipe(Recipess.FISH,45,"ROASTING")
    food2.prepareFood()
    var food3= Recipe.NigerianRecipe(Recipess.SOMBE,25,"BOILING")
    food3.prepareFood()

println("QUESTION FIVE")
    var product1 = Product("Juice",500,3)
    product1.totalValue()
    var product2 = Product("Mango",300,6)
    product2.totalValue()
    var product3 = Product("Soap",900,5)
    product3.totalValue()
    var product4 = Product("Chalcoal",4000,8)
    product4.totalValue()
    var product5 = Product("Donuts",900,5)
    product5.totalValue()
println("QUESTION SIX")
    var student1= Student("JOYEUSE",21, arrayOf(12,45,67,78,90))
    student1.avgGrades()
    student1.checking()
    student1.displayInfo()
    println("QUESTION 8")

    var book1= LibraryCatalog()



}


enum class Recipess{
    FUFU,
    FISH,
   SOMBE
}



//**African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
open class Recipe(open var ingredients:Recipess, open var prepationTime:Int, open var cookingMethod:String ){
    class MoroccanRecipe(override var ingredients: Recipess, override var prepationTime: Int, override var cookingMethod: String):Recipe(ingredients,prepationTime,cookingMethod){
        fun prepareFood(): Recipess {
            var food=Recipess.FUFU
            when{
               prepationTime==13-> println(food)
else-> println("no food")
            }

            return  food
        }

    }
    class EthiopianRecipe(override var ingredients: Recipess, override var prepationTime: Int, override var cookingMethod: String):Recipe(ingredients,prepationTime,cookingMethod){
        fun prepareFood(): Recipess {
            var food=Recipess.FISH
            when{
                prepationTime>=20-> println(food)
                else-> println("no food")

            }
            return  food
        }

    }
    class NigerianRecipe(override var ingredients: Recipess, override var prepationTime: Int, override var cookingMethod: String):Recipe(ingredients,prepationTime,cookingMethod){
        fun prepareFood(): Recipess {
            var food=Recipess.SOMBE
            when{
                prepationTime>=25-> println(food)
                else-> println("no food")
            }
            return  food
        }

    }
}
//Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.
class Product (var productName: String,var prodPrice:Int, var prodQuantity:Int) {
    fun totalValue() {
            var value = prodPrice * prodQuantity
            println("${productName} has a value of ${value} ")
        }

    }


//Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.

class Student(var name:String,var age:Int,var grades:Array<Int>){
    fun avgGrades():Int {
        var totalGrades = 0

        for (g in grades) {
            totalGrades += g

        }
        var avgGrades = totalGrades / grades.size
        return avgGrades
    }
    fun checking(){
        if(avgGrades()>=60){
            println("passed")
        }else{
            println("failed")
        }
    }
    fun displayInfo(){
        println("student name is ${name} the age is ${age} and the average marks is ${avgGrades()}")
    }
}


//Create a LibraryCatalog class that handles the cataloging and management of
//books in a library. Implement methods to add new books, search for books by
//title or author, keep track of available copies, and display book details.

data class Books(var title:String, var author:String, var pages:Int)

class LibraryCatalog(){
    var books= mutableListOf<Books>()
    fun addBook(title: String,author: String,pages: Int){
        var book=Books(title,author,pages)
        books.add(book)

    }

    fun searchBook(title: String){
        var search= books.find{it.title==title}
       println(search)
    }
    fun availablebooks(){
        for (book in books){
            println(book)
        }
    }
}


