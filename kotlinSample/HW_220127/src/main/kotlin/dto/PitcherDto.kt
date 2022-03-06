package dto

class PitcherDto(number: Int, name: String, age: Int, height: Double, position:String,
                 var win:Int, var lose:Int, var defense:Double)
    :HumanDto(number, name, age, height, position) {

    override fun toString(): String {
        return super.toString() + "$win-$lose-$defense"
    }
}