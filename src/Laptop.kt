open class Laptop {
    open fun desc(){
        println("Tidak ada laptop yang dipilih...")
    }

    class Apple: Laptop(){
        override fun desc() {
            println("Laptop Idaman Programmer!!!")
        }
    }

    class AlienWare: Laptop(){
        override fun desc() {
            println("Laptop Idaman Gamers")
        }
    }
}