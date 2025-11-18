package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.treesitter.Treesitter
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec

class HtmlLanguageSpec : TreeSitterLanguageSpec() {

    override val name = "html"

    override val tsName = "html"

    override val fileExtensions = listOf("html", "htm")

    override fun createClient(context: TreeSitterLanguage.Context) = TreeSitterLanguage(context, Treesitter.getLanguage(tsName))
}
