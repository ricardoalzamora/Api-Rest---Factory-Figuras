package com.ricardo.shape.services;


import java.util.Optional;

public interface GenericService<T> {
    public Iterable<T> findAll();

    public Optional<T> findById(Long id);

    public T save(T t);

    public void deleteById(Long id);
}
