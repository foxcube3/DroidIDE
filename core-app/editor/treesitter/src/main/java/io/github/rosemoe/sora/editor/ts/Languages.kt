package io.github.rosemoe.sora.editor.ts

import io.github.rosemoe.sora.editor.ts.spec.html
import io.github.rosemoe.sora.editor.ts.spec.css
import io.github.rosemoe.sora.editor.ts.spec.javascript
import io.github.rosemoe.sora.editor.ts.spec.typescript
import io.github.rosemoe.sora.editor.ts.spec.json
import io.github.rosemoe.sora.editor.ts.spec.python
import io.github.rosemoe.sora.editor.ts.spec.java
import io.github.rosemoe.sora.editor.ts.spec.rust

object Languages {
    @JvmStatic
    fun html() = html()

    @JvmStatic
    fun css() = css()

    @JvmStatic
    fun javascript() = javascript()

    @JvmStatic
    fun typescript() = typescript()

    @JvmStatic
    fun json() = json()

    @JvmStatic
    fun python() = python()

    @JvmStatic
    fun java() = java()
    
    @JvmStatic
    fun rust() = rust()
}