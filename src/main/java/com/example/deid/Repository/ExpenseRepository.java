package com.example.deid.Repository;

import com.example.deid.enums.CategoryType;
import com.example.deid.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByCategoria(CategoryType categoria);

    List<Expense> findByDataBetween(LocalDate inicio, LocalDate fim);
}
