package com.core.Merchant_Galaxy.ServicesImp;

import org.springframework.stereotype.Service;

import com.core.Merchant_Galaxy.Enums.GalaxyChangeEnum;
import com.core.Merchant_Galaxy.Services.ConversorService;

@Service
public class ConversorServiceImp implements ConversorService{

    @Override
    public String getConversion(String textToRead) {
        String resultText = "";
        try {
        
        GalaxyChangeEnum[] galaxyChange = GalaxyChangeEnum.values();
        GalaxyChangeEnum enumSelected = GalaxyChangeEnum.valueOf(textToRead);
        
            resultText =String.valueOf(enumSelected.getValue());

        } catch (Exception e) {
            return "Error: No se encontró un valor para " + textToRead;
        }
        


        
        return  resultText;
        

        
    }

}
