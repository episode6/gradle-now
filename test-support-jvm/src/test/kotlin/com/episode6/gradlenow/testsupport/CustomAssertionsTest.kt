package com.episode6.gradlenow.testsupport

import assertk.assertThat
import assertk.assertions.isFailure
import org.junit.jupiter.api.Test

class CustomAssertionsTest {

  @Test fun testHelloWorld_pass() {
    val input = "Hello World"

    assertThat(input).isHelloWorld()
  }

  @Test fun testHelloWorld_fail() {
    val input = "Hello World, NOT!"

    assertThat {
      assertThat(input).isHelloWorld()
    }.isFailure()
  }
}
