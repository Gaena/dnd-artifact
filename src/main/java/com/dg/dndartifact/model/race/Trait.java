package com.dg.dndartifact.model.race;

import com.dg.dndartifact.model.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Trait extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO think about it
    private List<Race> races;

    private List<Subrace> subraces;
}
