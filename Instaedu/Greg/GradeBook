package gradeBook;

import java.util.Scanner;

public class GradeBook {
        

public static void main(String [] args) {
        int [] totalExam;
        int [] totalQuiz;
        int [] totalHw;
        String [] student = new String[200];
        int studentSize = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to Gradebook");
        System.out.println("Please provide grade item details");
            
        System.out.print("Exams   (number, points, weight):");
        double examNum = s.nextInt();
        double examPoint = s.nextDouble();
        double examWeight = s.nextDouble();
        System.out.println();
        System.out.print("Quizzes   (number, points, weight):");
        double quizNum = s.nextInt();
        double quizPoint = s.nextDouble();
        double quizWeight = s.nextDouble();
        System.out.println();
        System.out.print("Homework   (number, points, weight):");
        double homeworkNum = s.nextInt();
        double homeworkPoint = s.nextDouble();
        double homeworkWeight = s.nextDouble();
        System.out.println();

        totalExam = new int[examNum*200];
        int examSize = 0; //how many exams are in the array
        totalQuiz = new int[quizNum*200];
        int quizSize = 0; //how many quizzes are in the array
        totalHw = new int[homeworkNum*200];
        int hwSize = 0; //how many homeworks are in the array

        boolean running = true;
        while (running){
                System.out.println("------------------");
                System.out.println("What would you like to do?");
                System.out.println("-        1 Add student data");
                System.out.println("-        2 Display student grades & statistics");
                System.out.println("-        3 Plot grade distribution");
                System.out.println("-        4 Quit");
                System.out.print("Your Choice: ");
                int input = s.nextInt();
                if (input == 1) {                        
                        System.out.println("Enter Student Data:");
                        student(s, totalExam, examSize, totalQuiz, quizSize, totalHw, hwSize, student, studentSize);
                        examSize = examSize + examNum;
                        quizSize = quizSize + quizNum;
                        hwSize = hwSize + homeworkNum;
                        studentSize++;
                } else if (input == 2){
                        System.out.println("Display student grades and statistics");
                        //print out everything from all the arrays here
                } else if (input == 3){
                        System.out.println("Plot grade distribution");
                        //Make another method here for grade distribution
                } else if (input == 4){
                        running = false;
                        System.out.println("Goodbye!");
                } else {
                        System.out.println("input invalid please try again");        
                }       
        }
}

private static void enterStudentData(Scanner s, int [] totalExam, int examSize, int [] totalQuiz, int quizSize, int [] totalHw, int hwSize, String [] student, int studentSize) {
        String str = s.nextLine();

        int temp = str.indexOf(":");
        String name = str.substring(0, temp);
        student[studentSize] = name;
        studentSize++;
        String str2 = str.substring(str.indexOf(":")+1).trim();

        /*System.out.println(str.indexOf(":"));
        System.out.println(str.substring(0, str.indexOf(":")));
        System.out.println(str.substring(str.indexOf(":")+1));
        String str2 = str.substring(str.indexOf(":")+1).trim();*/

        String [] result = str2.split("[ ]+");
        for (int i = 0;i<result.length;i++) {
                char char0 = result[i].charAt(0);
                System.out.println(char0);
                switch (char0) {
                        case 'e':{
                                int exam = Integer.parseInt(result[i].substring(1));
                                totalExam[examSize] = exam;
                                examSize++;
                        } case 'q':{
                                int quiz = Integer.parseInt(result[i].substring(1));
                                totalQuiz[quizSize] = quiz;
                                quizSize++;
                        } case 'h':{
                                int hw = Integer.parseInt(result[i].substring(1));
                                totalHw[hwSize] = hw;
                                hwSize++;
                        }
                }
        }
}

       


















        String str = "Joe W. Smith: e100 e95 e87 q10 q10 q8 h10 h10 h10";
        
        System.out.println(str.indexOf(":"));
        System.out.println(str.substring(0, str.indexOf(":")));
        System.out.println(str.substring(str.indexOf(":")+1));
        
        
        
        String str2 = str.substring(str.indexOf(":")+1).trim();
        String[] result = str2.split("[ ]+");
        for (int i = 0;i<result.length;i++){
                char char0 = result[i].charAt(0);
                System.out.println(char0);
                switch (char0){
                        case 'e':{
                        int exam = Integer.parseInt(result[i].substring(1));
                        System.out.println("hi    "+exam);//add exam to MYARRAY
                        }
                        case 'q':{
                        //add quiz to MYARRAY
                        }
                        case 'h':{
                        //add quiz to MYARRAY
                        }
                }//switch
        }
        
        }
}        