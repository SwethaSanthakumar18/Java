sealed class Demo {
	class A : Demo() {
		fun display()
		{
			println("Subclass A of sealed class Demo")
		}
	}
	class B : Demo() {
		fun display()
		{
			println("Subclass B of sealed class Demo")
		}
	}
}
fun main()
{
	val obj = Demo.B()
	obj.display()                                            

	val obj1 = Demo.A()
	obj1.display()
}


/*sealed class Color{
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}
fun eval(c: Color) =
        when (c) {
            is Color.Red -> println("Paint in Red Color")
            is Color.Orange -> println("Paint in Orange Color")
            is Color.Blue -> println("Paint in Blue Color")
        }

fun main(args: Array<String>) {
    val r = Color.Red()
    eval(r)
}*/