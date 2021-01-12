package com.ricardo.shape.repository;

import com.ricardo.shape.entity.Triangle;
import org.springframework.data.repository.CrudRepository;

public interface TriangleRepository extends CrudRepository<Triangle, Long> {
}
