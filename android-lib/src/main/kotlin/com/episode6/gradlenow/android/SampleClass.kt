package com.episode6.gradlenow.android

import android.content.Context

/**
 * This is a sample class
 */
class SampleClass(private val context: Context) {
  val hello: String get() = context.getString(R.string.hello_world)
}
