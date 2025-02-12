package com.midatacomputer.exobankingapi.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
//@Entity
public class Person {

    protected String fullName;
    protected String dateOfBirth;
    protected String address;
}
