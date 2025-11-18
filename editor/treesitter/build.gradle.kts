/*******************************************************************************
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/sora-editor
 *    Copyright (C) 2020-2023  Rosemoe
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 *     Please contact Rosemoe by email 2073412493@qq.com if you need
 *     additional information or have any questions
 ******************************************************************************/


plugins {
    id("com.android.library")
    id("kotlin-android")
}



android {
    namespace = "io.github.rosemoe.sora.ts"
}

dependencies {
    implementation(libs.common.editor)
    implementation(libs.common.kotlin.coroutines.android)
    implementation(libs.androidide.ts)
    implementation(libs.androidide.ts.html)
    implementation(libs.androidide.ts.python)
    implementation(libs.androidide.ts.sql)
    implementation(libs.androidide.ts.php)
    implementation(libs.androidide.ts.typescript)
    implementation(libs.androidide.ts.markdown)
    implementation(libs.androidide.ts.rust)
    implementation(libs.androidide.ts.go)
    implementation(libs.androidide.ts.react)
    implementation(libs.androidide.ts.ruby)
    implementation(libs.androidide.ts.c.sharp)
    implementation(libs.androidide.ts.c.plus.plus)
    implementation(libs.androidide.ts.javascript)
    implementation(libs.androidide.ts.abap)
    implementation(libs.androidide.ts.java)
    implementation(libs.androidide.ts.json)
    implementation(libs.androidide.ts.kotlin)
    implementation(libs.androidide.ts.log)
    implementation(libs.androidide.ts.xml)
    implementation(libs.androidx.collection)

    implementation(projects.core.common)
    implementation(projects.editor.api)
    implementation(projects.logging.logger)
}
