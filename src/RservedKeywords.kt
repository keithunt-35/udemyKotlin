
const val PI =3.14 // static final and is declared outside the function
fun main() {
    var name: String = "keithunt"
    var age: Int = 18
    println("${age} ${name}")

    //int number =5:
    var l:Long =100L
    var f: Float = 3.14F
    var d: Double = 3.14
    var b: Boolean = true

    //any data typy stores any data type in an open classhowever it can cause confusion
    // or you can drop the type
    var bandVar = "keihtunt" //mutable
    val brandVal = "keithunt" // immutable final constant and is read only

    // null safety
    var intro = "keithunt_35"
    println(intro.uppercase())
    var brand: String? ="amigoscode"
    //println(brand.uppercase()) //produces an error
    println(brand?.uppercase())


    //multiline strings
    val email = """
        hello %s
        how
        are
        you
    """.trimIndent()
    print(email.format("Anna"))

    //single,=, equals assign
    //double,==, compare contents
    //tripple,===, compare memory addresses

    // all the mathematical operations hold
    // others are obtained through the dot math operator and imported throught the respective package
    // the rounding off round down ie 4.5 is 4.0

    // booleans can be false, true of null

    //all logical operator hold

    val names = arrayOf<String>("jamila, james")
    names[0]="pryze"
    println(names.contentToString())
    //can us the in keyword

    //lists are expandable unlike arrays
    val list:List<String> = listOf("tg parkins","saleh","pater",)
    println(list)
    println(list.size)
    println(list.isEmpty())
    println(list.contains("tg parkins"))
    println(list.indexOf("tg parkins"))
    println(list.lastIndexOf("tg parkins"))
    println(list.first())
    println(list.last())
    println(list.asReversed())
    println(list.sorted())

    val numbers = intArrayOf(1,2,3,4,5)
    val naming = listOf("mary", "ali","alex")
    for (naming in naming){
        println(naming)
    }

    println()
    for (i in numbers){
        print(i)
        println(i)
    }

    //functions
    println("hello keith".uppercase())

    greet()
}

// unit is void from java
private fun greet(){
    // all the business logic
    println("greetings you are loved")
}