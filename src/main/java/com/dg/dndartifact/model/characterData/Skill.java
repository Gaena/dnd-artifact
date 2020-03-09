package com.dg.dndartifact.model.characterData;

import com.dg.dndartifact.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "skill")
@JsonIgnoreProperties("abilityScore")
public class Skill extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ability_score_id", nullable = false)
    private AbilityScore abilityScore;
}
