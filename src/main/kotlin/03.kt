fun main() {
    print("Input : ")
    val input = readLine().toString().toInt()

    if (input % 400 == 0) {
        println("Output : Kabisat")
    } else if (input % 100 == 0) {
        println("Output : Bukan Kabisat")
    } else if (input % 4 == 0) {
        println("Kabisat")
    }else{
        println("Bukan Kabisat")
    }
}