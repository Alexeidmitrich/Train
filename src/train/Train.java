package train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    List<Schedule> scheduleList = new ArrayList<>();

    public void addSchedule(int number, String pointOfDeparture, String destination, String date, String time) {
        Schedule schedule = new Schedule(number, pointOfDeparture, destination, date, time);
        scheduleList.add(schedule);
    }

    public void printAllSchedule() {
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule result = scheduleList.get(i);
            result.printInformation();
        }
    }

    public void enterUserNumber(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры поезда");
        int b = sc.nextInt();
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule train = scheduleList.get(i);
            if (b == number) {
                train.printInformation();
                break;
            }
        }
    }
    public void enterUserPointOfDeparture(String pointOfDeparture) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры поезда");
        String b = sc.nextLine();
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule train = scheduleList.get(i);
            if (b == pointOfDeparture) {
                train.printInformation();
                break;
            }
        }
    }
    public void enterUserDestination(String destination) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры поезда");
        String b = sc.nextLine();
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule train = scheduleList.get(i);
            if (b == destination) {
                train.printInformation();
                break;
            }
        }
    }
    public void enterUserDate(String date) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры поезда");
        String b = sc.nextLine();
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule train = scheduleList.get(i);
            if (b == date) {
                train.printInformation();
                break;
            }
        }
    }
    public void enterUserTime(int number, String pointOfDeparture, String destination, String date, String time) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры поезда");
        String b = sc.nextLine();
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule train = scheduleList.get(i);
            if (b == time) {
                train.printInformation();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Train a = new Train();
        a.addSchedule(10, "Sankt-Petersburg", "Tula", "28.03.2022", "11*00");
        a.addSchedule(108, "Sankt-Petersburg", "Dno", "29.03.2022", "01*15");
        a.addSchedule(44, "Sankt-Petersburg", "Pskov", "27.03.2022", "19*45");


    }
}
