package com.core.Merchant_Galaxy.ServicesImp;

import org.springframework.stereotype.Service;

import com.core.Merchant_Galaxy.Enums.GalaxyChangeEnum;
import com.core.Merchant_Galaxy.Services.ConversorService;

@Service
public class ConversorServiceImp implements ConversorService{

    @Override
    public String getConversion(String textToRead) {

        GalaxyChangeEnum[] galaxyChange = GalaxyChangeEnum.values();

        return GalaxyChangeEnum.valueOf(textToRead).toString();
        

        
    }

}
