package com.ricardo.shape.services.Square;

import com.ricardo.shape.entity.Square;

import java.util.Optional;

public interface SquareService {
    public Iterable<Square> findAll();

    public Optional<Square> findById(Long id);

    public Square save(Square square);

    public void deleteById(Long id);
}
