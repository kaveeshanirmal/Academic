@main def main(): Unit = {
  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach { name =>
  val formattedName = formatNames(name)(toUpper)
  println(formattedName)
  }

  println()

  names.foreach { name =>
  val formattedName = formatNames(name)(toLower)
  println(formattedName)
  }
}

def toUpper(str: String): String = {
    str.map {
      case a if a >= 'a' && a <= 'z' => (a-32).toChar
      case a => a
    }
}

def toLower(str: String): String = {
    str.map {
      case a if a >= 'A' && a <= 'Z' => (a+32).toChar
      case a => a
    } 
}

def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
}
