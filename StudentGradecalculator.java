import java.util.Scanner;

public class StudentGradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int scoreTotal = 0;
        String var = "a";
        char Grade;


        System.out.println("Enter your marks out of 100: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }


        System.out.println("Your Marks of respective subjects are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " = " + marks[i]);
//            System.out.format("Your marks are:\nChemisry: \nMaths: \nPhysics: \nAI: \nML: "+marks[0]+marks[1])+marks[2]+marks[3]+marks[4]);
        }

        for (int i = 0; i < marks.length; i++) {
            scoreTotal += marks[i];
//            System.out.println("Your total score is: "+ scoreTotal);
        }
        System.out.println("Total Score = " + scoreTotal);


        float avgPercentage = scoreTotal / 5;
        System.out.println("Average Percentage = " + avgPercentage + "%");


        int roundedPercentage = Math.round(avgPercentage);



        if (roundedPercentage > 95 && roundedPercentage<=100) {
            var = "A+";
        }
        else if (roundedPercentage >= 90 && roundedPercentage<=95) {
            var = "A";
        }
        else if(roundedPercentage>85 && roundedPercentage<=90) {
            var = "B+";
        }
        else if(roundedPercentage>=80 && roundedPercentage<=85) {
            var = "B";
        }
        else if(roundedPercentage>75 && roundedPercentage<=80){
            var = "C+";
        }
        else if(roundedPercentage>=70 && roundedPercentage<=75){
            var = "C";
        }
        else if(roundedPercentage>=50 && roundedPercentage<=70){
            var = "D";
        }
         else if(roundedPercentage>=35 && roundedPercentage<=50){
             var = "E";
        }
         else{
             var = "F";
        }

        System.out.println("Your Grade: "+var);


        switch (var){
             case "A+":
                 System.out.println("You Rocked!!");
                 break;
             case "A":
                 System.out.println("Excellent!!");
                 break;
             case "B+":
                 System.out.println("Well Done!");
                 break;
             case "B":
                 System.out.println("Very Good!");
                 break;
             case "C+":
                 System.out.println("Good");
                 break;
             case "C":
                 System.out.println("Can be Better");
                 break;
             case "D":
                 System.out.println("Average");
                 break;
             case "E":
                 System.out.println("You Passed!!");
                 break;
             case "F":
                 System.out.println("Failed!!!");
                 break;
             default:
                 System.out.println("Invalid Grade.");
           }
    }
}
