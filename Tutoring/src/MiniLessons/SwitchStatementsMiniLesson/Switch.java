package MiniLessons.SwitchStatementsMiniLesson;
// MiniLessons.SwitchStatementsMiniLesson.Switch.java
/*
Experimenting with classic switch statements by making the program print out the day of the week depending on the
number assigned to the integer "day."
By Soleil Vivero
*/

public class Switch {
    public static void main(String[] args){
        int day = 5;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
