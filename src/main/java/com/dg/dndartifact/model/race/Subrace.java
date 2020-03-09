package com.dg.dndartifact.model.race;

import com.dg.dndartifact.model.BaseEntity;
import com.dg.dndartifact.model.characterData.Language;
import com.dg.dndartifact.model.characterData.Proficiency;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subrace extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Race race;

    @Transient
    private List<AbilityBonus> abilityBonuses;

    @Transient
    private List<Proficiency> startingProficiencies;

    @Transient
    private List<Language> languages;

    //TODO traits
    @Transient
    private List<Object> traits;
}
