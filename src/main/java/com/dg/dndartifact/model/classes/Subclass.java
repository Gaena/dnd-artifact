package com.dg.dndartifact.model.classes;

import com.dg.dndartifact.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties("characterClass")
public class Subclass extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private CharacterClass characterClass;

    private String subclassFlavor;

    //All possible features that this subclass can obtain.
    @Transient
    private List<Object> features;




}
