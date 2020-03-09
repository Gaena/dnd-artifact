package com.dg.dndartifact.repositories;

import com.dg.dndartifact.model.characterData.AbilityScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "abilityScores" , path = "ability-scores")
public interface AbilityScorerRepository extends JpaRepository<AbilityScore, Long> {

}
