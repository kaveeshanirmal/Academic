@main def main(): Unit = {
    print("Enter the deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()
    val interest = getInterest(deposit)
    println(s"Interest on deposit of $deposit is $interest")
}

def getInterest(deposit: Double): Double = deposit match{
    case deposit if deposit < 20000 => deposit * 0.02
    case deposit if deposit < 200000 => deposit * 0.04
    case deposit if deposit < 2000000 => deposit * 0.035
    case _ => deposit * 0.06
}