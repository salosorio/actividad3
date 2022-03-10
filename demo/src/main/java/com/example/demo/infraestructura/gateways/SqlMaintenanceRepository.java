package com.example.demo.infraestructura.gateways;

import com.example.demo.core.dominio.MaintenanceService;
import com.example.demo.core.dominio.ServiceId;
import com.example.demo.core.gateway.MaintenanceServiceRepository;
import com.example.demo.shared.domain.PageQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

//implementa la interfaz
@Repository
public class SqlMaintenanceRepository implements MaintenanceServiceRepository {

    private final DataSource dataSource;

    public SqlMaintenanceRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public List<MaintenanceService> query(PageQuery pageQuery) {
        return null;
    }

    @Override
    public Optional<MaintenanceService> get(ServiceId serviceId) {
        return Optional.empty();
    }

    @Override
    public void atention(MaintenanceService maintenanceService) {

    }
}
