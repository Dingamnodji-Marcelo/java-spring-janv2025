package com.midatacomputer.exobankingapi.model;

import com.midatacomputer.exobankingapi.enums.AccountEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Client extends Person {
    @Id
    private UUID clientId;

    //@OneToMany
    //Set<String> accounts = new HashSet<>();

}
