package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_GO
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun go(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "go",
        languageAbbreviation = "go",
        fileTypes = listOf("go"),
        parser = LANG_GO,
        grammar = { scopeName ->
            // TODO: Add grammar
            null
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
