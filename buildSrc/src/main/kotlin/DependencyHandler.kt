import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(name: String) {
    add("implementation", name)
}

fun DependencyHandler.implementation(dependency: Dependency) {
    add("implementation", dependency)
}

fun DependencyHandler.testImplementation(name: String) {
    add("testImplementation", name)
}

fun DependencyHandler.debugImplementation(name: String) {
    add("debugImplementation", name)
}

fun DependencyHandler.kapt(name: String) {
//    throw Exception("Please, use 'ksp' instead of 'kapt'")
    add("kapt", name)
}

fun DependencyHandler.kaptTest(name: String) {
//    throw Exception("Please, use 'kspTest' instead of 'kaptTest'")
    add("kaptTest", name)
}

fun DependencyHandler.ksp(name: String) {
    add("ksp", name)
}

fun DependencyHandler.kspTest(name: String) {
    add("kspTest", name)
}