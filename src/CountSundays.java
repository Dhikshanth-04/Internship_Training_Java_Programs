import java.util.*;
public class CountSundays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        int start = 0;
        switch (day) {
            case "mon": start = 1; break;
            case "tue": start = 2; break;
            case "wed": start = 3; break;
            case "thu": start = 4; break;
            case "fri": start = 5; break;
            case "sat": start = 6; break;
            case "sun": start = 7; break;
        }

        int fSunday = 8-start;
        int sundays = 0;
        if(n>=fSunday){
            sundays = 1+(n-fSunday)/7;
        }
        System.out.println(sundays);
    }   
}
