package com.midatacomputer.exobankingapi.model;


import com.midatacomputer.exobankingapi.enums.AccountEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
//@Entity
public class Account {

    private String clientId;
    private AccountEnum accountType;
}
