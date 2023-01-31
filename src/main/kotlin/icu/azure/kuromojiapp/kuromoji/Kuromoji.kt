package icu.azure.kuromojiapp.kuromoji

import com.atilika.kuromoji.ipadic.Tokenizer

class Kuromoji {
    companion object {
        val tokenizer = Tokenizer.Builder().build()
    }
}