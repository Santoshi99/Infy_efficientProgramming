
import java.io.*;
import java.util.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        int nofvi = s.nextInt();
        int nofH = s.nextInt();
        int HealthOfH = s.nextInt();
        int[] HealthOfVi = new int[nofvi];
        int sum = 0;
        for(int i=0;i<nofvi;i++){
            HealthOfVi[i] = s.nextInt();
            sum+=HealthOfVi[i];
        }
        int start =0;
        while(nofH<nofvi&&((HealthOfH*nofH)<sum)){
            sum-=HealthOfVi[start];
            start++;
        }
        System.out.println(start);
    }
}
