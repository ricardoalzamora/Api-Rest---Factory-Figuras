package com.ricardo.shape.services.Triangle;

import com.ricardo.shape.entity.Triangle;
import com.ricardo.shape.repository.TriangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TriangleServiceImpl implements TriangleService {

    @Autowired
    private TriangleRepository triangleRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Triangle> findAll() {
        return triangleRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Triangle> findById(Long id) {
        return triangleRepository.findById(id);
    }

    @Override
    @Transactional
    public Triangle save(Triangle triangle) {
        return triangleRepository.save(triangle);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        triangleRepository.deleteById(id);
    }
}
