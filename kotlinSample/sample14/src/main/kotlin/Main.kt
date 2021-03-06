fun main(args: Array<String>) {

    val master = Master()
    val dog = Dog("누렁이", "small")
    master.playWithPet(dog)

    val cat = Cat("야옹이", "big")
    master.playWithPet(cat)

    val car = Car("BMW", "100hp")
    car.startEngine()
    car.stopEngine()
}

open class Animal(val name:String)

interface Pet{
    var category:String
    val msgTags:String
        get() = "I love my pet!"

    var species:String
    fun feeding()
    fun patting(){
        println("keep patting")
    }
}

class Cat(name:String, override var category: String) : Pet, Animal(name){
    override var species: String = "cat"

    override fun feeding() {
        println("Feeding Cat")
        println("Cat name: $name, category: $category")
    }
}

class Dog(name:String, override var category: String) : Pet, Animal(name){
    override var species: String = "dog"

    override fun feeding() {
        println("Feeding dog")
        println("dog name: $name, category: $category")
    }
}

class Master {
//    fun playWithPet(dog:Dog){
//    }
//    fun playWithPet(cat:Cat){
//    }

    fun playWithPet(pet:Pet){
        println(pet.species)
        pet.feeding()
    }
}

//composition(합성) - class 안에서 class 사용
//Controller <- Service <- Dao
class Car(val name:String, val power:String){
    private var engine = Engine(power)
    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String){
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}