package com.danceapp

import scala.scalajs.js

object JsScalaInteropUtils {
  /**
   * Converts an Undef to an Option including a null check
   * @param x
   * @tparam A
   * @return
   */
  def toNullSafeOption[A](x: js.UndefOr[A]): Option[A] = x.toOption.filter(_ != null)

  /**
   * Checks if a js/ts union type with a null(e.g. FBAccessToken | null) is actually null and convert into option
   * @param x
   * @tparam A
   * @return
   */
  def unionWithNullToOption[A](x: js.|[A, Null]):Option[A] = x match {
    case y if y == null => None
    case _ => Some(x.asInstanceOf[A])
  }
}
