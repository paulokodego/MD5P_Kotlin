package practiceactivities

fun main(){
    var numbers = ArrayList<Int>()
    numbers.add(6)
    numbers.add(3)
    numbers.add(1)
    numbers.add(7)
    numbers.add(4)

    println(numbers)
    numbers.sort()

    println(numbers)

    println(numbers[0])
    println(numbers[numbers.size-1])
}