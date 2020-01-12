package com.app.model.dto;

import com.app.model.enums.GuaranteeComponents;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductWithGuarDTO {

    private String productName;
    private BigDecimal price;
    private String categoryName;
    private String producerName;
    private String countryName;
    private Set<GuaranteeComponents> guaranteeComponents;



}
