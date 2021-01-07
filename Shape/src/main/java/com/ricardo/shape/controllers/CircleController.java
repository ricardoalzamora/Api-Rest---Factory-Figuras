package com.ricardo.shape.controllers;

import com.ricardo.shape.entity.Circle;
import com.ricardo.shape.services.Circle.CircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("circle")
public class CircleController {
    @Autowired
    private CircleService circleService;

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(circleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id){
        Optional<Circle> o = circleService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Circle circle){
        Circle circleDb = circleService.save(circle);
        return ResponseEntity.status(HttpStatus.CREATED).body(circleDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Circle circle, @PathVariable Long id){
        Optional<Circle> o = circleService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Circle circleDb = o.get();
        circleDb.setDiameter(circle.getDiameter());

        return ResponseEntity.status(HttpStatus.CREATED).body(circleService.save(circleDb));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        circleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
