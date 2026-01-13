package com.example.deid.Services;

import com.example.deid.model.Expense;
import com.example.deid.Repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository repository;

    public Expense salvar(Expense expense) {
        return repository.save(expense);
    }

    public List<Expense> listarTodas() {
        return repository.findAll();
    }

    public BigDecimal totalGasto() {
        return repository.findAll()
                .stream()
                .map(Expense::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
