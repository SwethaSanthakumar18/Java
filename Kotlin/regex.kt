fun main(args: Array<String>){  
val regex = Regex(pattern = "ko")  
val matched = regex.containsMatchIn(input = "kotlin")  
println(matched)  
val usernamePattern = "[a-zA-Z0-9]+"
    val regex1 = Regex(usernamePattern)
    println(regex1.containsMatchIn("Swetha__SathaKumar"))
    println(regex1.containsMatchIn("!#$%"))
}  