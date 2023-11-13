
import java.util.Scanner;


public class Teacher {
    public static void upload(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input course name");
        String Cname = scanner.nextLine();
        System.out.println("input Assignment title");
        String Atitle = scanner.nextLine();
        System.out.println("input Assignment description.");
        String Adesc = scanner.nextLine();
        System.out.println("input Assignment deadline. DD/MM/YYYY");
        String Dline = scanner.nextLine();
        System.out.println("input the full marks for assignment.");
        int Fmarks = scanner.nextInt();
        System.out.println("select file type \n1.pdf \t2.png \t3.jpeg");
        int filechoice = scanner.nextInt();
        String filetype = "";
        switch (filechoice){
            case 1:
                filetype ="pdf";
                break;
            case 2:
                filetype ="pdf";
                break;
            case 3:
                filetype ="pdf";
                break;                
        }
        System.out.println(" You have uploaded an assignment for course " + Cname + "\nThe assignment "
        + Atitle + " with description " + "\"" + Adesc+ "\"" + " due on " + Dline +".Full marks is " + Fmarks +
        ". Student needs to submit file type " + filetype);        
        
        
    }
    
    public static void view(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter student name, student ID or Student's HKID.");
        String searchname = scanner.nextLine();
        System.out.println("What would you like to view: \t1. Student schedule \t2. Student grades \t3. Student information");
        int viewchoice = scanner.nextInt();
        switch (viewchoice) {
            case 1:
                System.out.println("Student \"" + searchname +"\" Schedule \nMonday: Maths \nTuesday: English Lecture \nWednesday: Chinese");
                break;
            case 2:
                System.out.println("Student \"" + searchname +"\" Grades  \nEnglish: A\nChinese: B+\nMath: B- ");
                break;
            case 3:
                System.out.println("Student \"" + searchname +"\" Information \nAttendance: 80% \nCGPA: 3.0");
                break;
        }
    }
    
    public static void update(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter student name, student ID or Student's HKID.");
        String searchname = scanner.nextLine();
        System.out.println("What would you like to update: \t1. Student schedule \t2. Student grades \t3. Student information");
        int updatechoice = scanner.nextInt();
        scanner.nextLine();
        switch (updatechoice) {
            case 1:
                System.out.println("Student \"" + searchname +"\" Schedule \nMonday: Maths \nTuesday: English Lecture \nWednesday: Chinese \nWhich day to change\n1.Monday\n2.Tueaday\n3.Wednesday\n4.Thursday\n5.Friday ");
                String Uday = scanner.nextLine();
                System.out.println("What class to add.");
                String Uadd = scanner.nextLine();
                System.out.println("Student \"" + searchname +"\" has class " + Uadd +" on "+ Uday);
                break;
            case 2:
                System.out.println("Student \"" + searchname +"\" Grades  \nEnglish: A\nChinese: B+\nMath: B-\nWhat course to update?");
                String Ucourse = scanner.nextLine();
                System.out.println("Input updated grade.");
                String Ugrade = scanner.nextLine();
                System.out.println("Student \"" + searchname +"\" has grade " + Ugrade +" on "+ Ucourse);                
                break;
            case 3:
                System.out.println("Student \"" + searchname +"\" Information \nAttendance: 80% \nCGPA: 3.0\nWhat information to update?");
                String info = scanner.nextLine();
                System.out.println("Input updated information.");
                String Uinfo = scanner.nextLine();
                System.out.println("Student \"" + searchname +"\" has " + Uinfo +" on "+ info); 
                break;
        }
    }
    
    
    public static void main(String[] args) {
    System.out.println("Press 1 to upload files \n Press 2 to view student information \n Press 3 to update student academic record");
    Scanner scanner = new Scanner(System.in);
    
    int input = scanner.nextInt();
    switch(input){
        case 1:
            upload();
            break;
        case 2:
            view();
            break;
        case 3:
            update();
            break;
    } 
    }
}
