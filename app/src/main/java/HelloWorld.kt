@file:Suppress("UNUSED_VARIABLE", "NAME_SHADOWING")

fun main() {

    val animalList = mutableListOf(
        "кит",
        "кот",
        "собака",
        "дельфин",
        "попугай",
        "орёл",
        "лиса",
        "медведь",
        "лев",
        "тигр")

    println("Какое животные вы бы хотели? Дикое, хищное, домашнее, умеет летать")
    //println(animalList)

    val question: String? = "Дикие животные"


    if (question == "Дикие животные"){
        print("Введите вопрос: ")
        val question = readLine()
        println("Дикие животные: кит, дельфин, орёл, лиса, медведь, лев, тигр")

    }else if (question == "Домашние животные"){
        println("Домашние животные: кот, собака, попугай")

    }else if (question == "Хищники"){
        println("Хищники: орёл, лиса, медведь, лев, тигр")

    }else if (question == "Умеет летать"){
        println("Умеют летать: орёл и попугай")

    }else{
        println("Ошибка вопроса")
    }

}
