fun main() {
    val a = arrayOf(58 , 5 , 15 , 3 , 25 , 99 , 1 , 6)
    println("Max Element: "+a.max())
    println("Min Element: "+a.min())
    println("Count Element: "+a.count())
    println("First Element: "+a.first())
    println("Last Element: "+a.last())
    println("Set Element : Update index 3 by 333: "+a.set(3,333))  // a[3] = 333
    println("Get Element"+a.get(3)) // a[3]
    println("Sort Element "+a.sort())

    for (i in 0 until a.size)
    {
        println("Ar[$i]=" +a[i])
    }
}