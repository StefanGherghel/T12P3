import java.io.File
import kotlin.properties.Delegates
fun Char.CaesarReplace(offset: Int): Char
{

    if(! this.isWhitespace()) return this+offset
    else return this
}

fun readFileAsLinesUsingReadLines(fileName: String): List<String> = File(fileName).readLines()
fun main(args: Array<String>)
{
    val textCitit = readFileAsLinesUsingReadLines("data.txt")
    println(textCitit)

    var textChar = mutableListOf<Char>()
    textCitit.map{it.toCharArray()}.forEach{it.forEach { textChar.add(it.CaesarReplace(offset = 2) )}}
    val mesajCodat = textChar.toString().filter {it.isLetter()}

    println(mesajCodat)
}
//[acesta este un fisier care urmeaza sa fie codat cu cifrul Caesar cu offset dat]
// -> ceguvcguvgwphkukgtectgwtogccuchkgeqfcvewekhtwnEcguctewqhhugvfcv