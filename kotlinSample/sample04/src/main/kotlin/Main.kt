fun main(args: Array<String>) {
    //var val
    //var a:Int? = null
    //val a:Int = 11  //상수이기 때문에 값을 바꿀 수 없음

    /*
    //try catch finally
    val a = 6
    val b = 0
    var c:Int

    try{
        c = a/b
    }
//    catch(e:ArithmeticException){
//        println("${e.message}")
//    }
    catch(e:Exception){
        println("${e.message}")
    }finally {  //반드시 실행되는 부분
        println("finally")
    }
    */

    var amount = 600

    try{
        amount -= 100
        checkAmount(amount)
    }catch(e:Exception){
        println(e.message)
    }

    println("program end")
}
fun checkAmount(amount:Int){
    if(amount < 1000){
        throw Exception("잔고가 $amount 로 1000이하 입니다.")
    }
}