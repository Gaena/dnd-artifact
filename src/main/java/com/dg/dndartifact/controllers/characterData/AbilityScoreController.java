package com.dg.dndartifact.controllers.characterData;

import com.dg.dndartifact.model.characterData.AbilityScore;
import com.dg.dndartifact.repositories.AbilityScorerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("abilityScores")
@AllArgsConstructor
public class AbilityScoreController {

    private final AbilityScorerRepository abilityScorerRepository;

    @GetMapping
    public List<AbilityScore> getAll() {
        return abilityScorerRepository.findAll();
    }
}
