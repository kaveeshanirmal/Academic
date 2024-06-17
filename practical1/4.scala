@main def main(): Unit = {
  val totalPrice: Double = totalCost(24.95, 60)
  println(s"Total cost for 60 copies: $totalPrice")
}

def discount(price: Double): Double = {
  return price*0.4
}

def shippingCost(count: Int): Double = {
  if (count<50)
  {
    return 3
  }
  else
  {
    return 3+(count-50)*0.75
  }
}

def totalCost(price: Double, count: Int): Double = {
  return (price - discount(price))*60 + shippingCost(count)
}
