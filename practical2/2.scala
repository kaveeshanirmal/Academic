@main def main(): Unit = {
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f
  var g = 2.0f

  b -= 1
  val exA = b + a + c * d     //--b*a+c*d--
  d -= 1
  println(exA);
  
  val exB = a                 //a++
  a += 1
  println(exB);

  val exC = (-2) * (g - k) + c    //-2*(g-k)+c
  println (exC);
  
  val exD = c                 //c = c++ 
  println (exD);

  c += 1
  val exE = c*a               //c = ++c * a++
  a += 1
  println (exE);
}

//24
//2
//8.6
//4
//18

