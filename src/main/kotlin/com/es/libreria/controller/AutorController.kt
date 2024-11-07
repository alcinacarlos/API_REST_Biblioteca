package com.es.libreria.controller


import org.springframework.beans.factory.annotation.Autowired
import com.es.libreria.model.Autor
import com.es.libreria.service.AutorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/autores")
class AutorController() {

    @Autowired
    private lateinit var autorService: AutorService

    @GetMapping("/{id}")
    fun getById(
        @PathVariable id: String?
    ):Autor?{

        if (id.isNullOrEmpty()){
            return null
        }

        return autorService.getById(id)
    }

    @PostMapping
    fun crearAutor(@RequestBody autor: Autor): ResponseEntity<Autor> {
        return ResponseEntity.ok(autorService.crearAutor(autor))
    }

    @GetMapping
    fun obtenerTodosLosAutores(): ResponseEntity<List<Autor>> {
        return ResponseEntity.ok(autorService.obtenerTodosLosAutores())
    }


    @DeleteMapping("/{id}")
    fun eliminarAutor(@PathVariable id: Long): ResponseEntity<Unit> {
        autorService.eliminarAutor(id)
        return ResponseEntity.noContent().build()
    }
}