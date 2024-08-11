@main def main(): Unit = {
	print("Enter a numer: ")
	val num = scala.io.StdIn.readInt()

	matchCase(num)
}


def matchCase(x: Int): Any = x match {
	case a if a%3==0 && a%5==0 => println("Multiple of Both Three and Five")
	case b if b%3==0 => println("Multiple of Three")
	case c if c%5==0 => println("Multiple of Five")
	case _ => println("Not a Multiple of Three or Five")
}

