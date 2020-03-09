package com.dg.dndartifact.model.archetype;

import com.dg.dndartifact.model.BaseEntity;
import com.dg.dndartifact.model.characterData.Language;
import com.dg.dndartifact.model.characterData.Proficiency;
import com.dg.dndartifact.model.classes.CharacterClass;
import com.dg.dndartifact.model.gameMechanics.Condition;
import com.dg.dndartifact.model.spells.Spell;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Archetype extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private CharacterClass characterClass;

    @Transient
    private List<Proficiency> proficiencyList;

    private int additionalSpellCount;

    @Transient
    private List<Spell> spellList;

    @Transient
    private List<Spell> freeSpellList;

    @Transient
    private List<Spell> oncePerDaySpellList;

    @Transient
    private List<Condition> conditions;

    @Transient
    private List<Language> languages;

    //TODO conf
    private String hpBuff;







    /*
     * Vladeniye dospehom / orujiyem
     *
     *
     * Известные заговоры
     * Известные заклинания
     * Ячейки (int : int)
     * */
}
