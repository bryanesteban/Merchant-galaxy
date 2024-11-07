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
        Double multp = 1.0;
        System.err.println("Texto"+textToRead);
        String [] stringToTransform = textToRead.split(ConstantValues.SPACE);
        try {
        
        GalaxyChangeEnum[] galaxyChange = GalaxyChangeEnum.values();
         Double temp=0.0;   
        for(int i = stringToTransform.length -1; i >= 0; i--){
            
            for (GalaxyChangeEnum galaxyChangeEnum : galaxyChange) {
                
                if(stringToTransform[i].equals(ConstantValues.SILVER)  ||
                   stringToTransform[i].equals(ConstantValues.GOLD) ||
                   stringToTransform[i].equals(ConstantValues.IRON)) 
                  {
                   
                    if(galaxyChangeEnum.name().equalsIgnoreCase(stringToTransform[i]))
                    {
                        multp = multp * galaxyChangeEnum.getValue();
                        break;
                    }
                      
                  }
                else
                {
                    if(galaxyChangeEnum.name().equalsIgnoreCase(stringToTransform[i])){
                    
                        if(stringToTransform.length -1 == i) temp = galaxyChangeEnum.getValue();
                        if(temp > galaxyChangeEnum.getValue())  
                                valuetransform -= galaxyChangeEnum.getValue();  
                            else                                 
                                valuetransform += galaxyChangeEnum.getValue();
                           
                           temp = galaxyChangeEnum.getValue();
                           break;
                        }
                }

                
            }
        }
            valuetransform = multp * valuetransform;
            System.out.println("valuetransform:"+valuetransform);
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
