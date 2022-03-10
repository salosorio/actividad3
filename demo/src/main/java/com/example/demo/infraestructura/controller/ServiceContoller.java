package com.example.demo.infraestructura.controller;

import com.example.demo.infraestructura.controller.model.ServiceDTO;
import com.example.demo.infraestructura.controller.model.ServiceInput;
import com.example.demo.core.dominio.DescriptionService;
import com.example.demo.core.dominio.MaintenanceService;
import com.example.demo.core.dominio.ServiceId;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/services")  // Es la url que va estar disponible

public class ServiceContoller {

    public ServiceContoller() {
    }

    @GetMapping  //Existe dos get (get one que es con id - get list )
    public List<ServiceDTO> list(
            @RequestParam(name = "skip", defaultValue = "0") Integer skip,
            @RequestParam(name = "limit", defaultValue = "50") Integer limit
    ){
        return List.of();
    }

    @GetMapping(value="{id}")  //Existe dos get (get one que es con id - get list )
    public String getById(UUID id){
        return "Este es el método para consultar  el servicio";
    }

    @PostMapping
    public ServiceDTO create(
            @RequestBody ServiceInput serviceInput
    ){
        MaintenanceService service = new MaintenanceService(
                new ServiceId(UUID.randomUUID()),
                serviceInput.getStartService(),
                serviceInput.getEndService(),
                new DescriptionService(serviceInput.getDescription())
        );

        return ServiceDTO.fromDomain(service);
    }

    @PutMapping
    public String update(){
        return "Este es el método para actualizar un producto";
    }

    @DeleteMapping
    public String delete(){
        return "Este es el método para eliminar un producto";
    }



}
