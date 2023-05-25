import kotlin.properties.Delegates

fun main(args: Array<String>) {
    val strRau = "aaaabbcccccccddd"
    val strAparitii = strRau.asSequence().groupingBy{ it }.eachCount().filter{ it.value >= 1}.toString().filter { it.isDigit() }
    val strFinal = strRau.groupBy { it }.values.toList().zip(strAparitii.toList()).toString().filter { it.isLetterOrDigit() }
    println("StrFinal: $strFinal")
    //println("strAparitii: $strAparitii")
}