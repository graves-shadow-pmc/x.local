package com.meshmap.social.ai

import android.content.Context
import com.google.mlkit.nl.languageid.LanguageIdentification
import com.google.mlkit.nl.entityextraction.EntityExtraction
import com.google.mlkit.nl.entityextraction.EntityExtractorOptions

class OnDeviceNLPManager(val context: Context) {
    private val languageIdentifier = LanguageIdentification.getClient()
    private val entityExtractor = EntityExtraction.getClient(
        EntityExtractorOptions.Builder(EntityExtractorOptions.ENGLISH).build()
    )
    fun extractEntities(text: String, onResult: (List<String>) -> Unit) {
        entityExtractor.annotate(text)
            .addOnSuccessListener { entities ->
                val out = entities.flatMap { it.entities.map { e -> e.type } }
                onResult(out)
            }
    }
}