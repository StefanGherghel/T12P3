import java.lang.Math.abs
import java.lang.Math.pow
import kotlin.math.sqrt

fun main(args: Array<String>)
{
    print("Nr puncte: ")
    val nrPuncte: Int = readln().toInt()
    var puncte = List(nrPuncte){
        print("coordonate punct: ")
        readln().toInt() to readln().toInt()
    }
    println(puncte)
    var temp = puncte.zipWithNext()
    var perim: Double = 0.0
    perim += sqrt(pow(abs(temp.first().first.first.toDouble() - temp.last().second.first.toDouble()),2.0)+pow(abs(temp.first().first.second.toDouble() - temp.last().second.second.toDouble()),2.0))
    temp.forEach{perim += sqrt(pow(abs(it.first.first.toDouble() - it.second.first.toDouble()),2.0)+pow(abs(it.first.second.toDouble() - it.second.second.toDouble()),2.0)) }
    println(temp)
    println("Perimetrul este: $perim")
}
