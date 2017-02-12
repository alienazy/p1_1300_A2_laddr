import java.io.*;
import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;
import java.math.*;

 class Main {
    

   
 public static void main(String[] args) throws Exception {
          
   Scanner scan = new Scanner (new File ("in.txt"));
//Scanner scan = new Scanner (System.in);
int t=scan.nextInt();
int x=0;
    int y=0;
    int z=0;
for (int i=0;i<t;i++){
    x=x+scan.nextInt();
    y=y+scan.nextInt();
    z=z+scan.nextInt();
}
           
if ((x==0) && (y==0) && (z==0)) {
    System.out.println("YES");
}else
{
        System.out.println("NO");

}
           

 


    

    scan.close();
  }
}


   
 

  