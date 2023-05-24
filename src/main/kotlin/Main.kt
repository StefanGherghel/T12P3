import java.time.LocalDate
import java.util.Date
import java.util.Formatter
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

fun String.strToDate(format: DateTimeFormatter): LocalDate
{
    return LocalDate.parse(this, format)
}


fun main(args: Array<String>) {
    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val date: String = "12-09-1980"
    println(date.strToDate(formatter).toString())
}