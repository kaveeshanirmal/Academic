@main def main() = {
  val temp: Double = cToF(35)
  println(s"35C to Fahreneheit: $temp")
}
def cToF(tem: Int): Double = {
  return tem * 1.8000 + 32.00
}
