package com.dg.dndartifact.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity<T> implements Serializable {

    private String index;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String source;

    private String url;
}
