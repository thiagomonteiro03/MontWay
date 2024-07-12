import com.google.protobuf.gradle.id

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("com.google.protobuf")
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

android {
    namespace = Configs.NAMESPACE
    compileSdk = Configs.COMPILE_SDK

    defaultConfig {
        applicationId = Configs.APPLICATION_ID
        minSdk = Configs.MIN_SDK
        targetSdk = Configs.TARGET_SDK
        versionCode = Configs.VERSION_CODE
        versionName = Configs.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Configs.SOURCE_COMPATIBILITY
        targetCompatibility = Configs.TARGET_COMPATIBILITY
    }
    kotlinOptions {
        jvmTarget = Configs.JVM_TARGET
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    core()
    retrofit()

    jetpack {
        compose()
        hiltNavigation()
        startup()
        room()
        datastore()
        datastorePreferences()
        workManager()
        lifecycleLiveData()
    }

    google {
        gson()
        accompanist()
        playServicesLocation()
        hilt()
    }

    test {
        core()
        hilt()
        retrofit()
        robolectric()
        workManager()
        mockito()
    }
}

protobuf {
    protoc {
        artifact = Dependencies.Google.PROTOBUF_PROTOC
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                id("java") {
                    option("lite")
                }
            }
        }
    }
}