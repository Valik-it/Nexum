import java.lang.Exception

fun main() {

    print("Введите первое число: ")
    val first : Int = readNumber()

   print("Введите второе число: ")
    val second : Int = readNumber()

    println("Введите операцию: +, -, *, /")
    val sum : Int = first + second

   println("Ответ: $sum ")
}

fun readNumber() :Int{
    return try {
        readLine()!!.toInt()
    }
    catch (e:Exception){
        0
    }
}


enum class Action{
        PLUS(+),
        MINUS(-),
        DIVIDE(/),
        MULTIPLY(*)


}





