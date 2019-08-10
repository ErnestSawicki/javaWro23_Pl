package NumbersConverter;

public class NumericSystems {
    public int decimalToBinar(int input){
       return 0;
    }

    public int binaryToDecimal(String input){
        int decimalNumber = 0;
        int pow = 1;
        for (int i = 1; i <= input.length(); i++){
            int bit = Character.getNumericValue(input.charAt(input.length() - i));
            decimalNumber += bit * pow;
            pow *= 2;
        }
        return decimalNumber;
    }

    public int binaryToDecimal(int input){
        String convertedInputToString = Integer.toString(input);
        int decimalNumber = 0;
        int pow = 1;
        for (int i = 1; i <= convertedInputToString.length(); i++){
            int bit = Character.getNumericValue(convertedInputToString.charAt(convertedInputToString.length() - i));
            decimalNumber += bit * pow;
            pow *= 2;
        }
        return decimalNumber;
    }




}
