package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_KOTLIN
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun kotlin(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "kotlin",
        languageAbbreviation = "kt",
        fileTypes = listOf("kt"),
        parser = LANG_KOTLIN,
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
