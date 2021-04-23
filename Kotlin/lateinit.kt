fun main(args: Array<String>) {

    val country = Country()
    country.display()
}
class Country{
    lateinit var name: String
    fun display()
    {
        name = "India"
        println("Country Name : $name")
    }
}