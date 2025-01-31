package com.scalatrain.codecs

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class DecoderTests extends AnyFunSuite with ScalaCheckPropertyChecks with Matchers {
  test("Some test") {
    forAll { str: String =>
      str should be(str)
    }
  }
}
