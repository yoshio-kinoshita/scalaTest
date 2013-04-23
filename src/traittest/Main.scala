package traittest

object Main {
  def main(args: Array[String]) {
    val p = new Person("taro")
    p.coding
    
    val p2 = new Person("taro") with Designer
    
    p2.coding
    p2.design
    
    val p3 = new Person("trao") with ProjectManager
    
    val p4 = new Person2
    p4.work(60)
  }
}