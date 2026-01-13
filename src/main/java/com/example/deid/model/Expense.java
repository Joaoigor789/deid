package com.example.deid.model;

import com.example.deid.enums.CategoryType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private BigDecimal valor;

    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private CategoryType categoria;
}
