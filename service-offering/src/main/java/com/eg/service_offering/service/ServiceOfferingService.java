package com.eg.service_offering.service;

import com.eg.service_offering.dto.CategoryDTO;
import com.eg.service_offering.dto.SalonDTO;
import com.eg.service_offering.dto.ServiceDTO;
import com.eg.service_offering.model.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {

    ServiceOffering createService(SalonDTO salonDTO,
                                  ServiceDTO serviceDto,
                                  CategoryDTO categoryDTO);
    ServiceOffering updateService(Long serviceId, ServiceOffering service) throws Exception;
    Set<ServiceOffering> getAllServiceBySalonId(Long salonId, Long categoryId);
    Set<ServiceOffering> getServicesById(Set<Long> ids);
    ServiceOffering getServiceById(Long id) throws Exception;
}
