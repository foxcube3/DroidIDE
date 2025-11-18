package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_DART
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun dart(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "dart",
        languageAbbreviation = "dart",
        fileTypes = listOf("dart"),
        parser = LANG_DART,
        grammar = {
            // TODO: Add grammar
        },
        fallback = {
            // TODO: Add fallback
        },
        symbol = {
            // TODO: Add symbol
        }
    )
}
