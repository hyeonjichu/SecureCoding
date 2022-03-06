package dao
import dto.PitcherDto
import dto.BatterDto
import dto.HumanDto
import java.io.File

class BaseballDao() {
    val curMember:MutableList<String>
    val path = "C:\\myfile\\BaseballMemer.txt"
    val memberList:MutableList<HumanDto> = mutableListOf<HumanDto>()
    init{
        val bufferReader = File(path).bufferedReader()
        curMember = mutableListOf<String>()
        bufferReader.useLines { lines -> lines.forEach { curMember.add(it) } }
        for(i in curMember){
            val tmp = i.split("-")
            val mem = BatterDto(tmp[0].toInt(), tmp[1], tmp[2].toInt(), tmp[3].toDouble(), tmp[4], tmp[5].toInt(), tmp[6].toInt(), tmp[7].toDouble())
            memberList.add(mem)
        }
    }

    fun memberAdd(){
        println("1. Pitcher 2. Batter")
        print("번호를 선택해주세요. >>")
        val num = readLine()!!.toInt()
        print("번호 = ")
        val number = readLine()!!.toInt()
        print("이름 = ")
        val name:String? = readLine()
        print("나이 = ")
        val age = readLine()!!.toInt()
        print("신장 = ")
        val height = readLine()!!.toDouble()
        if(num == 1){
            val position = "pitcher"
            print("승 = ")
            val win = readLine()!!.toInt()
            print("패 = ")
            val lose = readLine()!!.toInt()
            val defense:Double = (win.toDouble()/(win+lose))
            val newMember = PitcherDto(number, name!!, age, height, position, win, lose, defense)
            memberList.add(newMember)
            //File(path).appendText(newMember.toString()+"\n")
        }else if(num == 2){
            val position = "batter"
            print("타수 = ")
            val batCount = readLine()!!.toInt()
            print("안타 수 = ")
            val hit = readLine()!!.toInt()
            val batAvg = (hit.toDouble()/batCount)
            val newMember = BatterDto(number, name!!, age, height, position, batCount, hit, batAvg)
            memberList.add(newMember)
            //File(path).appendText(newMember.toString()+"\n")

            // instanceof -> 부모클래스의 객체 판별
        }
    }
    fun memberDel(){
        println("BaseballDao memberDel")
        print("삭제할 선수의 번호를 입력하세요. >>")
        val num = readLine()!!.toInt()
        var idx:Int = -1
        for(i in 0..memberList.size-1){
            if(memberList[i].number == num){
                idx = i
                break
            }
        }
        if(idx != -1){
            memberList.removeAt(idx)
        }else{
            println("번호를 잘못 입력하셨습니다.")
        }
        memberList.forEach{println(it)}
        println("저장해주세요.")
    }
    fun memberSearch(){
        println("BaseballDao memberSearch")
        print("검색할 선수의 번호를 입력하세요. >>")
        val num = readLine()!!.toInt()
        var idx:Int = -1
        for(i in 0..memberList.size-1){
            if(memberList[i].number == num){
                idx = i
                break
            }
        }
        if(idx != -1){
            println(memberList[idx])
        }else{
            println("번호를 잘못 입력하셨습니다.")
        }
    }
    fun memberUpdate(){
        println("BaseballDao memberUpdate")
        print("수정할 선수의 번호를 입력하세요. >>")
        val num = readLine()!!.toInt()
        var idx:Int = -1
        for(i in 0 until memberList.size){
            if(memberList[i].number == num){
                idx = i
                break
            }
        }
        if(idx != -1){
            println("1. 이름 2. 나이 3. 신장 4. 승/타수 5. 패/안타수")
            val num = readLine()!!.toInt()
            when(num){
                1 -> {
                    print("이름을 입력하세요. >>")
                    val tmp = readLine()
                    memberList[idx].name = tmp!!
                }
                2 -> {
                    print("나이를 입력하세요. >>")
                    val tmp = readLine()!!.toInt()
                    memberList[idx].age = tmp
                }
                3 -> {
                    print("신장을 입력하세요. >>")
                    val tmp = readLine()!!.toDouble()
                    memberList[idx].height = tmp
                }
                4 -> {
                    if(memberList[idx].position === "pitcher"){
                        print("몇 승인지 입력하세요. >>")
                        val tmp = readLine()!!.toInt()
                        // memberList[idx].win = tmp            instanceof  == is
                        val obj = memberList[idx]
                        if(obj is PitcherDto){
                            obj.win = tmp
                            obj.defense = (obj.win.toDouble()/(obj.win + obj.lose))
                        }
                    }else{
                        print("타수인지 입력하세요. >>")
                        val tmp = readLine()!!.toInt()
                        val obj = memberList[idx]
                        if(obj is BatterDto){
                            obj.batCount = tmp
                            obj.batAvg = (obj.hit.toDouble()/obj.batCount)
                        }
                    }
                }
                5 -> {
                    if(memberList[idx].position === "pitcher"){
                        print("몇 패인지 입력하세요. >>")
                        val tmp = readLine()!!.toInt()
                        val obj = memberList[idx]
                        if(obj is PitcherDto){
                            obj.lose = tmp
                            obj.defense = (obj.win.toDouble()/(obj.win + obj.lose))
                        }
                    }else{
                        print("안타수를 입력하세요. >>")
                        val tmp = readLine()!!.toInt()
                        val obj = memberList[idx]
                        if(obj is BatterDto){
                            obj.hit = tmp
                            obj.batAvg = (obj.hit.toDouble()/obj.batCount)
                        }
                    }
                }
            }

        }else{
            println("번호를 잘못 입력하셨습니다.")
        }
        memberList.forEach{println(it)}
    }
    fun sortBatAvg(){
        println("BaseballDao sortBatAvg")

        val sortBatList:MutableList<BatterDto> = mutableListOf<BatterDto>()
        for(i in memberList){
            if(i.position == "batter"){
                sortBatList.add(i as BatterDto)
            }
        }
        println(sortBatList.sortedByDescending { it.batAvg })


        /* // 강사님 코드
        val sortList:List<BatterDto>? = memberList?.filterIsInstance<BatterDto>

        if(sortList != null){
            for(h in sortList){
                println(h.toString())
            }
        }

        val sorted = sortList?.sortedByDescending { it -> it.batAvg }
        for(h in sorted!!){
            println(h.toString())
        }
        */

        //kotlin
        /*
        val sortList:List<BatterDto>? = memberList?.filterIsInstance<BatterDto>()?.sortedByDescending { it -> it.batAvg }
        if(sortList != null){
            for(h in sortList){
                println(h.toString())
            }
        }
        */
    }
    fun sortDefense(){
        println("BaseballDao sortDefense")
        val sortPitList:MutableList<PitcherDto> = mutableListOf<PitcherDto>()
        for(i in memberList){
            if(i.position == "pitcher"){
                println(i)
                /*if(i is PitcherDto){
                    sortPitList.add(i)
                }*/
                sortPitList.add(i as PitcherDto)
            }
        }
        println("ddd $sortPitList")
        println(sortPitList.sortedByDescending { it.defense })

        /*
        val sortList:List<PitcherDto>? = memberList?.filterIsInstance<PitcherDto>()?.sortedByDescending { it -> it.defense }
        if(sortList != null){
            for(h in sortList){
                println(h.toString())
            }
        }
        */
    }
    fun memberSave(){
        println("BaseballDao memberSave")
        File(path).bufferedWriter().use{ it.write("") }
        for(i in memberList){
            File(path).appendText(i.toString() +"\n")
        }
    }
    fun memberAll(){
        println("BaseballDao memberAll")
        memberList.forEach{println(it)}
    }
}