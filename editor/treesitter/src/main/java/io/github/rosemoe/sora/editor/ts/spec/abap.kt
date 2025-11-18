package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_ABAP
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun abap(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "abap",
        languageAbbreviation = "abap",
        fileTypes = listOf("abap"),
        parser = LANG_ABAP,
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
