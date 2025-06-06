package com.example.demo.concurrency.lock.pessimistic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class PessimisticCounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int count;

    public PessimisticCounter(int count) {
        this.count = count;
    }

    public void initCount() {
        this.count = 1000;
    }

    public void decreaseCount() {
        this.count--;
    }
}