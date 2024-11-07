package com.es.libreria.service

import AutorRepository
import com.es.libreria.repository.*
import com.es.libreria.model.Autor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AutorService() {

    @Autowired
    private lateinit var autorRepository: AutorRepository

    fun getById(id: String): Autor? {
        val idL = id.toLongOrNull()?: return null

        return autorRepository.findByIdOrNull(idL)
    }
}