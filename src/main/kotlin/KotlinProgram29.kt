fun main(){
    val matrix = mutableListOf(
        mutableListOf<Int>(0,0,0),
        mutableListOf<Int>(0,0,0),
        mutableListOf<Int>(0,0,0),
    )
    var row = 0
    //0 -3
    while(row < 3){
        var column = 0
        while(column < 3){
            println("Enter number")
            matrix[row][column] = readln().toInt()
            column++
        }
        row++
        println()
    }

    row = 0
    while(row < matrix.size){
        var column = 0
        while(column < matrix[row].size ){
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
    }

}