package org.scalapractices
package exercises
package ch2

import scala.collection.mutable._


object Ex6 extends App {

  class SyncQueue[T](val n:Int) {

    private var syncQueue = Queue[T]()

    def getWait():T = ???

    def putWait(x: T): Unit = ???
  }

  import org.learningconcurrency.ch2.thread

  val syncVar = new SyncQueue[Int](10)

  val producer = ???

  val consumer = ???

//  producer.join()
//  consumer.join()

}
