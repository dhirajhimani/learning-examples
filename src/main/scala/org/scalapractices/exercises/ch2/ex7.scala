package org.scalapractices
package exercises
package ch2

import org.learningconcurrency.ch2._

object Ex7 extends App {

  import SynchronizedProtectedUid._

  class Account(val name: String, var money: Int) {
    val uid = getUniqueId()
  }

  def send(a1: Account, a2: Account, n: Int) = ???

  def sendAll(accounts: Set[Account], target: Account): Unit = ???

  val accounts = (1 to 100).map((i) => new Account(s"Account: $i",i*10)).toSet
  val target = new Account("Target account", 0)

  sendAll(accounts,target)

  accounts.foreach((a) => log(s"${a.name}, money = ${a.money}"))
  log(s"${target.name} - money = ${target.money}")

}
