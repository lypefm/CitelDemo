package com.citel.teste.demo.entities.commons;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
public abstract class EntidadeBase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DATA_ADD", nullable = false)
    private LocalDate dataAdd = LocalDate.now();

    public LocalDate getDataAdd() {
        return dataAdd;
    }

    public void setDataAdd(LocalDate dataAdd) {
        this.dataAdd = dataAdd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
