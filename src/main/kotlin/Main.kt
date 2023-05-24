import kotlin.properties.Delegates

fun main(args: Array<String>) {
    val strRau = "aaaabbccccccc"
    val strBun = strRau.asSequence().distinct().joinToString()
    println(strBun)
}