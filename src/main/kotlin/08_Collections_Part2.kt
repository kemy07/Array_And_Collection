fun main() {
    //immutable
    val a : Map <Int , String> = mapOf(Pair(44,"a") , Pair(2 , "b") , Pair(3 , "c"))
    // mutable
    val b : MutableMap <String , Int> = mutableMapOf<String , Int> ()
    val c = HashMap <Int , String>()
    // واتعامل مع الهاش ماب نفس التعمل مع ال(MutableMap)
//    b[0] = "a"
//    b[3] = "b"
//    b[44] = "f"
//    b.replace(44 , "k")
    b["kamel"] = 100
    println(b)



}