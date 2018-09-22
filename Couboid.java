import java.io.*;
import java.util.*;
  public class Cuboid{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter L:");
      int l=sc.nextInt();
      System.out.println("Enter B:");
      int b=sc.nextInt();
      System.out.println("Enter H:");
      int h=sc.nextInt();
      System.out.println("AREA:"+((2*l*b)+(2*l*h)+(2*b*h)));
      System.out.println("SURFACE:"+(l*b*h));
      }
    }  
      
