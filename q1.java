import java.util.*;
public class q1{
    public static int add(int i1,int i2){
        return i1+i2;
    }
    public static float add(float i1,float i2){
        return i1+i2;
    }
    public static int add(String i1,String i2){
        int num1=Integer.parseInt(i1);
        int num2=Integer.parseInt(i2);
        return num1+num2;
    }
    public static int add(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int add(String[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            int num=Integer.parseInt(arr[i]);
            sum=sum+num;
        }
        return sum;
    }

    public static int minus(int i1,int i2){
        return i1-i2;
    }
    public static float minus(float i1,float i2){
        return i1-i2;
    }
    public static int minus(String i1,String i2){
        int num1=Integer.parseInt(i1);
        int num2=Integer.parseInt(i2);
        return num1-num2;
    }
    public static int minus(int[] arr){
        int m=0;
        for(int i=0;i< arr.length;i++)
        {
            m=m-arr[i];
        }
        return m;
    }
    public static int minus(String[] arr){
        int m=0;
        for(int i=0;i< arr.length;i++)
        {
            int num=Integer.parseInt(arr[i]);
            m=m+num;
        }
        return m;
    }

    public static int multiply(int i1,int i2){
        return i1*i2;
    }
    public static float multiply(float i1,float i2){
        return i1*i2;
    }
    public static int multiply(String i1,String i2){
        int num1=Integer.parseInt(i1);
        int num2=Integer.parseInt(i2);
        return num1*num2;
    }
    public static int multiply(int[] arr){
        int pr=0;
        for(int i=0;i< arr.length;i++)
        {
            pr=pr*arr[i];
        }
        return pr;
    }
    public static int multiply(String[] arr){
        int pr=1;
        for(int i=0;i< arr.length;i++)
        {
            int num=Integer.parseInt(arr[i]);
            pr=pr*num;
        }
        return pr;
    }

    public static float divide(float i1,float i2){
        return i1+i2;
    }
    public static float divide(String i1,String i2){
        float num1=Float.parseFloat(i1);
        float num2=Float.parseFloat(i2);
        if (num2!=0)
            return num1/num2;
        else
            System.out.println("infinite ");
            return 0;
    }


    public static void main(String [] args)
    {
        System.out.println(" 3 + 5 = "+add("3","5"));
        System.out.println(" 3 / 0 = "+divide("3","0"));
        String [] arr={"4","4","4"};
        System.out.println("The sum of the array is "+add(arr)+" and the product is "+ multiply(arr));
    }
}

