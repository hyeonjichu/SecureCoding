fun main(args: Array<String>) {
    println("게임을 선택하세요.")
    println("1. 가위바위보 게임  2. 로또 번호")
    val num = readLine()!!.toInt()
    if(num == 1){
        rockpaper()
    }else if(num == 2){
        lotto()
    }else{
        println("종료")
    }
}

fun rockpaper(){
    /*
        가위 0 바위 1 보 2 게임
        computer <-> user

        com : random
        user : input
        ? 승 ? 패 ? 무
     */

    /*
    var win = 0
    var lose = 0
    var same = 0

    while(true){
        val com:Int = (0..2).random()
        println(com)
        println("0(가위), 1(바위), 2(보) 중 하나를 입력하세요. >>")
        var user:Int = readLine()!!.toInt()
        if(user !in 0..1){
            println("0(가위), 1(바위), 2(보) 중 하나만 입력 가능합니다. 다시 입력하세요. >>")
            user = readLine()!!.toInt()
        }
        when{
            user == 0 -> {  //가위
                if(com == 0){
                    println("무승부입니다.")
                    same += 1
                }else if(com == 1){
                    println("졌습니다.")
                    lose += 1
                }else{
                    println("이겼습니다.")
                    win += 1
                }
            }
            user == 1 -> {  //바위
                if(com == 0){
                    println("이겼습니다.")
                    win += 1
                }else if(com == 1){
                    println("무승부입니다.")
                    same += 1
                }else{
                    println("졌습니다.")
                    lose += 1
                }
            }
            user == 2 -> {     //보
                if(com == 0){
                    println("졌습니다.")
                    lose += 1
                }else if(com == 1){
                    println("이겼습니다.")
                    win += 1
                }else{
                    println("무승부입니다.")
                    same += 1
                }
            }
        }
        println("종료하시려면 1번을 계속 하시려면 2번을 눌러주세요.")
        val replay = readLine()!!.toInt()
        if(replay == 1){
            println("${win}승 ${lose}패 ${same}무")
            break
        }
    }
    */

    //강사님 코드
    var userNum: Int
    var comNum: Int

    var win: Int
    var lose: Int
    var draw: Int
    var result: Int

    win = 0.also { draw = it }.also { lose = it }

    println("가위 바위 보 게임입니다.")
    println("start game >>>")
    while(true){
        // random
        comNum = (Math.random() * 3).toInt()    //0~2

        //user input
        print("가위(0) 바위(1) 보(2) = ")
        userNum = readLine()!!.toInt()

        /*
        //win 0
        if(userNum == 0 && comNum == 2){
            result = 0
        }else if (userNum == 1 && comNum == 0){
            result = 0
        }else if(userNum == 2 && comNum == 1){
            result = 0
        }*/

        /*
            com     user                    win
            2    -   0  + 2  = 4   %3   ->  1
            0    -   1  + 2  = 1   %3   ->  1
            1    -   2  + 2  = 1   %3   ->  1
                                            lose
            0    -   2  + 2  = 0   %3   ->  0
            1    -   0  + 2  = 3   %3   ->  0
            2    -   1  + 2  = 3   %3   ->  0
                                            draw
            0    -   0  + 2  = 2   %3   ->  2
            1    -   1  + 2  = 2   %3   ->  2
            2    -   2  + 2  = 2   %3   ->  2

         */
        result = (comNum - userNum + 2) % 3

        var resultMsg = ""
        when (result) {
            1 -> {
                resultMsg = "You win"
                win++
            }
            0 -> {
                resultMsg = "You lose"
                lose++
            }
            2 -> {
                resultMsg = "draw"
                draw++
            }
        }

        var userChar = ""
        var comChar = ""

        userChar = if (userNum == 0) "가위" else if (userNum == 1) "바위" else "보"
        comChar = if (comNum == 0) "가위" else if (comNum == 1) "바위" else "보"

        println("${resultMsg}으로 당신은 \"${userChar}\"이고 컴퓨터는 \"${comChar}\"입니다.")
        println("$win 승 $lose 패 $draw 무 입니다.")

        print("한 판 더? (y/n) = ")
        val msg = readLine()
        if (msg == "n" || msg == "N") {
            println("안녕히 가세요.")
            break
        }
        println("게임을 다시 시작합니다.")
    }
}

fun lotto(){
    var lottoNum = IntArray(6)
    for(i in 0..5){
        var num = (1..45).random()!!.toInt()
        while(true){
            if(num !in lottoNum){
                lottoNum[i] = num
                break
            }else{
                num = (1..45).random()!!.toInt()
            }
        }
    }
    println(lottoNum.contentToString())

}
