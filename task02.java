import java.util.Scanner;
public class task02{
    public static void main(String[]args){
        //suppose there are five subjects
    Scanner sc=new Scanner(System.in);
int sum=0;
int average=0;
    for(int i=1;i<=5;i++){
        System.out.println("Enter your marks of subject "+ i+":");
           int a=sc.nextInt();
    
           sum=sum+=a;
           average=sum/5;
    }
           
           String grade;
           if(average<40){
            grade="F";
           }
           else if(average>=40&&average<=60){
            grade="C";
           }
            else if(average>=60&&average<=80){
            grade="B";
            }
            else {
                grade="A";
            }

    
    System.out.println("Total marks : "+sum);
    System.out.println("Average percentage: "+average+"%");
    System.out.println("grade:"+grade);

    }   
}
