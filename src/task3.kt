class Cat(var name: String? = "") {
    fun Meow() { println("Meow!") }
}

fun main() {
    a()
    b()
    c()
    d()
}
fun a() {
    var myCats = arrayOf(Cat("Misty"),
        null,
        Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {

            print("${cat.name}: ")
            cat.Meow()
        }
    }
    println("----------------------------------")
}

class Cat2(var name: String? = null) {
    fun Meow() { println("Meow!") }
}
fun b() {
    var myCats = arrayOf(Cat2("Misty"),
        Cat2(null),
        Cat2("Socks"))
    for (cat in myCats) {
        print("${cat.name}: ")
        cat.Meow()
    }
    println("----------------------------------")
}

class Cat3(var name: String? = null) {
    fun Meow() { println("Meow!") }
}
fun c() {
    var myCats = arrayOf(Cat3("Misty"),
        null,
        Cat3("Socks"))
    for (cat in myCats) {
        print("${cat?.name}: ")
        cat?.Meow()
    }
    println("----------------------------------")
}

class Cat4(var name: String? = "") { // не работает потому что нужен тип с возможностью null
    fun Meow() { println("Meow!") }
}
fun d() {
    var myCats = arrayOf(Cat4("Misty"),
        Cat4(null),
        Cat4("Socks"))
    var asd = Cat4(null)
    println(asd.name)
    println(asd)
    for (cat in myCats) {

        if (cat != null) {
            print("${cat?.name}: ")
            cat?.Meow()
        }
    }
}