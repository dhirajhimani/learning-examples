package org.scalapractices
package exercises
package ch2

import org.learningconcurrency._

import scala.collection.mutable

object Ex9 extends App {

  class PriorityTaskPool(val p:Int) {

    implicit val ord: Ordering[(Int,() => Unit)] = ???

    private val tasks = ???

    def asynchronous(priority: Int)(task: => Unit):Unit = ???

    class Worker extends Thread {

      setDaemon(true)

      def poll() = ???

      override def run() = ???
    }

    (1 to p).map((i) => new Worker()).map(_.start)

  }

  val tasks = new PriorityTaskPool(10)

  (1 to 100).foreach((i) => {
    val a = (Math.random*1000).toInt
    tasks.asynchronous(a)({log(s"<- $a")})
  })

  Thread.sleep(10000)

}
