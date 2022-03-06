import dto.BatterDto
import dto.HumanDto
import java.io.File

fun main(args: Array<String>) {

    println("야구팀 관리 프로그램")

    val b = dao.BaseballDao()

    while(true){
        println("\n1. 선수 추가 2. 선수 삭제 3. 선수 검색 4. 선수 수정 5. 타율순서 출력 \n" +
                "6. 방어율 순서 7. 선수명단 저장 8. 선수명단 불러오기 9. 종료")
        print("번호를 선택해주세요. >> ")
        val input = readLine()!!.toInt()

        when(input){
            1 -> b.memberAdd()
            2 -> b.memberDel()
            3 -> b.memberSearch()
            4 -> b.memberUpdate()
            5 -> b.sortBatAvg()
            6 -> b.sortDefense()
            7 -> b.memberSave()
            8 -> b.memberAll()
            9 -> break
        }
    }
}