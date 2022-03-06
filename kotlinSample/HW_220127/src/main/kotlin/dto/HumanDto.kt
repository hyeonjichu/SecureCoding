package dto

open class HumanDto {
    var number:Int
    var name:String
    var age:Int
    var height:Double
    var position:String

    constructor(number: Int, name: String, age: Int, height: Double, position:String) {
        this.number = number
        this.name = name
        this.age = age
        this.height = height
        this.position = position
    }

    override fun toString(): String {
        return "$number-$name-$age-$height-$position-"
    }
}