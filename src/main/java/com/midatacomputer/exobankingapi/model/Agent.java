package com.midatacomputer.exobankingapi.model;


import com.midatacomputer.exobankingapi.enums.AgentEnum;
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
public class Agent extends Person {
    @Id
    private UUID agentId;
    private AgentEnum role;

    @OneToMany
    Set<Client> clients = new HashSet<>();
}
