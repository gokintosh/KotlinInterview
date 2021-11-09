package algoanddatastructures.KSL

fun main() {
    val a=5
    val b=12
    var max=-1

    if(a>b){
        max=a
    }else{
        max=b
    }

    println("The max value is $max")


//    when statement

    val groupSize=8

    when(groupSize){
        1-> println("Single guy")
        2-> println("this guy got a pair")
        3-> println("this guy got two other friends")
        else-> println("this is either nobody or a big crowd")
    }


}