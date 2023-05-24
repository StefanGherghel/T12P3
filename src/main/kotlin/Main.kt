
fun main(args: Array<String>) {
    var mapaMea= mapOf(1 to "abc", 2 to "def", 3 to "ghi");
    var mapaMeaNoua = mapaMea.map { (k, v) -> v to k }
    print(mapaMeaNoua)
}