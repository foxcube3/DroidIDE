package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_TYPESCRIPT
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun typescript(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "typescript",
        languageAbbreviation = "ts",
        fileTypes = listOf("ts"),
        parser = LANG_TYPESCRIPT,
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
