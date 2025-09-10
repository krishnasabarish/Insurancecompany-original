package com.insurance.carinsurance2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.carinsurance2.Entity.CarInsuranceEntity;

public interface CarInsuranceRepository extends JpaRepository<CarInsuranceEntity, Long> {
}
