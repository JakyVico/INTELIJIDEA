package com.jaky.sftp.repository;

import com.jaky.sftp.models.MetricasAjuste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMetricas extends JpaRepository<MetricasAjuste,Long> {
}
