package com.es.libreria.model

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "libros")
data class Libro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var titulo: String,

    @Column(nullable = false)
    var genero: String,

    @Column(name = "anio_publicacion")
    var anioPublicacion: Int,

    @Column(nullable = false)
    var precio: Double,

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    @JsonBackReference
    var autor: Autor
)