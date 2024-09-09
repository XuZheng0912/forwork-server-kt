plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp") version "2.0.20-1.0.25"
}

val jimmerVersion: String by rootProject.extra
val serverVersion: String by rootProject.extra

group = "tech.xuzheng.forwork"
version = serverVersion

dependencies {
    implementation(kotlin("stdlib"))

    // For user code
    implementation("org.babyfish.jimmer:jimmer-core:${jimmerVersion}")

    // For generated code
    compileOnly("org.babyfish.jimmer:jimmer-sql-kotlin:${jimmerVersion}")

    // Code generator
    ksp("org.babyfish.jimmer:jimmer-ksp:${jimmerVersion}")
}

kotlin {
    jvmToolchain(17)
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}