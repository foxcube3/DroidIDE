package io.github.rosemoe.sora.test

import org.junit.Test
import io.github.rosemoe.sora.editor.ts.Languages

class TestTreeSitter {
    @Test
    fun test() {
        val language = Languages.rust()
        val symbol = language.symbol(null)
        assert(symbol != null)
    }
}