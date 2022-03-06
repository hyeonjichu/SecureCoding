fun main(args: Array<String>) {
    var cls = Person("길동","홍", 32)
    cls.firstName = "수길"
    println(cls.getFullName())

    val user = Human("abc123", "1004", "성춘향")
    println("${user.id}")
    println(user.name)
    user.password = "1234"
    println(user.password)

    val bird = Bird()
    bird.color = "red"
    println("${bird.color}")

    bird.fly()
    bird.sing("long")
}

class Person{
    var firstName:String
    var lastName:String
    var age:Int

    constructor(firstName:String, lastName:String, age:Int){
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    fun getFullName():String{
        return "$firstName $lastName $age"
    }
}

//DTO, VO
//data는 명시적인 것, 없어도 됨
data class Human(val id:String, var password:String, val name:String){
    fun getFullName():String{
        return "$id $password $name"
    }
}

class Bird{
    //property(속성)
    var name:String = "mybird"
    var wing:Int = 2
    var vol:String = "short"
    var color:String = "blue"

    fun fly() = println("fly wing: $wing")
    fun sing(vol:String) = println("sing vol: $vol")

}