@main def main(): Unit = {
  var k, i, j = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  val exA =  k + 12 * m
  val exB = m / j
  val exC = n % j
  val exD = m / j * j
  val exE = f + 10*5 + g
  val exF = (i+1) * n

  println(s"k + 12 * m = $exA")
  println(s"m / j = $exB")
  println(s"n % j = $exC")
  println(s"m / j * j = $exD")
  println(s"f + 10*5 + g = $exE")
  println(s"++i * n = $exF")
}
