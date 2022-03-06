//global변수
var global = 10

fun main(args: Array<String>) {

    val res1 = funcParam(3,4, ::sum)
    println(res1)

    hello(::text)
    hello { a, b -> text(a, b) }

    //일반 변수처럼 할당할 수 있음
    val likeLambda = ::sum
    println(likeLambda(2,5))

    global = 11

    //fun 내부에 fun 선언 가능 => 자주 쓰이진 않음
    fun localFunc(){
        global = 12
        
        //local 변수
        var temp:Int
    }

    localFunc()
    
    println("global = $global")
}

fun sum(a:Int, b:Int) = a + b

fun text(a:String, b:String) = "Hi! $a $b"

fun funcParam(a:Int, b:Int, c:(Int, Int) -> Int):Int{
    return c(a, b)
}

fun hello(body:(String, String) -> String){
    println(body("Hello", "World"))
}