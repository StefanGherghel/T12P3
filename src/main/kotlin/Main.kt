import kotlin.properties.Delegates

fun isPrimm(x: Int): Boolean
{
    var div = 2
    while(div < x/2)
        if(x % (div++)==0)
            return false
    return true
}
fun main(args: Array<String>) {
    var Prim: Int by Delegates.vetoable(5) { property, oldValue, newValue -> isPrimm(newValue) }

    println(Prim)

    Prim = 6
    println(Prim)

    Prim = 7
    println(Prim)

}