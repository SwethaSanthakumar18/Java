class MultiInit(name: String) {

    init {
        println("First initializer block prints ${name}")
    }

    init {
        println("Second initializer block prints ${name.length}")
    }
}

fun main(args: Array<String>) {
    var multiInit = MultiInit("Kotlin")
}