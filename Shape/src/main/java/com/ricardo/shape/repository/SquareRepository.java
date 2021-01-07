package com.ricardo.shape.repository;

import com.ricardo.shape.entity.Square;
import org.springframework.data.repository.CrudRepository;

public interface SquareRepository extends CrudRepository<Square, Long> {
}
