fun main(args: Array<String>) {

    /*
    var person = Person("춘향", "성", 26)
    val lastName = person.lastName

    //private는 접근할 수 없음
    //person.age = person.age + 1
    println(person.toString())
    */
    val human = Human()
    human.method()
    //human.protectVar = 25  //=> public이 아니기 때문에 접근 불가
    human.interVar = 22

    val bird = Bird("나이팅게일",2, "blue")
    println(bird.toString())

    val mycls = MyClass()
    mycls.number = 234

    val base = Base("abc", "123", 24)
    println(base.toString())
    println()
    val base2 = Base("dfs", "456")
    println(base2.toString())

}

class Base(val id:String, val pwd:String, val age:Int){     //기본 생성자

    constructor(id:String, pwd:String) : this(id, pwd, 22){     //보조 생성자
        println("constructor($id:String, $pwd:String, $age:Int)")
    }

    override fun toString(): String {
        return "Base(id='$id', pwd='$pwd', age=$age)"
    }

}

class MyClass{
    var number:Int

    init{   //내부 초기화
        number = 123
        println(number)
    }
}

//contructor없이 아래처럼 사용 가능
//property 선언 + constructor
class Bird(var name: String, var wing: Int, val color: String){     //외부 초기화
//    var name:String
//    var wing:Int
//    var color:String
    var vol:Int = 23

//    constructor(name: String, wing: Int, color: String) {
//        this.name = name
//        this.wing = wing
//        this.color = color
//    }

    fun fly() = println("Fly Wing : $wing")

    override fun toString(): String {
        return "Bird(name='$name', wing=$wing, color='$color')"
    }

}

//접근 지정자
//객체는 private라도 접근 가능
//private class Person{

//상속 받으려면 앞에 open을 붙여야 함
open class Person{
    val firstName:String = ""
    val lastName:String = ""
    private var age:Int = 24

    //자식 클래스에서만 접근가능 => main에서 접근 불가
    protected var protectVar:Int = 12

    //같은 모듈?패키지?면 접근 가능 => main에서 접근 가능
    internal var interVar:Int = 20

//    constructor(firstName: String, lastName: String, age: Int) {
//        this.firstName = firstName
//        this.lastName = lastName
//        this.age = age
//    }

    //외부에서 접근 불가
    private fun privateFunc(){
    }

    override fun toString(): String {
        privateFunc()
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}

class Human : Person(){
    fun method(){
        protectVar = 23
        println(protectVar)

        interVar = 21
        println(interVar)
    }
}