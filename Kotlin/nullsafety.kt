fun main(args: Array<String>) {

    //Safe Call (?.)
    val name: String? = null
    println("The length of name is ${name?.length}")
    
    //Safe Call with let(?.let)
    name ?.let {
        println("The length of name is ${name.length}")
    }
    val len = if(name !=null)
              name.length
              else
              -1
    //Elvis operator (?:)
    println("The length of name is ${len}")
    val length = name?.length ?: -1
    
    //Non-null assertion operator(!!)
    println("The length of name is ${length}")
   // println("The length of name is ${name!!.length}")
}