package $organization$.$package$

import org.scalatest.{Matchers, WordSpecLike}

final class $mainclass$Spec extends Matchers with WordSpecLike {

  "A $mainclass$" should {
    "do something" when {
      "used this way" in {
        ("Hello" + " World") should be ("Hello World")
      }
    }
  }
}

