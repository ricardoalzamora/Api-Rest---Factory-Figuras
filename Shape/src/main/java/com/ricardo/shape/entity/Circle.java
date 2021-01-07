package com.ricardo.shape.entity;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Circle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private double diameter;

    @Transient
    private double surface;

    @Column(name = "creat_at")
    @Temporal(TemporalType.TIMESTAMP)
    @NonNull
    private Date creatAt;

    public Circle() {
    }

    @PrePersist
    public void prePersist() {
        this.creatAt = new Date();
    }

    @PostLoad
    public void postLoad(){
        this.surface = Math.PI*(Math.pow(diameter, 2)/4);
    }
}
