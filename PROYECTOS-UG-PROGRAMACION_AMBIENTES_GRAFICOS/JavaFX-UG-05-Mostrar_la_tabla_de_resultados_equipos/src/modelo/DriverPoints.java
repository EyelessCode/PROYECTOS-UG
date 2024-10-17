package modelo;

public class DriverPoints {
    private String driverName;
    private int totalPoints;

    public DriverPoints(String driverName, int totalPoints) {
        this.driverName = driverName;
        this.totalPoints = totalPoints;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

}
