package com.server.price.priceEntity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Data
@Getter
@Setter
@Builder
public class Book {

    private String BookId;
    private BigDecimal bookPrice;

}
