package com.ricardo.shape.services.Triangle;

import com.ricardo.shape.entity.Triangle;

import java.util.Optional;

public interface TriangleService {
    public Iterable<Triangle> findAll();

    public Optional<Triangle> findById(Long id);

    public Triangle save(Triangle triangle);

    public void deleteById(Long id);
}
