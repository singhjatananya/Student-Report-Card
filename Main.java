import java.util.*;
public class Main{
    
    static int[] inputMarks(int[] sub){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5 ;i++){
          sub[i]=sc.nextInt();
        }       
      return sub;
    }

    static int calculateTotal(int[] sub){
        int sum = 0;
        for(int i = 0;i<5;i++){
            sum += sub[i];
        }
        return sum;
    }

    static double calculatePercentage(int[] sub){
        double percentage = (calculateTotal(sub)/500.0)*100;
        return percentage;
    }

    static void displayResult(int[] sub){
        String result;
         System.out.println("*------------REPORT CARD--------------*");
         System.out.printf("%-15s %5s %10s%n", "Subject","Marks", "Result");
         System.out.println("_______________________________________");
         boolean allPass =true;
        for(int i =0 ;i<5;i++){
             if(sub[i]>=27){
          result = "PASS";
        }else{
            result= "FAIL";
            allPass=false;
        }
            System.out.printf("%-15s %5d %10s%n", "Subject"+(i+1),sub[i],result);
    }
     System.out.println("_______________________________________");
     System.out.printf("%-15s %5d%n", "Total", calculateTotal(sub));
      System.out.println("_______________________________________");
     System.out.printf("%-15s %5.2f%%%n", "Percentage", calculatePercentage(sub));
      System.out.println("_______________________________________");
     if(allPass ==true && calculatePercentage(sub)>=33){
        System.out.printf("%-15s %5s%n", "Result: ","PASS" );
     }else{
      System.out.printf("%-15s %5s%n", "Result", "FAIL");
     }
       
    }
    

    public static void main(String args[]){
        int arr[] = new int[5];
          System.out.println("Enter marks for five subjects:");
         arr = inputMarks(arr);
        displayResult(arr);
      
}
}

