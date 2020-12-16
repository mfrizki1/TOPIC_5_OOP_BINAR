fun main() {
    println("Daftar Laptop")
    println("1. MacBook")
    println("2. AlienWare")
    print("Pilih Laptop Mana :")
    val jenis_laptop = readLine()?.toInt()
    val apple = Apple()
    val alienWare = AlienWare()
    val laptop = Laptop()
    when (jenis_laptop) {
        1 -> {
            apple.desc()
        }
        2 -> {
            alienWare.desc()
        }
        else -> {
            laptop.desc()
        }
    }
}