package com.dg.dndartifact.model.characterData;

import com.dg.dndartifact.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "ability_score")
public class AbilityScore extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String fullName;

    @OneToMany(mappedBy="abilityScore")
    private List<Skill> skills;
}
