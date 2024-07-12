import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.google(block: GoogleDependencyScope.() -> Unit) {
    GoogleDependencyScope(this).block()
}

class GoogleDependencyScope(private val handler: DependencyHandler) {

    fun gson() = handler.implementation(Dependencies.Google.GSON)

    fun playServicesLocation() = handler.implementation(Dependencies.Google.PLAY_SERVICES_LOCATION)

    fun accompanist() = with(Dependencies.Google.Accompanist) {
        handler.implementation(ADAPTIVE)
        handler.implementation(PERMISSION)
        handler.implementation(SYSTEM_UI)
        handler.implementation(FLOW_LAYOUT)
    }

    fun hilt() = with(Dependencies.Google.Hilt) {
        handler.implementation(HILT_ANDROID)
        handler.kapt(HILT_COMPILER)

        handler.implementation(HILT_WORK_COMMON)
        handler.implementation(HILT_WORK)
        handler.kapt(ANDROIDX_HILT_COMPILER)
    }

    fun exoplayer() = handler.implementation(Dependencies.Google.EXOPLAYER_CORE)

    fun barcodeScanning() = handler.implementation(Dependencies.Google.ML_KIT_BARCODE_SCANNING)

    fun protobuf() = handler.implementation(Dependencies.Google.PROTOBUF_LITE)

}