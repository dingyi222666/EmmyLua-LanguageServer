/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.comment.reference

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.util.Processor
import com.tang.intellij.lua.comment.psi.LuaDocSeeRefTag
import com.tang.intellij.lua.search.SearchContext
import com.tang.intellij.lua.stubs.index.LuaClassMemberIndex
import com.tang.intellij.lua.ty.ITyClass

class LuaDocSeeReference(see: LuaDocSeeRefTag) :
        PsiReferenceBase<LuaDocSeeRefTag>(see){

    val id = see.id!!

    override fun getRangeInElement(): TextRange {
        val start = id.node.startOffset - myElement.node.startOffset
        return TextRange(start, start + id.textLength)
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        /*val id = LuaElementFactory.createDocIdentifier(myElement.project, newElementName)
        this.id.replace(id)
        return id*/
        TODO()
    }

    override fun getVariants(): Array<Any> = emptyArray()

    /*override fun multiResolve(incomplete: Boolean): Array<ResolveResult> {
        val list = mutableListOf<ResolveResult>()
        val type = myElement.classNameRef?.resolveType() as ITyClass
        LuaClassMemberIndex.process(type.className, id.text, SearchContext(myElement.project), Processor {
            list.add(PsiElementResolveResult(it))
            true
        })
        return list.toTypedArray()
    }*/

    override fun resolve(): PsiElement? {
        var result: PsiElement? = null
        val type = myElement.classNameRef?.resolveType() as ITyClass
        LuaClassMemberIndex.process(type.className, id.text, SearchContext(myElement.project), Processor {
            result = it
            false
        })
        return result
    }
}