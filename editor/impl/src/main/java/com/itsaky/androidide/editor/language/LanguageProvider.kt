package com.itsaky.androidide.editor.language

import com.itsaky.androidide.editor.language.treesitter.HtmlLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.JavaLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.JsonLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.KotlinLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.LogLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.TreeSitterLanguageProvider
import com.itsaky.androidide.editor.language.treesitter.TreeSitterLanguageSpec
import com.itsaky.androidide.editor.language.treesitter.XMLLanguageSpec
import io.github.rosemoe.sora.lang.Language
import java.io.File

object LanguageProvider {

    private val treeSitterLanguages = mutableMapOf<String, TreeSitterLanguageSpec>()

    fun initialize() {
        registerLanguages()
    }

    private fun registerLanguages() {
        listOf(
            JavaLanguageSpec(),
            KotlinLanguageSpec(),
            XMLLanguageSpec(),
            JsonLanguageSpec(),
            LogLanguageSpec(),
            HtmlLanguageSpec()
        ).forEach { spec ->
            spec.fileExtensions.forEach { ext ->
                treeSitterLanguages[ext] = spec
            }
        }
    }

    fun getLanguage(file: File, project: Any?): Language {
        val extension = file.extension
        val spec = treeSitterLanguages[extension]
        if (spec != null) {
            return TreeSitterLanguageProvider.forSpec(spec)
        }

        // Fallback to a default language if no specific language is found
        returnPlainTextLanguage()
    }

    private fun returnPlainTextLanguage(): Language {
        // Return a default plain text language
        return object : Language {
            override fun createAnalyzer(editor: Any) = object : any {
                override fun analyze(charSequence: CharSequence, any: Any, any1: Any, any2: Any) {}
            }

            override fun createAutoComplete(editor: Any) = object : any {
                override fun onSelect(item: any, any: Any) {}
                override fun onEnter(prefix: CharSequence, any: Any, any1: Any) {}
            }

            override fun createCodeNavigation(editor: Any) = null

            override fun createNewlineHandler(editor: Any) = null

            override fun getInitialIndent(line: CharSequence) = 0
        }
    }
}
