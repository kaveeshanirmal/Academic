@main def main(): Unit = {
  var volume: Double = findVol(5)
  println(s"Volume of a sphere with radius 5: $volume")
}

def findVol(r: Int): Double = {
  return 4/3*(math.Pi)*r*r*r
}
