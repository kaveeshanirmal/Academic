import scala.io.StdIn.readLine

@main def main(): Unit = {
  val myList = List(75, 22, 8, 91, 43, 11, 60, 55)

  val sum = evenSum(myList)
  println(s"Sum: $sum") 
}

def evenSum(numList: List[Int]): Int = {
  var sum = 0;
  for (each <- numList)
  {
    if (each%2 == 0)
      sum += each
  }

  return sum
}
