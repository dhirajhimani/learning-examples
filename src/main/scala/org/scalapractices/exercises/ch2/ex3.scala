package org.scalapractices
package exercises
package ch2

object Ex3 extends App {

  class SyncVar[T] {

    private var empty:Boolean = ???

    private var x:T = ???

    def get(): T = ???

    def put(x: T):Unit = ???

  }

}
