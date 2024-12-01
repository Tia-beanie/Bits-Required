/**
 * The program accepts a positive integer from 0 to 32767. Decide what is the minimal bits requried to represent it.
 */

public class BitsRequired {
    public static void main(String[] args){

        int num = 7;

        System.out.println("Bits required: " + bitRequire(num));
    }

    public static int bitRequire(int num){

        for(int bit = 0; bit < 16; bit++){
            
            if(Math.pow(2,bit) > num){
    
                return bit;
            }
        }
        return -1;
    }
}