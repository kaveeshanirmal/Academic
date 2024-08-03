@main def main(): Unit = {
  val numList = List(3, 4, 11, 12, 13, 15, 17, 19, 20, 29, 31, 32)
  println(filterPrime(numList))
}
def filterPrime(numbers: List[Int]): List[Int] = {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else (2 until n).forall(x => n % x != 0)
  }
  
  numbers.filter(num => isPrime(num))
}
