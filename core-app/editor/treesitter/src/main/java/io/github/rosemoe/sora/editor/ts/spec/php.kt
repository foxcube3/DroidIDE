package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_PHP
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import java.io.File
import org.eclipse.tm4e.core.registry.Registry
import org.eclipse.tm4e.core.theme.Theme
import java.io.FileInputStream

fun php(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "php",
        languageAbbreviation = "php",
        fileTypes = listOf("php"),
        parser = LANG_PHP,
        grammar = { scopeName ->
            val registry = Registry()
            val grammar = registry.loadGrammarFromPath(
                File("editor/src/main/assets/grammars/php.tmLanguage.json").toPath(),
                FileInputStream(File("editor/src/main/assets/grammars/php.tmLanguage.json")),
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
