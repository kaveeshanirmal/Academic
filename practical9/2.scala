@main def main(): Unit = {
    print("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    input match {
        case input if input <= 0 => println("Negative/Zero is given")
        case input if input % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
    }
}