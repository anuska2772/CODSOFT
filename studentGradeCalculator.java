import java.util.Scanner;
public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of subjects=");
        int n=sc.nextInt();

        int marks[]=new int[n];
        int totMarks=0;
        double avgMarks=0.0;
        char grade;

        for(int i=0; i<n; i++){

            System.out.print("Enter marks in subject "+(i+1)+" out of 100=");
            marks[i]=sc.nextInt();
            totMarks+=marks[i];

        }

        

        avgMarks= (double)totMarks/n;


        if(avgMarks>=90){
            grade='A';
        }
        else if(avgMarks>=80){
            grade='B';
        }
        else if(avgMarks>=70){
            grade='C';
        }

        else if(avgMarks>=60){
            grade='D';
        }

        else if(avgMarks>=50){
            grade='E';
        }

        else{
            grade='F';
        }

        System.out.println("\nTotal marks obtained="+totMarks);
        System.out.println("Average marks obtained="+avgMarks);
        System.out.println("Grade Assigned="+grade+"\n");

        


        sc.close();

    }
    
    
}
