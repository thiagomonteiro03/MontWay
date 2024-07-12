import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.core() = with(Dependencies.Core) {
    implementation(CORE_KTX)
    implementation(LIFECYLE_RUNTIME_KTX)
    implementation(APP_COMPAT)
    implementation(SPLASHSCREEN)
}

fun DependencyHandler.retrofit() = with(Dependencies.Retrofit) {
    implementation(RETROFIT)
    implementation(GSON_CONVERTER)
    implementation(LOGGING_INTERCEPTOR)
}

