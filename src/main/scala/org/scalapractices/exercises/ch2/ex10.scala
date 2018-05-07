package org.scalapractices
package exercises
package ch2

import scala.collection.mutable

object Ex10 extends App {

  class PriorityTaskPool(val p:Int, val important: Int) {

    implicit val ord: Ordering[(Int,() => Unit)] = ???

    private val tasks = ???

    @volatile
    private var terminated = false

    def asynchronous(priority: Int)(task: => Unit):Unit = ???

    class Worker extends Thread {

      def poll() = ???

      override def run() = ???
    }

    def shutdown() = ???

    (1 to p).map((i) => new Worker()).map(_.start)

  }

  val tasks = new PriorityTaskPool(10, 300)

  (1 to 1000).foreach((i) => {
    val a = (Math.random*1000).toInt
    tasks.asynchronous(a)({log(s"<- $a")})
  })

  Thread.sleep(1)
  tasks.shutdown()

}
