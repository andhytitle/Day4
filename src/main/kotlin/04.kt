fun main() {
    print("Input : ")
    val input = readLine().toString().toInt()

    if (input >= 21) {
        println("Output : Dewasa")
    } else if (input in 13..20){
        println("Output : Remaja")
    }else if(input in 9..12){
        println("Output : Bimbingan Orang Tua")
    }else if (input < 9){
        println("Output : Semua Usia")
    }
}