package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_C
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

fun c_plus_plus(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "c++",
        languageAbbreviation = "cpp",
        fileTypes = listOf("cpp", "cxx", "cc", "c", "h", "hpp"),
        parser = LANG_C,
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
