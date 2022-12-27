package com.episode6.gradlenow.androiddeploy

import android.content.Context
import assertk.assertThat
import com.episode6.gradlenow.testsupport.MockspressoBuilder
import com.episode6.gradlenow.testsupport.buildExtension
import com.episode6.gradlenow.testsupport.isHelloWorld
import com.episode6.mockspresso2.plugins.core.makeRealObjectsUsingPrimaryConstructor
import com.episode6.mockspresso2.plugins.mockk.mockk
import com.episode6.mockspresso2.realImplementation
import io.mockk.every
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class SampleClassMockspressoTest {

  @RegisterExtension val mxo = MockspressoBuilder()
    .makeRealObjectsUsingPrimaryConstructor()
    .mockk<Context> {
      every { getString(R.string.hello_world) } returns "Hello World"
    }
    .buildExtension()

  private val sample: SampleClass by mxo.realImplementation()

  @Test fun testHelloWorld() {
    assertThat(sample.hello).isHelloWorld()
  }
}
