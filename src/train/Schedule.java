package train;

public class Schedule{
    int number;
    String pointOfDeparture;
    String destination;
    String date;
    String time;

    public Schedule(int number, String pointOfDeparture, String destination, String date, String time){
        this.number = number;
        this.pointOfDeparture = pointOfDeparture;
        this.destination = destination;
        this.date = date;
        this.time = time;
    }
    public void printInformation(){
        System.out.println(number + " " + pointOfDeparture + " " + destination + " " + date + " " + time);
    }
}
