package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.treesitter.Treesitter
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec

class SqlLanguageSpec : TreeSitterLanguageSpec() {

    override val name = "sql"

    override val tsName = "sql"

    override val fileExtensions = listOf("sql")

    override fun createClient(context: TreeSitterLanguage.Context) = TreeSitterLanguage(context, Treesitter.getLanguage(tsName))
}
