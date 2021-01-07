package com.ricardo.shape.repository;

import com.ricardo.shape.entity.Circle;
import com.ricardo.shape.entity.Square;
import org.springframework.data.repository.CrudRepository;

public interface CircleRepository extends CrudRepository<Circle, Long> {
}
