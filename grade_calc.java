import java.util.Scanner;

public class grade_calc{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total number of subjects: ");
        int total_subjects = sc.nextInt();

        //array to store marks
        int[] marks = new int[total_subjects];

        for(int i=0; i<total_subjects; i++){
            while(true){
                System.out.printf("Enter marks of subject %d (out of 100): ", (i+1));
                marks[i] = sc.nextInt();
                if(marks[i]<=100 && marks[i]>=0){
                    break;
                }
                else{
                    System.out.println("Marks should be between 0 to 100");
                }
            }
        }
        int total = 0;

        //Calculate Total Marks
        for(int i=0; i<total_subjects; i++){
            total += marks[i];
        }
        System.out.println("Total marks obtained in all subjects are: " + total);

        //Calculate Average Percentage
        float avg = (float)total/total_subjects;
        System.out.println("Average percentage is: " + avg);


        //Assign Grades based on average
        if(avg>=90)
	        System.out.print("Grade A");
	    else if(avg>=80 && avg<90)
	        System.out.print("Grade B");
	    else if(avg>=70 && avg<80)
		    System.out.print("Grade C");
	    else if(avg>=60 && avg<70)
		    System.out.print("Grade D");
	    else if(avg>=50 && avg<60)
		    System.out.print("Grade E");
	    else
		    System.out.print("Grade F");

        sc.close();
    }
}