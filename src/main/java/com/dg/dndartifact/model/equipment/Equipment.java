package com.dg.dndartifact.model.equipment;

import com.dg.dndartifact.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
//TODO replace Transient
public class Equipment extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String equipmentCategory;

    private String weaponCategory;

    private String weaponRange;

    private String categoryRange;

    //TODO change to Cost
    private String cost;

    //TODO change to Damage
    private String damage;

    //TODO change to Range
    private String range;

    private int weight;

    @Transient
    private List<WeaponProperties> weaponProperties;
}
