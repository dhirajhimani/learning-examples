package org.scalapractices
package exercises
package ch1

object Ex2 extends App {

  def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    a.flatMap(aa => b.map(bb => (aa,bb)))
  }

  def fuseUsingFor[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    for {
      aVal <- a
      bVal <- b
    } yield (aVal, bVal)
  }

  println(fuse(Some(1), Some(2)))
  println(fuse(None, Some(2)))

  println(fuseUsingFor(Some(1), Some(2)))
  println(fuseUsingFor(None, Some(2)))
}
