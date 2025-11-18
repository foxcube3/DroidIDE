package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.treesitter.Treesitter
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec

class GroovyLanguageSpec : TreeSitterLanguageSpec() {

    override val name = "groovy"

    override val tsName = "groovy"

    override val fileExtensions = listOf("groovy")

    override fun createClient(context: TreeSitterLanguage.Context) = TreeSitterLanguage(context, Treesitter.getLanguage(tsName))
}
