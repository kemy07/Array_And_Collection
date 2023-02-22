fun main() {
    // التلاتة دول يقابلوا ال (Array)
    val x : List<Int> = listOf(3 , 7 , 3 , 9 , 10)
    val y : Map <Int , String> = mapOf<Int,String>()
    val z : Set<Int> = setOf(3 , 7 , 3 , 9 , 10)

    // التلاتة دول يقابلوا ال (ArrayList)
    val a : MutableList <Int> = mutableListOf<Int>()
    a.add(4)
    val b : MutableMap <Int , String> = mutableMapOf<Int , String> ()
    val c : MutableSet <Int> = mutableSetOf<Int>()

    val s = ArrayList<Int>()
    s.addAll(x)
    s.addAll(z)
    s.addAll(2 , z)
    println(s)
}