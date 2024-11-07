package com.core.Merchant_Galaxy.Controllers;

import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<?> getConversorResult(@PathVariable("textToRead") String textToRead){
        try{
            
            String resultConversion = conversorService.getConversion(textToRead);
            Map<String, Object> response = new HashMap<>();
            response.put("result", resultConversion);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch( Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
