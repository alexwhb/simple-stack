plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.zhuinden.simplestackexamplekotlinfragment"
        minSdkVersion(16)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    //implementation(mapOf("dir" to "libs", "include" to listOf("*.jar")))
    implementation(project(":simple-stack"))

    implementation("com.github.Zhuinden.simple-stack-extensions:fragments:2.0.0") {
        exclude(module = "simple-stack") // only needed because of jitpack vs local
    }
    implementation("com.github.Zhuinden.simple-stack-extensions:fragments-ktx:2.0.0") {
        exclude(module = "simple-stack") // only needed because of jitpack vs local
    }
    implementation("com.github.Zhuinden.simple-stack-extensions:navigator-ktx:2.0.0") {
        exclude(module = "simple-stack") // only needed because of jitpack vs local
    }

    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test:rules:1.2.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core:1.3.1")
    implementation("androidx.activity:activity:1.1.0")
    implementation("androidx.fragment:fragment-ktx:1.2.5")

    implementation("com.google.android.material:material:1.1.0")
    testImplementation("junit:junit:4.13")

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
}
