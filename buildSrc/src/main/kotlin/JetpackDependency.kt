import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.jetpack(block: JetpackDependencyScope.() -> Unit) {
    JetpackDependencyScope(this).block()
}

class JetpackDependencyScope(private val handler: DependencyHandler) {

    fun compose() = with(Dependencies.Jetpack.Compose) {
        handler.implementation(ACTIVITY_COMPOSE)
        handler.implementation(handler.platform(COMPOSE_BOM))
        handler.implementation(UI)
        handler.implementation(UI_TEXT)
        handler.implementation(UI_GRAPHICS)
        handler.implementation(UI_TOOLING_PREVIEW)
        handler.debugImplementation(UI_TOOLING)
        handler.debugImplementation(UI_TEST_MANIFEST)
        handler.implementation(MATERIAL3)
        handler.implementation(MATERIAL3_WINDOW_SIZE)
        handler.implementation(MATERIAL_ICONS_EXTENDED)
        handler.implementation(NAVIGATION)
        handler.implementation(LIFECYCLE_RUNTIME)
        handler.implementation(CONSTRAINT_LAYOUT)
    }

    fun lifecycleLiveData() = with(Dependencies.Jetpack) {
        handler.implementation(LIFECYCLE_LIVEDATA)
    }

    fun hiltNavigation() = handler.implementation(Dependencies.Jetpack.Compose.HILT_NAVIGATION)

    fun startup() = with(Dependencies.Jetpack) {
        handler.implementation(ANDROIDX_STARTUP)
    }

    fun workManager() = with(Dependencies.Jetpack.WorkManager) {
        handler.implementation(WORK_RUNTIME)
        handler.implementation(WORK_RUNTIME_KTX)
    }

    fun datastore() = with(Dependencies.Jetpack) {
        handler.implementation(DATASTORE)
        handler.google {
            protobuf()
        }
    }

    fun datastorePreferences() = with(Dependencies.Jetpack) {
        handler.implementation(DATASTORE_PREFERENCES)
    }

    fun room(useKsp: Boolean = true) = with(Dependencies.Jetpack.Room) {
        handler.implementation(ROOM_KTX)
        if (useKsp) {
            handler.kapt(ROOM_COMPILER)
        }
    }

    fun roomCommon() = with(Dependencies.Jetpack.Room) {
        handler.implementation(ROOM_COMMON)
    }

}