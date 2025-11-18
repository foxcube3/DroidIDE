package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_CSS
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun css(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "css",
        languageAbbreviation = "css",
        fileTypes = listOf("css"),
        parser = LANG_CSS,
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
