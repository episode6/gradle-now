package com.episode6.gradlenow.app

import assertk.assertThat
import com.episode6.gradlenow.testsupport.isHelloWorld
import org.junit.jupiter.api.Test

class SampleClassMockspressoTest {

//  @RegisterExtension val mxo = MockspressoBuilder()
//    .makeRealObjectsUsingPrimaryConstructor()
//    .mockk<Context> {
//      every { getString(R.string.hello_world) } returns "Hello World"
//    }
//    .buildExtension()
//
//  private val sample: SampleClass by mxo.realImplementation()

  @Test fun testHelloWorld() {
    assertThat("Hello World").isHelloWorld()
  }
}
