package io.github.rosemoe.sora.editor.ts

import io.github.rosemoe.sora.editor.ts.token.DocumentationToken
import org.eclipse.tm4e.core.registry.IGrammar

class LanguageSpecification(
    val languageName: String,
    val languageAbbreviation: String,
    val fileTypes: List<String>,
    val parser: Long,
    val grammar: (scopeName: String) -> IGrammar?,
    val fallback: (doc: DocumentationToken) -> String?,
    val symbol: (doc: DocumentationToken) -> String?
)
