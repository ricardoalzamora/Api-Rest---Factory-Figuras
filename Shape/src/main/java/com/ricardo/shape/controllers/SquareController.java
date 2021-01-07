package com.ricardo.shape.controllers;

import com.ricardo.shape.entity.Square;
import com.ricardo.shape.services.Square.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("square")
public class SquareController {

    @Autowired
    private SquareService squareService;

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(squareService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id){
        Optional<Square> o = squareService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Square square){
        Square squareDb = squareService.save(square);
        return ResponseEntity.status(HttpStatus.CREATED).body(squareDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Square square, @PathVariable Long id){
        Optional<Square> o = squareService.findById(id);
        if(o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Square squareDb = o.get();
        squareDb.setBase(square.getBase());
        squareDb.setHeight(square.getHeight());

        return ResponseEntity.status(HttpStatus.CREATED).body(squareService.save(squareDb));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        squareService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
