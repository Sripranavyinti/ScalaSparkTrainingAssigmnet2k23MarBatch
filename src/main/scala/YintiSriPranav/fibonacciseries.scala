package YintiSriPranav

import scala.annotation._
object Fibonacci extends App{
  def fibonacci(n:Int): Int = {
    @tailrec
    def fibonacciseries(n:Int, curr:Int, next:Int):Int = {
      if(n<=1) curr
      else fibonacciseries(n-1,next,curr+next)
    }
    fibonacciseries(n,0,1)
  }

  println("enter the n value")
  val n = scala.io.StdIn.readInt()
  println("The nth number in the fibonacci series")
  println(fibonacci(n))
}