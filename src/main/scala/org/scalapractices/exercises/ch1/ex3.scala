package org.scalapractices
package exercises
package ch1

object Ex3 extends App {

  def check2UsingBuiltIn[T](xs: Seq[T])(pred: T => Boolean): Boolean = {
    xs.exists(pred)
  }

  def check2[T](xs: Seq[T])(pred: T => Boolean): Boolean = {
    xs match {
      case x :: xs => if(pred(x)) check2(xs)(pred) else false
      case Nil => true
    }
  }

  println(check2UsingBuiltIn(List(2,4,6,8))(_%2==0))
  println(check2(List(2,4,6,8))(_%2==0))

}
