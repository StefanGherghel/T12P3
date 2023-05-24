import kotlin.properties.Delegates

fun main(args: Array<String>) {
    println("de cate ori sa apara fiecare numar in lista?: ")
    val n = readln().toInt()
    val listaMea = listOf(1,2,3,4)
    val listaMeaNoua = listaMea.flatMap { var l = mutableListOf(it); for ( i in 1..n-1) l.add(it); l}
    println(listaMeaNoua)
}