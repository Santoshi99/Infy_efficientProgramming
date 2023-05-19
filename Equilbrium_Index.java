


import java.io.*;
import java.util.*;
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
      InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r);  
       int output = -1;
       String str = br.readLine();
       String[] ch = str.split("((,\\s)|,)");
        int[] numbers = new int[ch.length];
        for(int i=0;i<ch.length;i++){
           numbers[i]= Integer.valueOf(ch[i]);
          }
          int leftSum=0,rightSum=0;
        for(int i=1;i<numbers.length;i++){
            leftSum+=numbers[i];
        }
        if(leftSum==0)
            output=0;
        for(int i=0;i<numbers.length-1;i++){
            rightSum+=numbers[i];
        }
        if(rightSum==0)
            output= numbers.length-1;
        leftSum=0;
        rightSum=0;
        for(int i=0;i<numbers.length;i++){
            leftSum+=numbers[i];
            for(int j=i+2;j<numbers.length;j++){
                rightSum+=numbers[j];
            }
            if(leftSum==rightSum)
            {
                output=i+1;
                break;
            }
            else
                rightSum=0;
        }
      System.out.println(output);
    }
}
