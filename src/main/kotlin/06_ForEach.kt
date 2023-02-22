fun main() {
    val x:Array<Int> = arrayOf(2 , 4 , 7 , 9 , 3)
    val  y = ArrayList <Int> ()
    y.add(3)
    y.add(99)
    y.add(7)
    y.add(5)
    y.add(33)

    x.forEach { println(it) }
    y.forEach { println(it) }
}