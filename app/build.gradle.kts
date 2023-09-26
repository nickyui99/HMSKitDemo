plugins {
    id("com.android.application")
    id("com.huawei.agconnect")
}

android {
    namespace = "com.nicholas.hmskitdemo"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.nicholas.hmskitdemo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.squareup.picasso:picasso:2.8")

    /**
     * HMS DEPENDENCIES
     */
    //Huawei Account Kit
    implementation("com.huawei.hms:hwid:6.12.0.300")
    //HMS Core Installer (Optional)
    implementation("com.huawei.hms:hmscoreinstaller:6.12.0.300")
    implementation ("com.huawei.agconnect:agconnect-core:1.9.1.301")
    //HMS Push Kit
    implementation ("com.huawei.hms:push:6.11.0.300")
}