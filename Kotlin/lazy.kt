
val pi : Float by lazy{
    3.14f
}
fun main(args: Array<String>)
{
    val r1 : Float = 4.2f
    val r2 : Float = 8.1f
    val area1 = pi *  r1 * r1
    val area2 = pi * r2 * r2
    println("Area1 : $area1")
    println("Area2 : $area2")
}