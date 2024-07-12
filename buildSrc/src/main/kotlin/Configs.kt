import org.gradle.api.JavaVersion

object Configs {
    const val MIN_SDK = 28
    const val COMPILE_SDK = 34
    const val TARGET_SDK = 34
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val NAMESPACE = "com.montway.start"
    const val APPLICATION_ID = "com.montway.start"
    const val JVM_TARGET = "1.8"
    val SOURCE_COMPATIBILITY = JavaVersion.VERSION_1_8
    val TARGET_COMPATIBILITY = JavaVersion.VERSION_1_8
}