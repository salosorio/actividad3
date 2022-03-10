package com.example.demo.infraestructura.configuracion;

//tiene metodos que expone dependencias de Spring

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    @Bean
    public DataSource dataSource(){ //nuestra configuracion
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/maintenances_db");
        config.setUsername("mysql_user");
        config.setPassword("root");


         return new HikariDataSource(config);


    }
}
