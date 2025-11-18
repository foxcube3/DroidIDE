plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.google.material)
    implementation("com.google.guava:guava:32.0.1-android")
    implementation("com.android.tools.build:gradle:8.5.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-java:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-json:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-kotlin:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-log:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-xml:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-html:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-python:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-sql:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-php:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-typescript:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-markdown:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-rust:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-go:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-react:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-ruby:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-c-sharp:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-c-plus-plus:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-javascript:4.3.1")
    implementation("com.itsaky.androidide.treesitter:tree-sitter-abap:4.3.1")
    implementation("com.itsaky.androidide.gradle:gradle-tooling-api:8.9")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.itsaky.androidide.build"
            artifactId = "build-deps"
            version = "1.0.0"

            artifact("$buildDir/outputs/aar/build-deps-release.aar")
        }
    }
}
