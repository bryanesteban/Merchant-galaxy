package com.core.Merchant_Galaxy.ServicesImp;

import org.springframework.stereotype.Service;

import com.core.Merchant_Galaxy.Enums.GalaxyChangeEnum;
import com.core.Merchant_Galaxy.Enums.RomanNumeral;
import com.core.Merchant_Galaxy.Services.ConversorService;

import Utils.ConstantValues;

@Service
public class ConversorServiceImp implements ConversorService{

    @Override
    public String getConversion(String textToRead) {
        String resultText = "";
        Double valuetransform = 0.0;
        String [] stringToTransform = textToRead.split(ConstantValues.SPACE);
        try {
        
        GalaxyChangeEnum[] galaxyChange = GalaxyChangeEnum.values();

        for(int i = 0; i < stringToTransform.length; i++){
            System.out.println(stringToTransform[i]);
            for (GalaxyChangeEnum galaxyChangeEnum : galaxyChange) {
                if(galaxyChangeEnum.name().equalsIgnoreCase(stringToTransform[i])){
                    System.out.println("logra entrar aqui?");
                    valuetransform += galaxyChangeEnum.getValue();
                }
            }
        }


       // GalaxyChangeEnum enumSelected = GalaxyChangeEnum.valueOf(textToRead);

            resultText = convertToRoman(valuetransform);

        } catch (Exception e) {
            return "Error: No se encontró un valor para " + textToRead;
        }
        


        
        return  resultText;
        

        
    }

    public String convertToRoman(double number) {
    int roundedNumber = (int) Math.round(number);

    if (roundedNumber <= 0) {
        return "No se pueden convertir números menores o iguales a 0";
    }

    RomanNumeral[] romanNumerals = RomanNumeral.values();
    StringBuilder romanRepresentation = new StringBuilder();

    for (int i = romanNumerals.length - 1; i >= 0; i--) {
        RomanNumeral currentRoman = romanNumerals[i];
        while (roundedNumber >= currentRoman.getValue()) {
            romanRepresentation.append(currentRoman.name());
            roundedNumber -= currentRoman.getValue();
        }
    }

    return romanRepresentation.toString();
}

}
