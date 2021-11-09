package algoanddatastructures.KSL

data class Car(val name:String,var doors:Int=4){
    fun drive(){
        println("$name is driving")
    }
}

fun main() {
    var car:Car?=null

//    car=Car("Mercedes Benz")
    car?.drive()

//    car!!.drive()    !!!!!throws an NPE

    val realCar:Car=car?:Car("McLaren")
    realCar.drive()
}