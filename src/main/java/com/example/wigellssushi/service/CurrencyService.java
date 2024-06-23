package com.example.wigellssushi.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private static final double EXCHANGE_RATE_SEK_TO_EURO = 0.089;

    public double sekToEuro(double sek) {
        return sek * EXCHANGE_RATE_SEK_TO_EURO;
    }
}
