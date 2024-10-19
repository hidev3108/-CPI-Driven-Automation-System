package com.example.cpi_automation.controller;

import com.example.cpi_automation.model.IntegrationLog;
import com.example.cpi_automation.repository.IntegrationLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/integration")
public class IntegrationController {
    @Autowired
    private IntegrationLogRepository integrationLogRepository;

    // Fetch all logs
    @GetMapping("/logs")
    public List<IntegrationLog> getAllLogs() {
        return integrationLogRepository.findAll();
    }

    // Process data through CPI (simplified)
    @PostMapping("/process")
    public String processData(@RequestBody String data) {
        // Placeholder: Call SAP CPI here
        return "Data processed successfully!";
    }
}
