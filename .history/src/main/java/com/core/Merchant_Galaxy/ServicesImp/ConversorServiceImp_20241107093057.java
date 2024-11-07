package com.core.Merchant_Galaxy.ServicesImp;

import org.springframework.stereotype.Service;

import com.core.Merchant_Galaxy.Services.ConversorService;

@Service
public class ConversorServiceImp implements ConversorService{

    @Override
    public String getConversion(String textToRead) {


        return "funciono?"+textToRead;

        
    }

}
