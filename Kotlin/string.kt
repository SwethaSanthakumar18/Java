fun main(args: Array<String>) {  
  
val str = "Hello"  
val str1 = "Harish Chanakya"
println(str[0])  
println(str[1])  
println(str[str.length-1])  
println("length: ${str.length}")
println("indices: ${str.indices}")
println("compare: ${str.compareTo(str1)}")
println("compare: ${str1.compareTo(str)}")
println("concat: ${str.plus(str1)}")
println(str==str1)
println(str!=str1)  
println(str===str1)  
println(str!==str1)
}  