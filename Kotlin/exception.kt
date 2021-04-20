fun main(){
    var arr=Array<Int>(5){0}
    for (i in 0..4){
        var temp=Integer.valueOf(readLine())
        arr[i]=temp;
    }
    for (j in arr){
      try{println(7/j)}
      catch (e:Exception){ println("Divide by zero! error")}
    }
}