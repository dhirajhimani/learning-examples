package org.scalapractices
package exercises
package ch2

object Ex5 extends App {

  class SyncVar[T] {

    private var empty: Boolean = ???

    private var x: T = ???

    def isEmpty = ???

    def nonEmpty = ???

    def getWait():T = ???

    def putWait(x: T): Unit = ???


  }

  import org.learningconcurrency.ch2.thread

  val syncVar = ???

  val producer = ???

  val consumer = ???

//  producer.join()
//  consumer.join()

}
