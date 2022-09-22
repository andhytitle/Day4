fun main() {
    print("Input : ")
    val input = readLine().toString().toInt()

    if (input in 90..100) {
        println("Output : A")
    } else if (input in 80..89) {
        println("Output : B")
    } else if (input in 70..79) {
        println("Output : C")
    } else if (input in 60..69) {
        println("Output : D")
    } else if (input <= 59) {
        println("Output : E")
    } else {
        println("Data yang dimasukkan salah")
    }
}
