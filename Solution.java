
import java.nio.charset.Charset;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdist
 */
public class Solution {
    public boolean gus(String str){
        String s = str+str;
        return s.substring(1, s.length()-1).contains(str);
    }
	private static final String CHAR_LIST = 
		"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 10;
	
	/**
	 * This method generates random string
	 * @return
	 */
	public String generateRandomString(){
        
		StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
        	int number = getRandomNumber();
        	char ch = CHAR_LIST.charAt(number);
        	randStr.append(ch);
        }
        return randStr.toString();
    }
	
	/**
     * This method generates random numbers
     * @return int
     */
    private int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
    public static void main(String...argv) {
        Solution c = new Solution();
        boolean  res;
        String cadena = "abab";
        res=c.gus(cadena);
        System.out.println(res);
        cadena = "a";
        res=c.gus(cadena);
        System.out.println(res);
         cadena = "aa";
        res=c.gus(cadena);
        System.out.println(res);
         cadena = "all";
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        cadena = c.generateRandomString();
        System.out.println(cadena);
        res=c.gus(cadena);
        System.out.println(res);
        
    }
}
