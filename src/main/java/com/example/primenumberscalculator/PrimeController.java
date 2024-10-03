package com.example.primenumberscalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PrimeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/api/primes")
    @ResponseBody
    public List<Integer> getPrimes(@RequestParam int boundary) {
        return calculatePrimes(boundary);
    }

    private List<Integer> calculatePrimes(int boundary) {
        boolean[] isPrime = new boolean[boundary + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= boundary; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor * factor <= boundary; factor++) {
            if (isPrime[factor]) {
                for (int j = factor * factor; j <= boundary; j += factor) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= boundary; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
