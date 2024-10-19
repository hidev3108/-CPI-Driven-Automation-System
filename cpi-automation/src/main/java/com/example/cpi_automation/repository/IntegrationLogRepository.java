package com.example.cpi_automation.repository;

import com.example.cpi_automation.model.IntegrationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegrationLogRepository extends JpaRepository<IntegrationLog,Long> {
}
