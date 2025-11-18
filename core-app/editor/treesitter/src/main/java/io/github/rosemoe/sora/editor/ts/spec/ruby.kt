package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_RUBY
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun ruby(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "ruby",
        languageAbbreviation = "rb",
        fileTypes = listOf("rb"),
        parser = LANG_RUBY,
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
