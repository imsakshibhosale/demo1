// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript{
    extra["version"] ="1.2.0"

    dependencies{
        classpath("com.google.relay:com.google.relay.gradle.plugin:0.3.10")
    }
}


plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.relay") version "0.3.10"
}