import java.util.*

fun main(args:Array<String>){
    println("hi")

    /*
    print("input= ")
    val input = readLine()
    println("Your input : "+ input)
    println("Your input : $input")
    */

    val read = Scanner(System.`in`)
    println("숫자를 입력하세요. >>")
    val number = read.nextInt()
    println("number = $number")

    //변수    variable
    //값     value

    //String str = "abc";             변수
    //final String name = "홀길동";    상수
    
    /*
    var str:String = "abc"
    val name:String = "홍길동"
    
    str = "bcd"
    //name = "성춘향"  //-> val을 var로 변경해야 함

    println("str: $str")
    println("str: "+str)
    println(str+name)

    var a = 1
    val str1 = "a = $a"
    val str2 = "a = $a + 1"
    val str3 = "a = ${a + 1}"
    println("str1: \"$str1\", str2: \"$str2\", str3: \"$str3\"")

    val num1 = 5    //Int로 추론
    val num2 = 3

    val num3:Int = num1 + num2
    println("num1 + num2 = $num3")

    //문자열 비교 == equals
    var str4:String = "hello"
    var str5 = "world"
    var str6 = "hell"
    str6 += "o"

    println("${str4 == str6}")  //equals 자동호출
    println("${str4 === str6}")  //값을 비교 => false
    println(str4 == str6)

    val num5:Int = 123
    val num6 = num5
    println("num5 === num6 ${num5 === num6}")

    val num7:Int = num5
    val num8:Int = num5
    val num9:Int = num7
    println(num7 == num8)
    println(num7 === num8)  //주소가 다르기 때문에 false
    println(num7 === num9)
    */

    /*
    // ? !!
    var a:Int? = null   //null을 허용하려면 ? 필요
    var b:Int? = 10

    var c:Int? = b
    var c2:Int = b!! //강제, 강조

    var str1:String? = "Hello Kotlin"
    str1 = null


    //자료형의 비교
    println("Byte min: "+Byte.MIN_VALUE + ", max:"+Byte.MAX_VALUE)
    println("Short min: "+Short.MIN_VALUE + ", max: "+Short.MAX_VALUE)
    println("Int min: "+Int.MIN_VALUE + ", max: "+Int.MAX_VALUE)
    println("Long min: "+Long.MIN_VALUE + ", max: "+Long.MAX_VALUE)
    println("Float min: "+Float.MIN_VALUE + ", max: "+Float.MAX_VALUE)
    println("Double min: "+Double.MIN_VALUE + ", max: "+Double.MAX_VALUE)

    val num1 = 12.0 //val num1:Double = 12.0 와 같음
    val num2:Double = 0.0
    var result:Double = 0.0

    result = num1 / num2
    println("$result")  //0으로 나눌 수 없음

    var n = 10

    n++
    ++n
    println(n)
    */

    /*
    var a:Int = 12
    val b:Boolean = true
    var d:Double = 12.345

    val s = a.toString()
    println(s)

    var num:Int = s.toInt() //parseInt()
    println("${num + 1}")

    //typescript = javascript + type을 명시
    //num:Int
    */

    val a:Int = 120
    val b = a
    println(a===b)  //같은 객체 => true

    val c:Int? = a
    val d:Int? = a

    println(c==d)   //wrapper로 됨
    println(c===d)  // -128 ~ 127부터 안됨
    //코틀린에서는 저장되는 값이 -128~127의 값을 갖는다면 성능을 위해 이 값을 캐시에 저장합니다.
    //따라서 127이 캐시에 저장되고 a, b는 그 캐시의 주소값을 저장하고 있는 것이죠.


}