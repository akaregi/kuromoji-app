package icu.azure.kuromojiapp.entity

import icu.azure.kuromojiapp.kuromoji.Kuromoji

class KuromojiEntity(sentence: String) {
    // FIXME: Jackson が勝手に JSON にしてくれるので、private にすると都合が悪いが private にしないと文句を言われる
    @Suppress("MemberVisibilityCanBePrivate")
    val tokens: List<Token>

    init {
        this.tokens = Kuromoji.tokenizer.tokenize(sentence).map {
            Token(it.surface, it.baseForm, it.reading)
        }
    }
}

data class Token(val token: String, val stem: String, val reading: String)