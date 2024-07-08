@main def main(): Unit = {
  print("Enter number: ")
  val num = scala.io.StdIn.readInt()
  patternMatch(num)
}

def patternMatch(x: Int): Any = x match {
  case a if a <= 0 => println("Negative/Zero")
  case b if b % 2 == 0 => println("Even number is given")
  case _ => println("Odd number is given")
}
