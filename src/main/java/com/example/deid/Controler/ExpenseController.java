package com.example.deid.Controler;

import com.example.deid.model.Expense;
import com.example.deid.Services.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/gastos")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService service;

    @PostMapping
    public Expense criar(@RequestBody Expense expense) {
        return service.salvar(expense);
    }

    @GetMapping
    public List<Expense> listar() {
        return service.listarTodas();
    }

    @GetMapping("/total")
    public BigDecimal totalGasto() {
        return service.totalGasto();
    }
}
