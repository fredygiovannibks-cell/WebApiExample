plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "id.ac.polbeng.depandienda.webapiexample"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "id.ac.polbeng.depandienda.webapiexample"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    // Tambahkan block buildFeatures untuk viewBinding di sini
    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

    // Tambahkan dependency library LoopJ di sini
    implementation(libs.android.async.http)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}