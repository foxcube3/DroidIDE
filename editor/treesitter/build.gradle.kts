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
    api(libs.common.editor)
    api(libs.common.kotlin.coroutines.android)
    api(libs.androidide.ts) {
        isChanging = true
    }
    api(libs.androidide.ts.html)
    api(libs.androidide.ts.python)
    api(libs.androidide.ts.sql)
    api(libs.androidide.ts.php)
    api(libs.androidide.ts.typescript)
    api(libs.androidide.ts.markdown)
    api(libs.androidide.ts.rust)
    api(libs.androidide.ts.go)
    api(libs.androidide.ts.ruby)
    api(libs.androidide.ts.c.sharp)
    api(libs.androidide.ts.c.plus.plus)
    api(libs.androidide.ts.javascript)
    api(libs.androidide.ts.abap)
    api(libs.androidx.collection)

    api(projects.core.common)
    api(projects.editor.api)
    api(projects.logging.logger)
}
