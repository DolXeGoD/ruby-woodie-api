package com.ruby_woodie.maybetodo.domain.repository;

import com.ruby_woodie.maybetodo.domain.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {

    List<TestEntity> findAll();
}
