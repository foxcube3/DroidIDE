package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_JAVASCRIPT
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun javascript(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "javascript",
        languageAbbreviation = "js",
        fileTypes = listOf("js"),
        parser = LANG_JAVASCRIPT,
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
