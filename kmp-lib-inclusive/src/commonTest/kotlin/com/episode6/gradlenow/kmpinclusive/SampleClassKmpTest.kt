package com.episode6.gradlenow.kmpinclusive

import assertk.assertThat
import com.episode6.gradlenow.testsupport.isHelloWorld
import kotlin.test.Test

class SampleClassKmpTest {
  private val sample by lazy { SampleClass() }

  @Test fun testHelloWorld() {
    assertThat(sample.hello).isHelloWorld()
  }
}
