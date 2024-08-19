@main def main(): Unit = {
    def toUpper(name: String): String = name.toUpperCase
    def toLower(name: String): String = name.toLowerCase
    def formatNames(name: String)(format: String => String): String = format(name)
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(toLower))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(toUpper))
}