fun main() {
    val x = ArrayList<Int>()
    x.add(3)
    x.add(5)
    x.add(4)
    x.add(3)
    x.add(6)
    println("x.size = " +x.size)
    println("x.LastIndex of (3) = " +x.lastIndexOf(3))
    println("x.first = " +x.first())
    println("x.last = " +x.last())
    println("x.Index of (1) = " +x.indexOf(6))
    println("x.isEmpty() = " + x.isEmpty())
    println("x.isNot_Empty() = " + x.isNotEmpty())
    println("x.contains(4)="+x.contains(4))
    println("x.toString()=$x")
    println("x.set(3 , 7) = "+x.set(3,7))
    println("x.get(3) = " + x.get(3))
    x.toArray()
    x.clear()
    println(x.size)



}