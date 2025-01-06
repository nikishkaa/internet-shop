package org.shop.productservice.dto;

import java.math.BigDecimal;

public record ProductResponse(String id, String name, String imageUrl, BigDecimal price) {
}
