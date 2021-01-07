package com.ricardo.shape.services.Circle;

import com.ricardo.shape.entity.Circle;

import java.util.Optional;

public interface CircleService {
    public Iterable<Circle> findAll();

    public Optional<Circle> findById(Long id);

    public Circle save(Circle circle);

    public void deleteById(Long id);
}
