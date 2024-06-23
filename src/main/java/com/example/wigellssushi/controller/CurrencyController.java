package com.example.wigellssushi.controller;

import com.example.wigellssushi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3")
public class CurrencyController {
    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/sektoeuro")
    public Double bookRoom(@RequestParam Double amountInSEK) {
        return currencyService.sekToEuro(amountInSEK);
    }
}
