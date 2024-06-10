package com.example.budget.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDto {
    @JsonProperty
    private LocalDate reportDate;
    @JsonProperty
    private Double totalIncome;
    @JsonProperty
    private Double totalExpenses;
    @JsonProperty
    private List<TransactionDto> transactions;
}
