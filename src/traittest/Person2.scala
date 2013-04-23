package traittest

class Person2 extends Engineer {

  println("class Person2 constructor")

  def work(time: Int) = {
    println("Person2#work")
    println("1つのタスクを" + time + "分で行います")
    println("Person2#work end")
  }

}