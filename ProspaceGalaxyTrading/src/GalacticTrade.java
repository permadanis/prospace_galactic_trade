
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YTR
 */
public class GalacticTrade {
    HashMap<String, String> galacticSymbols = new HashMap<>();
    HashMap<String, Integer> metalPrice = new HashMap<>();
    public void MapToRoman(String galacticSymbol, String romanSymbol){
        boolean isValid = RomanCalculator.IsValidRomanChar(romanSymbol);
        if(isValid)
            System.out.println("invalid roman Symbol");
        else
        {
            galacticSymbols.put(romanSymbol, romanSymbol);
        }
    }
    public void SetPrice(String galacticNumber, String metal, int credit){
        int value = Calculate(galacticNumber);
        int pricePerUnit = credit / value;        
        metalPrice.put(metal, pricePerUnit);
    }
    public int Calculate(String galacticNumber){        
        String romanNumber = ConvertToRoman(galacticNumber);        
        return RomanCalculator.Calculate(romanNumber);
        
    }
    public int GetCredits(String galacticNumber, String metal){
        if(!metalPrice.containsKey(metal))
        {
            System.err.println("Invalid metal");
        }
        
        int price = metalPrice.get(metal);
        int units = Calculate(galacticNumber);
        return price * units;
    }

    private String ConvertToRoman(String galacticNumber) {
        boolean isValid = ValidateSymbols(galacticNumber);
        if(isValid){
            String romanNumeric = "";
            String[] tempSymbols = galacticNumber.split(" ");
            for(String symbol: tempSymbols){
                romanNumeric+= galacticSymbols.get(symbol);
            }
            return romanNumeric;
        }
        else
            return "invalid galactic symbols";
    }

    private boolean ValidateSymbols(String galacticNumber) {
        String [] tmp = galacticNumber.split(" ");
        for(String symbol : tmp)
            if(!galacticSymbols.containsKey(symbol))
                return false;
        
        return true;
    }

    String ProcessInput(String input) {
        String output = "";
        return output;
    }
}