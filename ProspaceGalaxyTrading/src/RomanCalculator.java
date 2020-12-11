
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
public class RomanCalculator {
    static final HashMap<String, Integer> romanChars = new HashMap<>();
    static final HashMap<String, String> substractedRole = new HashMap<>();
    
    
    static
    {
        romanChars.put("I", 1);
        romanChars.put("V", 5);
        romanChars.put("X", 10);    
        romanChars.put("L", 50);
        romanChars.put("C", 100);
        romanChars.put("D", 500);
        romanChars.put("M", 1000);
        
        substractedRole.put("V", "I");
        substractedRole.put("X", "I");
        substractedRole.put("L", "X");
        substractedRole.put("C", "X");
        substractedRole.put("D", "C");
        substractedRole.put("M", "C");
        
        
        
    }
    private static boolean Validate(String romanNumbers) {
        //valid substraction
        String [] tmp = romanNumbers.split(" ");
        int largestValue = Integer.MAX_VALUE;
        String lastRomanchar = "";
        for(String roman: tmp){
           if(!IsValidRomanChar(roman))
                   return false;
           int value = romanChars.get(roman);
           if(value <= largestValue)
               largestValue = value;
           else{
               if(!CanBeSubstract(roman, lastRomanchar))
                   return false;              
               
           }
           
           lastRomanchar = roman;
        }
        
        
        return true;
    }

    private static boolean CanBeSubstract(String roman, String lastRomanchar) {
       return substractedRole.get(roman).equals(lastRomanchar);
    }
    static boolean IsValidRomanChar(String romanSymbol) {
        return romanChars.containsKey(romanSymbol);
    }
   
    public static int Calculate(String romanNumbers){
        
        if(!Validate(romanNumbers))
            return -1;
        
        int total = 0;
        String [] tmp = romanNumbers.split(" ");
        int lastvalue = 0;
        for(String roman: tmp){
            int value = romanChars.get(roman);
            total += value;
            if(lastvalue != 0){
                if(lastvalue < value)
                    total -= 2 * lastvalue;
            }
            lastvalue = value;
        }
        return total;
    }
}

