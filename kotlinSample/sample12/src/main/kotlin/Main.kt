fun main(args: Array<String>) {

    val base = Base("길동", "홍", 24)
    base.firstname = "진호"

    println(base.fullName)  //get

    val child = Child("춘향", "성", 22, "서울시")
    println(child.lastname)
    println(child.fullName)

    val parrot = Parrot("나이팅게일", 2, "blue", 4)
    println("parrot.toString "+parrot.toString())
    println("parrot.allData() "+parrot.allData())

    val cal = Calc()
    println(cal.add(3, 4))
    println(cal.add(3.54, 4.12))
    println(cal.add(3, 4, 7))
    println(cal.add(3.54, 4.12, 6.25))

}

class Calc{
    //overload
    fun add(x:Int, y:Int) : Int = x + y
    fun add(x:Double, y:Double) : Double = x + y
    fun add(x:Int, y:Int, z:Int) : Int = x + y + z
    fun add(x:Double, y:Double, z:Double) : Double = x + y + z

}


open class Bird(var name:String, var wing:Int, var color:String){
    fun fly() = println("Fly wing: $wing")

    override fun toString(): String {
        return "Bird(name='$name', wing=$wing, color='$color')"
    }

    open fun allData() = print("Bird allData = $name $wing $color ")
}

class Lark(name:String, wing:Int, color:String) : Bird(name, wing, color){
    fun singHitOne() = println("짹짹")
}

class Parrot : Bird{
    var vol:Int = 0

    constructor(name:String, wing:Int, color:String, vol:Int):super(name, wing, color){
        this.vol = vol
    }

    override fun toString(): String {
        return super.toString() + "Parrot(vol=$vol)"
    }

    override fun allData(){
        super.allData()
        println("$vol")
    }
}


open class Base(var firstname:String = "길동", val lastname:String = "홍", var age:Int = 24){
/*class Base{
    var firstname:String
    val lastname:String
    var age:Int

    constructor(firstname:String, lastname:String, age:Int){
        this.firstname = firstname
        this.lastname = lastname
        this.age = age

    }*/

    //open이 있어야 상속 가능
    open val fullName:String
        get() = "$firstname $lastname"
}

class Child(firstname:String, lastname:String, age:Int, var address:String) : Base(firstname, lastname, age){

    override val fullName:String
        get() = "$firstname $age $address"
}