package com.ricardo.shape.services;

import com.ricardo.shape.entity.Square;
import com.ricardo.shape.repository.SquareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service("squareservice")
public class SquareServiceImpl implements GenericService<Square> {

    @Autowired
    private SquareRepository squareRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Square> findAll() {
        return squareRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Square> findById(Long id) {
        return squareRepository.findById(id);
    }

    @Override
    @Transactional
    public Square save(Square square) {
        return squareRepository.save(square);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        squareRepository.deleteById(id);
    }
}
