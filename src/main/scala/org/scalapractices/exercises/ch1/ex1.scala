package org.scalapractices
package exercises
package ch1

object Ex1a extends App {

  def compose[A, B, C](g: B => C, f: A => B): A => C = { x => g(f(x)) }

  def composeBuildInt[A, B, C](g: B => C, f: A => B): A => C = g compose f

  // ((3^2)*4) = 9 * 4 = 36
  println(compose({x:Double => x*4}, {y:Int => math.pow(y,2)})(3))

}

