package com.midatacomputer.exobankingapi.model;

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
public class Bank {

    @Id
    private UUID bankId;
    private String bankName;
    @ManyToMany
    Set<Client> clients = new HashSet<>();
    @ManyToMany
    Set<Agent> agents = new HashSet<>();
}
