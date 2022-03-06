fun main(args: Array<String>) {

    //Array

    //Java
    //final int array[] = {1, 2, 3};

    val array = intArrayOf(1, 2, 3)

    println(array)
    println(array[1])
    println(array.contentToString())

    var array1 = arrayOf(1, 1.23, "하이", true)
    println(array1.contentToString())

    var array2 = Array(10,  { 33 })
    for(n in array2){
        println(n)
    }
    println(array2.contentToString())

    var i = 1
    var array3 = Array(10) { i++ }
    println(array3.contentToString())

    //generic
    var array4 = arrayOf<Int>(10, 20, 30)
    array4.forEach { println(it) }

    var array5 = arrayOf<String>("one", "two", "three")
    array5.forEach { println(it) }

    var arrayChar = charArrayOf('A', 'B', 'C')
    var arrayBoolean = booleanArrayOf(true, false)

}