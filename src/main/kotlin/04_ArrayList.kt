fun main() {
    val x :Array<Int> = Array(3) {0} // immutable  عشان هو حجز 3 أماكن ف الذاكرة
    val y = ArrayList<Int>()   //mutable قابلة للتعديل  but array in immutable  غير قابلة للتعديل

    x[0] = 3
    y.add(3)   // 0 index
    y.add(4)   // 1 index
    y.add(2 , 9)
    println(y)
    y.remove(3)
    y.remove(4)
    println(y)
    y.clear()


}