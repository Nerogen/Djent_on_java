package programming.with.classes;

public final class Train {
    private String destination;
    private int numberOfTrain;
    private String departureTime;

    public Train(String destination, int numberOfTrain, String departureTime) {
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

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public void getInfo(int numberOfTrain){
        if(numberOfTrain == this.numberOfTrain){
            System.out.println("Train{" +
                    "destination='" + destination + '\'' +
                    ", numberOfTrain=" + numberOfTrain +
                    ", departureTime='" + departureTime + '\'' +
                    '}');
        }
    }

}
