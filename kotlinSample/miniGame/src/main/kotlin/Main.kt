import java.util.*

fun main(args: Array<String>) {
    /*
        Random number 찾기 게임
        범위 : 1 ~ 100
        입력 : 범위 맞춰서 입력받기
        기회 : 10번 -> 축하합니다./ 다시 도전하세요.
        replay? -> yes/no

         ex) random number = 78
             input number = 40 -> 너무 작습니다.
             input number = 80 -> 너무 큽니다.
             input number = 0 -> 범위에 맞게 입력해주세요.

     */


    var replay:Int = 0
    do{
        var rnum:Int = (1..100).random()
        println(rnum)
        var result = false
        for(i in 0 until 10){
            println("${i+1} 번째 입력 : ")
            val input = readLine()!!.toInt()
            if(input !in 1..100){
                println("1부터 100까지의 정수를 입력하세요.")
                continue
            }
            if(input == rnum){
                println("축하합니다. ${i+1}번째의 시도만에 정답입니다!")
                result = true
                break
            }else if(input > rnum){
                println("입력하신 숫자가 너무 큽니다.")
            }else{
                println("입력하신 숫자가 너무 작습니다.")
            }
        }
        if(!result){
            println("실패했습니다")
        }
        println("다시 도전하려면 1번을 눌러주세요.")
        replay = readLine()!!.toInt()
    }while(replay == 1)


/*
    //강사님 풀이
    var ranNum:Int
    var userNum:Int
    var clear:Boolean
    var w:Int   //loop용 변수

    while(true){
        //init
        clear = false
        w = 0

        //random
        ranNum = (Math.random() * 100).toInt() + 1
        println("randNum: $ranNum")

        //loop
        while(w<10){
            // user input
            print("number = ")
            userNum = readLine()?.toInt()!!

            //finding
            var str:String = if(userNum > ranNum){
                "너무 큽니다."
            }else if(userNum < ranNum){
                "너무 작습니다."
            }else{
               "빙고"
            }

            //message
            if(str == "빙고"){
                clear = true
                break
            }else{
                println(str)
            }
            w++
        }

        //result
        val resultMsg:String = if(clear){
            "축하합니다. 클리어 하셨습니다."
        }else{
            "아쉽습니다. ${ranNum}번 이었습니다. 다시 도전하세요."
        }
        println(resultMsg)

        print("한판 더 하시겠습니까?(y/n) = ")
        val replay:String? = readLine()

        if(replay == "N" || replay == "n"){
            println("안녕히 가세요.")
            break
        }
        println("다시 시작합니다.")
    }*/
}