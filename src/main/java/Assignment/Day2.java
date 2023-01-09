package Assignment;


import java.util.Scanner;
public class Day2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        System.out.println(display(year,month));
    }
    private static int display(int year, int month) {
        int days_in_month = 0;
        if(month==1){
            days_in_month = 31;
        }
        else if(month==2){
            if((year%400==0) || ((year%100!=0) && (year%4==0))){
                days_in_month = 29;
            }
            else {
                days_in_month = 28;
            }
        }
        else if(month==3){
            days_in_month = 31;
        }
        else if(month==4){
            days_in_month = 30;
        }
        else if(month==5){
            days_in_month = 31;
        }
        else if(month==6){
            days_in_month = 30;
        }
        else if(month==7){
            days_in_month = 31;
        }
        else if(month==8){
            days_in_month = 31;
        }
        else if(month==9){
            days_in_month = 30;
        }
        else if(month==10){
            days_in_month = 31;
        }
        else if(month==11){
            days_in_month = 30;
        }
        else if(month==12){
            days_in_month = 31;
        }
        return days_in_month;
    }
}
