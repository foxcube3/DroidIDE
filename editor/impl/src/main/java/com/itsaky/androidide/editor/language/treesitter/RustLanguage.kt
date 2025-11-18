
package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.editor.language.newline.BracketsNewlineHandler
import io.github.rosemoe.sora.editor.ts.TsLanguage
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec
import org.eclipse.tm4e.core.registry.IGrammar

class RustLanguage(
    private val tsLanguage: TsLanguage
) : TsLanguage by tsLanguage {
    override fun createLanguageSpec(grammar: IGrammar): TsLanguageSpec {
        return TsLanguageSpec(
            BracketsNewlineHandler(),
            tsLanguage.createIndentationProvider(grammar)
        )
    }
}
