package programming.with.classes;

public class Train {
    private String destination;
    private String numberOfTrain;
    private String departureTime;

    public Train(String destination, String numberOfTrain, String departureTime){
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

}
