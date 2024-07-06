package modelo;

public class PitStop {
    private int raceId; 
    private int driverId;
    private int stop;
    private int lap;
    private String time;
    private String duration;
    private int miliseconds;
    
    public PitStop(int raceId, int driverId, int stop, int lap, String time, String duration, int miliseconds) {
        this.raceId = raceId;
        this.driverId = driverId;
        this.stop = stop;
        this.lap = lap;
        this.time = time;
        this.duration = duration;
        this.miliseconds = miliseconds;
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

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getMiliseconds() {
        return miliseconds;
    }

    public void setMiliseconds(int miliseconds) {
        this.miliseconds = miliseconds;
    }

}
   