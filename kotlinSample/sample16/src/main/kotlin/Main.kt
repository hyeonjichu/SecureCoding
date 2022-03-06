fun main(args: Array<String>) {

    //Collection == 수집 ArrayList LinkedList HashMap TreeMap

    //추가, 삭제 불가능
    var numbers:List<Int> = listOf(1, 2, 3, 4, 5)
    for(n in numbers) print("$n ")
    println()

    var names:List<String> = listOf("one", "two", "three")
    for(name in names){
        println(name)
    }

    println(names.size)
    println(names.get(1))
    println(names[1])
    println(names.indexOf("three"))
    println(names.contains("two"))

    //여러가지 타입
    var mixedTypes = listOf("hello", 123, true, 123.456)
    for(m in mixedTypes){
        println(m)
    }

    //리스트만을 생성
    val emptyList = emptyList<String>()

    //null이 아닌 요소(element)만을 골라서 수집
    val nonNullList:List<Int> = listOfNotNull(2,34,5,6, null,62, null)
    println(nonNullList[4])

    //가변형 목록
    val strList:ArrayList<String> = arrayListOf<String>("hello", "world", "success")
    strList.add("kotlin")
    println(strList)

    //가변형 List
    val mutableListNames:MutableList<String> = mutableListOf<String>("kim", "lee", "chu")
    mutableListNames.add("park")
    println(mutableListNames)

    mutableListNames.removeAt(2)
    println(mutableListNames)

    mutableListNames[0] = "yoon"
    println(mutableListNames)

    val mutableListMix = mutableListOf("android", "react", 5, 6, true)
    println(mutableListMix)

    //가변형 리스트로 변경하고 싶은 경우
    val newNames = names.toMutableList()
    newNames.add("four")
    println(newNames)

    println()

    val fruits = listOf("apple", "banana", "kiwi")

    for(item in fruits){
        println(item)
    }

    //index와 같이 출력
    for(index in fruits.indices){
        println("fruits[$index] : ${fruits[index]}")
    }

    //while
    var index = 0
    while(index < fruits.size){
        println("fruits[$index] : ${fruits[index]}")
        index++
    }

    //index 검색, 찾기
    var findIdx = -1
    for(i in 0..fruits.size - 1 step(1)){
        if(fruits.get(i) === "banana"){
            findIdx = i
            break
        }
    }
    println("$findIdx ${fruits[findIdx]}")

    //object 관리
    val list:MutableList<Duck> = mutableListOf()

    val duck = Duck("오리 one", 2)

    list.add(duck)
    list.add(Duck("오리 two", 3))
    list.add(Duck("오리 three", 4))

    for(d in list){
        println(d.name)
    }

    //list -> array
    //https://codechacha.com/ko/kotlin-convert-list-to-array/
    //array -> list
}

class Duck(val name:String, val age:Int)

