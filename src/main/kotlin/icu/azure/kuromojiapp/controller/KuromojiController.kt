package icu.azure.kuromojiapp.controller

import icu.azure.kuromojiapp.entity.KuromojiEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class KuromojiController {
    @GetMapping("/kuromoji")
    fun getKuromoji(@RequestParam(value = "sentence", defaultValue = "") sentence: String): KuromojiEntity {
        return KuromojiEntity(sentence)
    }
}