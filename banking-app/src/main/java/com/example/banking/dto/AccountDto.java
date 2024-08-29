package com.example.banking.dto;

//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    //@NotNull(message = "accountHolderName shouldn't be null")
    private String accountHolderName;
    //@NotBlank
    private double balance;
}
