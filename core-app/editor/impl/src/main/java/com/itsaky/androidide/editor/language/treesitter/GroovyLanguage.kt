package com.itsaky.androidide.editor.language.treesitter

import com.itsaky.androidide.editor.language.base.CStyleBracketsHandler
import io.github.rosemoe.sora.editor.ts.TsLanguage
import io.github.rosemoe.sora.editor.ts.TsLanguageSpec
import org.eclipse.tm4e.core.registry.IGrammar

class GroovyLanguage(spec: TsLanguageSpec, grammar: IGrammar) : TsLanguage(spec, grammar) {

    override fun createNewlineHandler() = CStyleBracketsHandler(editor)
}
