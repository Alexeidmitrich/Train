package train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train{
    List<Schedule> scheduleList = new ArrayList<>();

    public void addSchedule(int number, String pointOfDeparture, String destination, String date, String time){
        Schedule schedule = new Schedule(number, pointOfDeparture, destination, date, time);
        scheduleList.add(schedule);
    }

    public void printAllSchedule() {
        for (int i = 0; i < scheduleList.size(); i++) {
            Schedule result = scheduleList.get(i);
            result.printInformation();
        }
    }

    public static void main(String[] args) {
        Train a = new Train();
        a.addSchedule(10,"Sankt-Petersburg", "Tula", "28.03.2022","11*00");
        a.addSchedule(108,"Sankt-Petersburg", "Dno", "29.03.2022","01*15");
        a.addSchedule(44,"Sankt-Petersburg", "Pskov", "27.03.2022","19*45");
        a.printAllSchedule();
    }
    public Object Departure() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер поезда");
        int n = in.nextInt();
        if (n == 10) {
            return scheduleList.get(0);
        } else if (n == 108) {
            return scheduleList.get(1);
        } else if (n == 44) {
            return scheduleList.get(2);
        }
        return null;
    }
}
