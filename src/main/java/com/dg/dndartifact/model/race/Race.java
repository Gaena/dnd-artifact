package com.dg.dndartifact.model.race;

import com.dg.dndartifact.model.BaseEntity;
import com.dg.dndartifact.model.characterData.Language;
import com.dg.dndartifact.model.characterData.Proficiency;
import org.aspectj.weaver.ast.Literal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

public class Race extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int speed;

    private List<AbilityBonus> abilityBonuses;

    //Flavor description of likely alignments this race takes
    private String alignment;

    private String age;

    private String size;

    private String sizeDescription;

    private List<Proficiency> startingProficiencies;

    private List<Language> languages;

    private String languageDesc;

    //TODO Traits
    //Racial traits that provide benefits to its members
    private List<Object> traits;

    //TODO subRaces
    private List<Object> subRaces;

    @Transient
    private List<Proficiency> competenceList;
}
