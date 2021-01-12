package com.ricardo.shape.controllers;

import com.ricardo.shape.entity.Triangle;
import com.ricardo.shape.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("triangle")
public class TriangleController {
    @Autowired
    @Qualifier("triangleservice")
    private GenericService triangleService;

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(triangleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id){
        Optional<Triangle> o = triangleService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Triangle triangle){
        Triangle triangleDb = (Triangle) triangleService.save(triangle);
        return ResponseEntity.status(HttpStatus.CREATED).body(triangleDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Triangle triangle, @PathVariable Long id){
        Optional<Triangle> o = triangleService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Triangle triangleDb = o.get();
        triangleDb.setBase(triangle.getBase());
        triangleDb.setHeight(triangle.getHeight());

        return ResponseEntity.status(HttpStatus.CREATED).body(triangleService.save(triangleDb));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        triangleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
