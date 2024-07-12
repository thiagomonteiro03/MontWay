import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.test(block: TestDependencyScope.() -> Unit) =
    TestDependencyScope(this).block()

class TestDependencyScope(private val handler: DependencyHandler) {

    fun core() = with(Dependencies.Test) {
        handler.testImplementation(JUNIT)
        handler.testImplementation(CORE_KTX)
        handler.testImplementation(RUNNER)
        handler.testImplementation(EXT_TRUTH)
        handler.testImplementation(EXT_JUNIT)
        handler.testImplementation(COROUTINES_TEST)
    }

    fun robolectric() = with(Dependencies.Test) {
        handler.testImplementation(ROBOLECTRIC)
        handler.testImplementation(ROBOLECTRIC_SHADOWS)
    }

    fun robolectricPlayServices() = with(Dependencies.Google) {
        handler.testImplementation(ROBOLECTRIC_PLAY_SERVICES)
    }

    fun hilt() = with(Dependencies.Google.Hilt) {
        handler.testImplementation(HILT_ANDROID_TESTING)
        handler.kaptTest(HILT_COMPILER)
    }

    fun retrofit() = with(Dependencies.Retrofit) {
        handler.testImplementation(MOCK_WEBSERVER)
    }

    fun workManager() = with(Dependencies.Jetpack.WorkManager) {
        handler.testImplementation(WORK_TESTING)
    }

    fun mockito() = with(Dependencies.Test) {
        handler.testImplementation(MOCKITO_CORE)
        handler.testImplementation(MOCKITO_KOTLIN)
    }

    fun room() {
        handler.testImplementation(Dependencies.Jetpack.Room.ROOM_KTX)
        handler.testImplementation(Dependencies.Test.ROOM)
        handler.kaptTest(Dependencies.Jetpack.Room.ROOM_COMPILER)
    }

}
