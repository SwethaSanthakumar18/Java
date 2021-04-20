fun main(args: Array<String>) {  
inlineFunction({ println("Calling inline functions")})  
}  
  
inline fun inlineFunction(myFun: () -> Unit ) {  
myFun()  
    print("Inside Inline Function")  
}  