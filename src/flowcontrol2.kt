fun main(){

 var name=fruits("watermelon")
    println(name[0])
    println(name[2])
    println(name[4])
    println(name[6])
    println(name[8])

    println(isEven(6))
    println(isEven(1))

    var d=student(arrayOf("Grace","Edna","Mary","Catherine"))
    println(d)

    var s=Person("Gracew",34,678,"groceries")
        s.dinner()
}
fun isEven(num:Int):Boolean {
        if (num % 2 == 0) {
            return true
        }
        else {


     return false
        }
    }
data class Person (var name: String,var weight:Int,var price:Int,var category: String){
      fun dinner() {
          when (category) {
              "groceries"-> println(listOf("carrots","tomatoes","cucumbers"))
              "hygiene"-> println("sparkling clean")
              else->{
                  println("offers the best prices")

              }



          }
          }
      }

fun fruits(name: String): String {
    return name}

fun student(names:Array<String>):Int {
    var best = 0
    for (students in names)
        if (students.length<=4) {
            best+=1
        }
        return best
    }

