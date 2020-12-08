package $organization$.$package$

import org.scalatest.funsuite.AnyFunSuite

final class HelloWorldSpec extends AnyFunSuite {
  test("A HelloWorld should do something") {
    assert ("Hello" + " World" === "Hello World")
  }
}

