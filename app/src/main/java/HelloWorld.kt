fun main() {
    val firstInput: Int = readNumber()
    val secondInput: Int = readNumber()
    val action = readAction()
    calculate(firstInput, secondInput, action)
}

fun calculate(
    firstInput: Int,
    secondInput: Int,
    action: Action
) {
    val sum = when (action) {
        Action.PLUS -> firstInput + secondInput
        Action.MINUS -> firstInput - secondInput
        Action.MULTIPLY -> firstInput * secondInput
        Action.DIVIDE -> firstInput / secondInput
    }
    println("Ответ: $sum ")
}

fun readNumber(): Int {
    println("Введите число: ")
    return try {
        readLine()!!.toInt()
    } catch (e: Exception) {
        println("Вы ввели некорректное число, поэтому оно будет ноль")
        0
    }
}

fun readAction(): Action {
    var action: Action?
    do {
        println("Введите действие:${Action.availableActions}")
        action = when (readLine()) {
            Action.PLUS.symbol -> Action.PLUS
            Action.MINUS.symbol -> Action.MINUS
            Action.MULTIPLY.symbol -> Action.MULTIPLY
            Action.DIVIDE.symbol -> Action.DIVIDE
            else -> null
        }
    } while (action == null)
    return action
}

enum class Action(val symbol: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    companion object {
        val availableActions: String
            get() = values().joinToString(separator = ",") { it.symbol }
    }
}