package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_PYTHON
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import java.io.File
import org.eclipse.tm4e.core.registry.Registry
import org.eclipse.tm4e.core.theme.Theme
import java.io.FileInputStream

fun python(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "python",
        languageAbbreviation = "py",
        fileTypes = listOf("py"),
        parser = LANG_PYTHON,
        grammar = { scopeName ->
            val registry = Registry()
            val grammar = registry.loadGrammarFromPath(
                File("editor/src/main/assets/grammars/python.tmLanguage.json").toPath(),
                FileInputStream(File("editor/src/main/assets/grammars/python.tmLanguage.json")),
                Theme.createFromRawTheme(emptyMap())
            )
            grammar
        },
        fallback = { doc ->
            // TODO: Add fallback
            null
        },
        symbol = { doc ->
            // TODO: Add symbol
            null
        }
    )
}
