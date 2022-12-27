package com.episode6.gradlenow.androiddeploy

import android.content.Context

/**
 * This is a sample class
 */
class SampleClass(private val context: Context) {
  val hello: String get() = context.getString(R.string.hello_world)
}
