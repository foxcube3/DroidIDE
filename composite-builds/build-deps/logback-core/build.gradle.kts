/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

plugins {
    //noinspection JavaPluginLanguageLevel
    id("java-library")
}

java {
    sourceSets.getByName("main") {
        val srcDir =
            rootProject.projectDir.resolve("../external/logback-android/logback-core/src/main/java")
        java.srcDirs(srcDir)

        val modInfo = srcDir.resolve("module-info.java")
        if (modInfo.exists() && modInfo.isFile) {
            modInfo.renameTo(srcDir.resolve("module-info.java.exclude"))
        }
    }

    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

//noinspection UseTomlInstead
dependencies {
    compileOnly("org.codehaus.janino:janino:3.1.9")
    compileOnly("org.codehaus.janino:commons-compiler:3.1.9")
    compileOnly("org.fusesource.jansi:jansi:2.1.0")
    compileOnly("jakarta.mail:jakarta.mail-api:2.0.1")
    compileOnly("jakarta.servlet:jakarta.servlet-api:5.0.0")

    testCompileOnly("org.eclipse.angus:angus-mail:2.1.0")
    testCompileOnly("org.mockito:mockito-core:5.4.0")
}