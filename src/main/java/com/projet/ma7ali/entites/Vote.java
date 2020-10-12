package com.projet.ma7ali.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vote {
    @Id
    private Long id;
    private VoteEnum voteEnum;

}
