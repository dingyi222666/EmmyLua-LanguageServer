/*
 * Copyright 2000-2015 JetBrains s.r.o.
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

package com.intellij.psi.impl.source.tree;

import org.jetbrains.annotations.NotNull;

public class Factory {
    private Factory() {
    }

    /*@NotNull
    public static LeafElement createSingleLeafElement(@NotNull IElementType type, CharSequence buffer, int startOffset, int endOffset, CharTable table, PsiManager manager, PsiFile originalFile) {
        DummyHolder dummyHolder = DummyHolderFactory.createHolder(manager, table, type.getLanguage());
        dummyHolder.setOriginalFile(originalFile);

        FileElement holderElement = dummyHolder.getTreeElement();

        LeafElement newElement = ASTFactory.leaf(type, holderElement.getCharTable().intern(
                buffer, startOffset, endOffset));
        holderElement.rawAddChildren(newElement);
        CodeEditUtil.setNodeGenerated(newElement, true);
        return newElement;
    }*/

    /*@NotNull
    public static LeafElement createSingleLeafElement(@NotNull IElementType type, CharSequence buffer, int startOffset, int endOffset, CharTable table, PsiManager manager, boolean generatedFlag) {
        final FileElement holderElement = DummyHolderFactory.createHolder(manager, table, type.getLanguage()).getTreeElement();
        final LeafElement newElement = ASTFactory.leaf(type, holderElement.getCharTable().intern(
                buffer, startOffset, endOffset));
        holderElement.rawAddChildren(newElement);
        if (generatedFlag) CodeEditUtil.setNodeGenerated(newElement, true);
        return newElement;
    }*/

    /*@NotNull
    public static LeafElement createSingleLeafElement(@NotNull IElementType type, CharSequence buffer, CharTable table, PsiManager manager) {
        return createSingleLeafElement(type, buffer, 0, buffer.length(), table, manager);
    }*/

    /*@NotNull
    public static LeafElement createSingleLeafElement(@NotNull IElementType type, CharSequence buffer, int startOffset, int endOffset, @Nullable CharTable table, PsiManager manager) {
        return createSingleLeafElement(type, buffer, startOffset, endOffset, table, manager, true);
    }*/

    @NotNull
    public static CompositeElement createErrorElement(String description) {
        return new PsiErrorElementImpl(description);
    }

    /*@NotNull
    public static CompositeElement createCompositeElement(@NotNull IElementType type,
                                                          final CharTable charTableByTree,
                                                          final PsiManager manager) {
        final FileElement treeElement = DummyHolderFactory.createHolder(manager, null, charTableByTree).getTreeElement();
        final CompositeElement composite = ASTFactory.composite(type);
        treeElement.rawAddChildren(composite);
        return composite;
    }*/
}
