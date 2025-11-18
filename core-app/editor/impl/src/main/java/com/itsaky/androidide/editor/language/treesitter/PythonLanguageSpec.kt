package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.treesitter.Treesitter
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec

class PythonLanguageSpec : TreeSitterLanguageSpec() {

    override val name = "python"

    override val tsName = "python"

    override val fileExtensions = listOf("py")

    override fun createClient(context: TreeSitterLanguage.Context) = TreeSitterLanguage(context, Treesitter.getLanguage(tsName))
}
