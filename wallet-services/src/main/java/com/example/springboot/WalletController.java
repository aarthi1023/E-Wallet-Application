package com.example.springboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WalletController {
    @Autowired
     WalletService walletService;

    @PutMapping("/credit")
    public Wallet credited(@RequestParam("userName") String userName,
                           @RequestParam("amount") int amount){
        return walletService.incrementWallet(userName,amount);
    }

    @PutMapping("/debit")
    public Wallet debited(@RequestParam("userName") String userName,
                           @RequestParam("amount") int amount){
        return walletService.decrementWallet(userName,amount);
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }



}

//done