package entity;

public class Account {
    private int id;
    private String username;
    private String password;
    private double balace;
    private int status;

    public Account() {

    }

    public Account(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, double balace) {
        this.username = username;
        this.password = password;
        this.balace = balace;
    }

    public Account(String password, double balace, int status) {
        this.password = password;
        this.balace = balace;
        this.status = status;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalace() {
        return balace;
    }

    public void setBalace(double balace) {
        this.balace = balace;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
