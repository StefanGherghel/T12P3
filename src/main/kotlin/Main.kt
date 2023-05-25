import kotlin.properties.Delegates

fun main(args: Array<String>) {
    var listaMea = listOf(1, 21, 75, 39, 7, 2, 35, 3, 31, 7, 8)

    listaMea = listaMea.filter { it > 5 }
    println( listaMea )                                                                 // a)

    var listaMea2 = listaMea.zipWithNext().filterIndexed { index, pair -> index%2 == 0  }
    println( listaMea2 )                                                                //b)

    var listaMea3 = listaMea2.map{it.first*it.second}
    println( listaMea3 )                                                                //c)

    var listaMea4 = listaMea3.sum()                                                 //d)
    listaMea3.forEach{print("+ $it ")}
    println("= "+listaMea4)
}