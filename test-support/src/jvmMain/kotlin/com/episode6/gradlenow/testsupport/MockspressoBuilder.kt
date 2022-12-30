package com.episode6.gradlenow.testsupport

import com.episode6.mockspresso2.MockspressoBuilder
import com.episode6.mockspresso2.plugins.dagger2.dagger2LazySupport
import com.episode6.mockspresso2.plugins.dagger2.makeRealObjectsUsingDagger2Rules
import com.episode6.mockspresso2.plugins.javax.inject.javaxProviderSupport
import com.episode6.mockspresso2.plugins.junit5.junitExtension
import com.episode6.mockspresso2.plugins.mockk.fallbackWithMockk

fun MockspressoBuilder(): MockspressoBuilder = com.episode6.mockspresso2.MockspressoBuilder()
  .makeRealObjectsUsingDagger2Rules()
  .fallbackWithMockk()
  .dagger2LazySupport()
  .javaxProviderSupport()

fun MockspressoBuilder.buildExtension() = build().junitExtension()
