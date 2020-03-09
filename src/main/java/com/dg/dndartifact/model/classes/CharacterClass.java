package com.dg.dndartifact.model.classes;

import com.dg.dndartifact.model.BaseEntity;
import com.dg.dndartifact.model.characterData.AbilityScore;
import com.dg.dndartifact.model.characterData.Proficiency;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
public class CharacterClass extends BaseEntity<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int hitDie;

    @Transient
    private List<Proficiency> proficienciesChoice;

    @Transient
    private List<Proficiency> defaultProficiencies;

    @Transient
    private List<AbilityScore> savingThrows;

    //TODO starting equipment
    @Transient
    private List<Object> startingEquipment;

    //TODO levels
    @Transient
    private List<Object> levels;

    //TODO subclasses
    @Transient
    private List<Object> subclasses;

    //TODO spell casting
    @Transient
    private List<Object> spellCasting;

    @Transient
    private List<Proficiency> competenceList;




}
