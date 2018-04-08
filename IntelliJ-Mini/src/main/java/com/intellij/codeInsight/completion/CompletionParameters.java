/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package com.intellij.codeInsight.completion;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * @author peter
 */
public final class CompletionParameters {
    private CompletionType myCompletionType;

    private PsiElement myPosition;
    private int offset;
    private PsiFile originalFile;

    @NotNull
    public PsiElement getPosition() {
        return myPosition;
    }

    public void setPosition(PsiElement myPosition) {
        this.myPosition = myPosition;
    }

    @NotNull
    public CompletionType getCompletionType() {
        return myCompletionType;
    }

    public void setCompletionType(CompletionType myCompletionType) {
        this.myCompletionType = myCompletionType;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOriginalFile(PsiFile originalFile) {
        this.originalFile = originalFile;
    }

    public PsiFile getOriginalFile() {
        return originalFile;
    }
}
