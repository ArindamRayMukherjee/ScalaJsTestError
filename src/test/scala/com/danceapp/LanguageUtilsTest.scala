package com.danceapp

import org.scalatest.freespec.AnyFreeSpec

class LanguageUtilsTest extends AnyFreeSpec {
  "test" in {
    assert(JsScalaInteropUtils.unionWithNullToOption(null).isEmpty)
  }
}
