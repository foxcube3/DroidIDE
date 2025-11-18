package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_JAVA
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar
import java.io.File
import org.eclipse.tm4e.core.registry.Registry
import org.eclipse.tm4e.core.theme.Theme
import org.eclipse.tm4e.core.grammar.Grammar
import java.io.FileInputStream

fun java(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "java",
        languageAbbreviation = "java",
        fileTypes = listOf("java"),
        parser = LANG_JAVA,
        grammar = { scopeName ->
            val registry = Registry()
            val grammar = registry.loadGrammarFromPath(
                File("editor/src/main/assets/grammars/java.tmLanguage.json").toPath(),
                FileInputStream(File("editor/src/main/assets/grammars/java.tmLanguage.json")),
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
