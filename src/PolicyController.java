package com.insurance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class PolicyController {

    @GetMapping("/policies")
    public List<Map<String, String>> getPolicies() {
        List<Map<String, String>> policies = new ArrayList<>();
        
        Map<String, String> policy1 = new HashMap<>();
        policy1.put("id", "101");
        policy1.put("type", "Health Insurance");
        policy1.put("premium", "₹5000");

        Map<String, String> policy2 = new HashMap<>();
        policy2.put("id", "102");
        policy2.put("type", "Car Insurance");
        policy2.put("premium", "₹7000");

        policies.add(policy1);
        policies.add(policy2);

        return policies;
    }
}
