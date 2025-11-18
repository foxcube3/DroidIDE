package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_HTML
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun html(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "html",
        languageAbbreviation = "html",
        fileTypes = listOf("html", "htm"),
        parser = LANG_HTML,
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
