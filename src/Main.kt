fun main() {
    print("Введите 2 цифры: ")
    val valOne = readln()
    val valTwo = readln()

    val valThree = (valOne + valTwo)
    val valFour = (valTwo + valOne)

    if (valThree.toInt() % 2 == 0){
        println("Создать нечетное число невозможно")
    }  else {
        println(valThree)
    }
    if (valFour.toInt() % 2 == 0){
        println("Создать нечетное число невозможно")
    }  else {
        println(valFour)
    }

}