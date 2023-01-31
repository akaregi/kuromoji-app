package icu.azure.kuromojiapp.entity

import icu.azure.kuromojiapp.kuromoji.Kuromoji

class KuromojiEntity(sentence: String) {
    @Suppress("MemberVisibilityCanBePrivate")
    val tokens: List<Token>

    init {
        this.tokens = Kuromoji.tokenizer.tokenize(sentence).map {
            Token(it.surface, it.baseForm, it.reading)
        }
    }
}

data class Token(val token: String, val stem: String, val reading: String)