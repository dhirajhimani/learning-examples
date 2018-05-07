package org.scalapractices
package exercises
package ch2

import scala.collection.mutable

object Ex8 extends App {

  class PriorityTaskPool {

    implicit val ord: Ordering[(Int,() => Unit)] = ???

    private val tasks = ???

    def asynchronous(priority: Int)(task: => Unit):Unit = ???


    object Worker extends Thread {

      setDaemon(true)

      def poll() = ???

      override def run() = ???
    }

    Worker.start()

  }

  val tasks = new PriorityTaskPool

  (1 to 10).foreach((i) => {
    val a = (Math.random*1000).toInt
    tasks.asynchronous(a)({log(s"<- $a")})
  })

  Thread.sleep(10000)

}
