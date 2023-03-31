fun main(){
createpersonlist()
println(listOfheight())

println(indices(listOf("mercy","faith","cynthia","nancy")))

println()
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun indices(names:List<String>):List<String>{
    var evenList=mutableListOf<String>()
    names.forEachIndexed{index,n ->
        if (index%2 ==0)
            evenList.add(n)
    }
    return evenList
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun listOfheight() {
 val height = listOf(10,20,30,40)
        println(height.average())
    println(height.sum())
    }

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
//


data class personObject(val name:String,val age:Int,val height:Double,val weight:Double)

fun  createpersonlist(){

    val name=personObject("mercy",10,20.0,50.0)

    val name2=personObject("caren",50,70.0,80.0)



val data= listOf(name,name2)
    val sortedname=data.sortedBy { data->data.age }

println(sortedname)
}
//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

class data(val name: String,val age:Int,val height: Double,weight: Double)






//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list
class car(var registration:String,var mileage:Int){

    fun carobjects(lists:Int):Int{
        var motor1 = car("KKCB 235L", 20)
        var motor2 = car("KBBT 456U", 800)
        var motor3=car("KLLN 334M",300)
        val len = listOf(motor1, motor2, motor3)
        val word= (len.sumOf { x -> x.mileage } /3)
        return(mileage)
    }
}
