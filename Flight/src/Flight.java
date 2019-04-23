
public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.destination = null;
        this.number = 0;
    }


    Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }


    void display(){
        System.out.println("Number: " + this.number );
        System.out.println("Destination: " + this.destination );

    }

    String getDestination(){

        return this.destination;
    }


    int getNumber(){

        return this.number;
    }
}

