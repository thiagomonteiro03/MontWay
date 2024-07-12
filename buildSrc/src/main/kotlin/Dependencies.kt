
object Dependencies {
    object Core {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.Core.KTX}"
        const val LIFECYLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.LIFECYLE_RUNTIME_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Core.APP_COMPAT}"
        const val SPLASHSCREEN = "androidx.core:core-splashscreen:${Versions.Core.SPLASHSCREEN}"
    }

    object Jetpack {

        object Compose {
            const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.Compose.ACTIVITY_COMPOSE}"
            const val COMPOSE_BOM = "androidx.compose:compose-bom:${Versions.Compose.COMPOSE_BOM}"
            const val UI = "androidx.compose.ui:ui"
            const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
            const val UI_TEXT = "androidx.compose.ui:ui-text"
            const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
            const val UI_TOOLING = "androidx.compose.ui:ui-tooling"
            const val UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
            const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
            const val MATERIAL3 = "androidx.compose.material3:material3"
            const val MATERIAL3_WINDOW_SIZE = "androidx.compose.material3:material3-window-size-class"
            const val MATERIAL_ICONS_EXTENDED = "androidx.compose.material:material-icons-extended"
            const val HILT_NAVIGATION = "androidx.hilt:hilt-navigation-compose:${Versions.Compose.HILT_COMPOSE_NAVIGATION}"
            const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.Compose.COMPOSE_NAVIGATION}"
            const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.Core.LIFECYLE_RUNTIME_KTX}"
            const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout-compose:${Versions.Compose.COMPOSE_CONSTRAINT_LAYOUT}"
        }

        const val ANDROIDX_STARTUP = "androidx.startup:startup-runtime:${Versions.ANDROIDX_STARTUP}"

        const val DATASTORE = "androidx.datastore:datastore:${Versions.DATASTORE}"
        const val DATASTORE_PREFERENCES = "androidx.datastore:datastore-preferences:${Versions.DATASTORE}"

        const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Core.LIFECYLE_RUNTIME_KTX}"

        object WorkManager {
            const val WORK_RUNTIME = "androidx.work:work-runtime:${Versions.WORKMANAGER}"
            const val WORK_RUNTIME_KTX = "androidx.work:work-runtime-ktx:${Versions.WORKMANAGER}"
            const val WORK_TESTING = "androidx.work:work-testing:${Versions.WORKMANAGER}"
        }

        object Room {
            const val ROOM_COMMON = "androidx.room:room-common:${Versions.ROOM}"
            const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
            const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
        }

    }

    object Google {

        const val GSON = "com.google.code.gson:gson:${Versions.GSON}"

        const val PLAY_SERVICES_LOCATION = "com.google.android.gms:play-services-location:${Versions.PLAY_SERVICES_LOCATION}"
        const val ROBOLECTRIC_PLAY_SERVICES = "org.robolectric:shadows-playservices:${Versions.ROBOLECTRIC}"

        object Accompanist {
            const val ADAPTIVE = "com.google.accompanist:accompanist-adaptive:${Versions.ACCOMPANIST}"
            const val PERMISSION = "com.google.accompanist:accompanist-permissions:${Versions.ACCOMPANIST}"
            const val SYSTEM_UI = "com.google.accompanist:accompanist-systemuicontroller:${Versions.ACCOMPANIST}"
            const val FLOW_LAYOUT = "com.google.accompanist:accompanist-flowlayout:${Versions.ACCOMPANIST}"
        }

        object Hilt {
            const val HILT_GRADLE_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
            const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
            const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
            const val HILT_ANDROID_TESTING = "com.google.dagger:hilt-android-testing:${Versions.HILT}"

            const val HILT_WORK_COMMON = "androidx.hilt:hilt-common:${Versions.ANDROIDX_HILT}"
            const val HILT_WORK = "androidx.hilt:hilt-work:${Versions.ANDROIDX_HILT}"
            const val ANDROIDX_HILT_COMPILER = "androidx.hilt:hilt-compiler:${Versions.ANDROIDX_HILT}"
        }

        const val EXOPLAYER_CORE = "com.google.android.exoplayer:exoplayer-core:${Versions.EXOPLAYER}"

        const val ML_KIT_BARCODE_SCANNING = "com.google.mlkit:barcode-scanning:${Versions.ML_KIT}"

        const val PROTOBUF_LITE = "com.google.protobuf:protobuf-javalite:${Versions.PROTOBUF_LITE}"
        const val PROTOBUF_PROTOC = "com.google.protobuf:protoc:${Versions.PROTOBUF_PROTOC}"
    }

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP}"
        const val MOCK_WEBSERVER = "com.squareup.okhttp3:mockwebserver:${Versions.OK_HTTP}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val CORE_KTX = "androidx.test:core-ktx:${Versions.ANDROIDX_TEST}"
        const val RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST_RUNNER}"
        const val RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST_RULES}"
        const val EXT_TRUTH = "androidx.test.ext:truth:${Versions.ANDROIDX_TEST}"
        const val EXT_JUNIT = "androidx.test.ext:junit-ktx:${Versions.ANDROIDX_EXT_JUNIT}"
        const val ROBOLECTRIC = "org.robolectric:robolectric:${Versions.ROBOLECTRIC}"
        const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES_TEST}"
        const val ROBOLECTRIC_SHADOWS = "org.robolectric:shadows-framework:${Versions.ROBOLECTRIC}"
        const val MOCKITO_CORE = "org.mockito:mockito-core:${Versions.MOCKITO}"
        const val MOCKITO_ANDROID = "org.mockito:mockito-android:${Versions.MOCKITO}"
        const val MOCKITO_KOTLIN = "org.mockito.kotlin:mockito-kotlin:${Versions.MOCKITO_KOTLIN}"
        const val ROOM = "androidx.room:room-testing:${Versions.ROOM}"
    }

}