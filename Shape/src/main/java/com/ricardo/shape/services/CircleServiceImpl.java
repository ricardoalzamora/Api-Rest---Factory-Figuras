package com.ricardo.shape.services;

import com.ricardo.shape.entity.Circle;
import com.ricardo.shape.repository.CircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service("circleservice")
public class CircleServiceImpl implements GenericService<Circle> {

    @Autowired
    private CircleRepository circleRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Circle> findAll() {
        return circleRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Circle> findById(Long id) {
        return circleRepository.findById(id);
    }

    @Override
    @Transactional
    public Circle save(Circle circle) {
        return circleRepository.save(circle);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        circleRepository.deleteById(id);
    }
}
