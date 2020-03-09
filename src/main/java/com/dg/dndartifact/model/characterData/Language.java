package com.dg.dndartifact.model.characterData;

import com.dg.dndartifact.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "language")
public class Language extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    //TODO races
    @Transient
    private List<Object> typicalSpeakers;

}
 