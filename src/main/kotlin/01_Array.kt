fun main(args: Array<String>) {
   val x = IntArray(3)
    x[0] = 2
    x[1] = 4
    x[2] = 7
    // النوع التانى هو الأكثر شيوعاً فى الإستخدام
    val y =Array(3){0}  // 0 is initial value --> بحدد نوع المصفوفة من خلال المنغير دة
    y[0] = 2
    y[1] = 4
    y[2] = 7
    val z = Array<Int> (3) {0}
    z[0] = 2
    z[1] = 4
    z[2] = 7
   // الطريقة المختصرة فى الإستخدام
    // وينفع ساعتها احط اى انواع وساعتها هيكون النوع (Any)
   val a = arrayOf("kamel" , "hassan","kamel")

   println(a[1])
}