package com.eg.service_offering.Repository;

import com.eg.service_offering.model.ServiceOffering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ServiceOfferingRepository extends JpaRepository<ServiceOffering, Long> {
    Set<ServiceOffering> findSalonById(Long salonId);
}
