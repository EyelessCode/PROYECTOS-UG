package modelo;

public class SprintResult {
    private int sprintResultId;
    private int raceId;
    private int driverId;
    private int constructorId;
    private int number;
    private int grid;
    private int position;
    private String positionText;
    private int positionOrder;
    private float points;
    private int laps;
    private String time;
    private int miliseconds;
    private int fastestLap;
    private String fastestLapTime;
    private int statusId;
    
    public SprintResult(int sprintResultId, int raceId, int driverId, int constructorId, int number, int grid,
            int position, String positionText, int positionOrder, float points, int laps, String time, int miliseconds,
            int fastestLap, String fastestLapTime, int statusId) {
        this.sprintResultId = sprintResultId;
        this.raceId = raceId;
        this.driverId = driverId;
        this.constructorId = constructorId;
        this.number = number;
        this.grid = grid;
        this.position = position;
        this.positionText = positionText;
        this.positionOrder = positionOrder;
        this.points = points;
        this.laps = laps;
        this.time = time;
        this.miliseconds = miliseconds;
        this.fastestLap = fastestLap;
        this.fastestLapTime = fastestLapTime;
        this.statusId = statusId;
    }

    public int getSprintResultId() {
        return sprintResultId;
    }

    public void setSprintResultId(int sprintResultId) {
        this.sprintResultId = sprintResultId;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public int getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(int positionOrder) {
        this.positionOrder = positionOrder;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMiliseconds() {
        return miliseconds;
    }

    public void setMiliseconds(int miliseconds) {
        this.miliseconds = miliseconds;
    }

    public int getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(int fastestLap) {
        this.fastestLap = fastestLap;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    
}
