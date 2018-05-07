package org

package object scalapractices {

  def log(msg: String) {
    println(s"${Thread.currentThread.getName}: $msg")
  }

}

