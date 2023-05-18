


import java.io.*;
import java.util.*;
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n!=0){
        int length = s.nextInt();
        int charlen = s.nextInt();
        String inputString = s.next();
        int[] alphArr = new int[26];
        char[] strArr = inputString.toCharArray();
            String newStr = "";
         for(int i=0;i<length;i++){
             alphArr[Integer.valueOf(strArr[i])-97]+=1;
             //System.out.println(alphArr[Integer.valueOf(strArr[i])-97]);
             if(alphArr[Integer.valueOf(strArr[i])-97]<=charlen){
                 newStr+=strArr[i];
             }
         }   
        System.out.println(newStr);
            n--;
    }
    }
}
