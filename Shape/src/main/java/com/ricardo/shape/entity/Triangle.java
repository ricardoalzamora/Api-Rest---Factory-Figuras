package com.ricardo.shape.entity;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Triangle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private double base;

    @NonNull
    private double height;

    @Transient
    private double surface;

    @Column(name = "creat_at")
    @Temporal(TemporalType.TIMESTAMP)
    @NonNull
    private Date creatAt;

    public Triangle() {
    }

    @PrePersist
    public void prePersist() {
        this.creatAt = new Date();
    }

    @PostLoad
    public void postLoad(){
        this.surface = base*height/2;
    }
}
