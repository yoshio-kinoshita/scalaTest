object Match {
  def main(args: Array[String]) {
    val x = 10
    x match {
      case 1 => println("x is 1")
      case 10 => println("x is 10")
      case _ => println("x is other number")
    }
  }
}