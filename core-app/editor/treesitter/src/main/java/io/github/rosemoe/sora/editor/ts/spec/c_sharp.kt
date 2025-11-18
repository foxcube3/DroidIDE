package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_CSHARP
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun c_sharp(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "csharp",
        languageAbbreviation = "cs",
        fileTypes = listOf("cs"),
        parser = LANG_CSHARP,
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
