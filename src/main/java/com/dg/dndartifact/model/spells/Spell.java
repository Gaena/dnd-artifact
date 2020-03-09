package com.dg.dndartifact.model.spells;

import com.dg.dndartifact.model.BaseEntity;
import com.dg.dndartifact.model.classes.CharacterClass;
import com.dg.dndartifact.model.classes.Subclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Spell extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String higherLevel;

    private int range;

    @Transient
    private List<SpellComponent> spellComponents;

    @Column(columnDefinition = "TEXT")
    private String material;

    private boolean ritual;

    private String duration;

    private boolean concentration;

    private String castingTime;

    private int level;

    @Transient
    private SpellSchool spellSchool;

    @Transient
    private List<CharacterClass> classes;

    @Transient
    private List<Subclass> subclasses;



}
