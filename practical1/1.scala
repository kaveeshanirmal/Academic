@main def main() = {
  val r = area(5)
  println(s"Area of a disk with radius 5:  $r")
}

def area(r:Int): Double= {
  return math.Pi*r*r
}

