# Gradle Now!

A quickstart repo. The idea is clone it, rename it, update the config and delete what you don't need.

module types to cover:
[] jvm 
[] jvm deployable
[] android-library
[] android-library deployable
[] android app (releasable)
[] kmp-library-inclusive
[] kmp-library-inclusive deployable
[] kmp-library-exclusive
[] kmp-library-exclusive deployable
[] jetpack compose desktop app (releasable?)
[] test-support module

- Deployable and releasable module types will depend on github secrets for signing. 
- Inclusive kmp library requires gradle prop for desired platform support
- Exclusive kmp library takes optional gradle prop for platforms to exclude (using the same platform support at kotlinx.coroutines)
- android and desktop apps will have some basic episode6 default dependencies and setup.
- test support will use junit5 and have a basic mockspresso2 setup
