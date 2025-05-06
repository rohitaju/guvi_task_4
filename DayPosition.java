import java.util.*;
public class DayPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day index you want ");
        int Days = sc.nextInt();

        switch (Days){
            case 0:
                System.out.println("sun");
                break;
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;

            case 6:
                System.out.println("sat");
                break;
            default:
                System.out.println("invalid input you have entered");
                break;
        }


    }
}
