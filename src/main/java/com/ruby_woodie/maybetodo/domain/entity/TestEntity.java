package com.ruby_woodie.maybetodo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_table")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;

    @Column(name = "test_content")
    private String testContent;

}
