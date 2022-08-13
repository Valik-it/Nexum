import java.lang.Exception

fun main() {

    print("Введите первое число: ")
    val first : Int = readNumber()

    print("Введите второе число: ")
    val second : Int = readNumber()

    println("Введите действие: +, -, *, /")
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

fun defineAct(){
    val pls = Action.PLUS
    val mns = Action.MINUS
    val mlt = Action.MULTIPLY
    val dvd = Action.DIVIDE

    val first : Int = readNumber()
    val second : Int = readNumber()
    val quant : String? = readLine()


    if (quant == "+"){
        val sum : Int = first + second
        println("Ответ: ${sum}")
    }else if (quant == "-"){
        val sum : Int = first - second
        println("Ответ: ${sum}")
    }else if (quant == "*"){
        val sum : Int = first * second
        println("Ответ: ${sum}")
    }
    else if (quant == "/"){
        val sum : Int = first / second
        println("Ответ: ${sum}")
    }

}

enum class Action(val symbol : String){
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");
}





//if (val = pls){
//sum = pls + mns
//println("Ответ: ${sum}")
//else if (val = mns){
//sum = pls - mns
//}


//fun clock() {
    //val hourOfDay = 69

    //val timeOfDay = if (hourOfDay < 6) {
        //"Раннее утро"
    //} else if (hourOfDay < 12) {
        //"Утро"
    //} else if (hourOfDay < 17) {
       // "После полудня"
    //} else if (hourOfDay < 20) {
        //"Вечер"
    //} else if (hourOfDay < 24) {
        //"Поздний вечер"
    //} else {
        //"НЕДЕЙСТВИТЕЛЬНЫЙ ЧАС!"
    //}
    //println(timeOfDay)
//}
