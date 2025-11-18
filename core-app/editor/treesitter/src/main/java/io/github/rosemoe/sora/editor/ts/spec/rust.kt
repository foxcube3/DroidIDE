package io.github.rosemoe.sora.editor.ts.spec

import io.github.rosemoe.sora.editor.ts.LANG_RUST
import io.github.rosemoe.sora.editor.ts.LanguageSpecification
import java.io.File
import org.eclipse.tm4e.core.registry.Registry
import org.eclipse.tm4e.core.theme.Theme
import java.io.FileInputStream

fun rust(): LanguageSpecification {
    return LanguageSpecification(
        languageName = "rust",
        languageAbbreviation = "rs",
        fileTypes = listOf("rs"),
        parser = LANG_RUST,
        grammar = { scopeName ->
            val registry = Registry()
            val grammar = registry.loadGrammarFromPath(
                File("editor/src/main/assets/grammars/rust.tmLanguage.json").toPath(),
                FileInputStream(File("editor/src/main/assets/grammars/rust.tmLanguage.json")),
                Theme.createFromRawTheme(emptyMap())
            )
            grammar
        },
        fallback = { doc ->
            doc.getLanguage().createAutoComplete()
        },
        symbol = { doc ->
            doc.getLanguage().createSymbol(File("editor/src/main/assets/textmate/rust/tags.scm"))
        }
    )
}
