package com.insurance.carinsurance2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.insurance.carinsurance2.Entity.CarInsuranceEntity;
import com.insurance.carinsurance2.Repository.CarInsuranceRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarInsuranceController {

    @Autowired
    private CarInsuranceRepository repository;

    // Create Insurance (POST)
    @PostMapping("/car-insurance")
    public CarInsuranceEntity createInsurance(@RequestBody CarInsuranceEntity insurance) {
        System.out.println("Saving insurance details for: " + insurance.getOwnerName());
        return repository.save(insurance);
    }

    // Get all Insurances (GET)
    @GetMapping("/car-insurance")
    public List<CarInsuranceEntity> getAllInsurances() {
        return repository.findAll();
    }
}
