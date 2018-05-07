package org.scalapractices
package exercises
package ch2

object Ex4 extends App {

  class SyncVar[T] {

    private var empty: Boolean = ???

    private var x: T = ???

    def get(): T = ???

    def put(x: T): Unit = ???

    def isEmpty = ???

    def nonEmpty = ???

  }

  import org.learningconcurrency.ch2.thread

  val syncVar = ???

  val producer = ???

  val consumer = ???

//  producer.join()
//  consumer.join()



}
