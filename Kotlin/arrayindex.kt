fun main(args: Array<String>) {
   val arr = intArrayOf(1, 2, 3, 4, 5)
    for (i in arr.indices) {
        println(arr[i])
    }
    for (i in 0..arr.size-1)
    {
        println(arr[i])
    }
    for (`val` in arr) {
        println(`val`)
    }
    arr.forEach { x: Int -> println(x) }
     println(arr.contentToString())

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}