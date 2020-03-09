package com.dg.dndartifact.model.race;

import com.dg.dndartifact.model.characterData.AbilityScore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AbilityBonus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AbilityScore abilityScore;

    private int bonus;
}
