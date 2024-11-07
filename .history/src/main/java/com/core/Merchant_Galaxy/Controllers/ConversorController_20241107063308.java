package com.core.Merchant_Galaxy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.Merchant_Galaxy.Services.ConversorService;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    @Autowired
    private ConversorService conversorService;


    @GetMapping("/{textToRead}")
    public ResponseEntity<?> getAllProcesspolicy (@PathVariable("textToRead") String textToRead){
        try{
            String processPocilyList = conversorService.getConversion(textToRead);
            return new ResponseEntity<>(processPocilyList, HttpStatus.OK);
        } catch( Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
