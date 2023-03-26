package com.server.price.controller;

import com.server.price.priceEntity.Book;
import com.server.price.priceEntity.Price;
import com.server.price.service.PriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @Autowired
    PriceService priceService;

    Logger logger = LoggerFactory.getLogger(PriceController.class);

    @RequestMapping(value = "/price",method = RequestMethod.GET)
    public Book getBook(@RequestParam String bookId){
        logger.info("Received request with bookId "+bookId);
        Price price = priceService.getPrice(bookId);
        logger.info("Price for the bookId "+price.getPrice());
        Book book = Book.builder().BookId(bookId).bookPrice(price.getPrice()).build();
        return book;
    }
}
