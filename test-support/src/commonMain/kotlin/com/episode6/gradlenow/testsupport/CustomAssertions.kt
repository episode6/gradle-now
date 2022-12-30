package com.episode6.gradlenow.testsupport

import assertk.Assert
import assertk.assertions.support.expected

fun Assert<String>.isHelloWorld() = given { actual ->
  if (actual == "Hello World") return@given
  expected("Hello World but was $actual")
}
