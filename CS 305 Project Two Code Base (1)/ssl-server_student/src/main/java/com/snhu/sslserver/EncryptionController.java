package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encryption") // Changed from "/" to "/encryption"
public class EncryptionController {
    
    @GetMapping("/data") // Changed from "/" to "/data"
    public String getData() {
        return "Encryption Controller Data";
    }
}
