fun Int.isPrimmmm(): Boolean{
    var div: Int = 2;
    while(div < this/2)
    {
        if(this%div==0)
            return false
        div++
    }
    return true
}


fun main(args: Array<String>) {
    val num1: Int = 17;
    val num2: Int = 18;
    println("Test1 extensie pe Int: ${num1.isPrimmmm()}")
    println("Test2 extensie pe Int: ${num2.isPrimmmm()}")
}