import java.util.*;
public class q2 {
    public class CurrencyConverter {
        public static float convert(String base,float currvalue,String target) {
            String [] arr={"PKR","Pound","Dirham","INR","BDT"};
            float [] arr1={236,0.88F,3.67F,79,104,142};
            float newvalue=0,result=0;

                newvalue= currvalue/236;
            System.out.println(newvalue);

            for(int i=0;i< arr.length;i++)
            {
                if (arr[i]==target){
                    result=newvalue*arr1[i];
                }
            }
            return result;
        }
    }
    public static void main(String []args){

        System.out.println("360 PKR to Pound IS "+CurrencyConverter.convert("PKR",500,"Pound"));
    }
}
