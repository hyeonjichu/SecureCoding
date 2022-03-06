package dto

class BatterDto(number: Int, name: String, age: Int, height: Double, position:String,
                var batCount:Int, var hit:Int, var batAvg:Double)
    :HumanDto(number, name, age, height, position) {

    override fun toString(): String {
        return super.toString() + "$batCount-$hit-$batAvg"
    }
}