package modelo;

public class ConstructorStandings {
    private int constructorStandingId;
    private int raceId;
    private int constructorId;
    private float points;
    private String positionText;
    private int wins;
    
    
    public ConstructorStandings(int constructorStandingId, int raceId, int constructorId, float points,
            String positionText, int wins) {
        this.constructorStandingId = constructorStandingId;
        this.raceId = raceId;
        this.constructorId = constructorId;
        this.points = points;
        this.positionText = positionText;
        this.wins = wins;
    }


    public int getConstructorStandingId() {
        return constructorStandingId;
    }


    public void setConstructorStandingId(int constructorStandingId) {
        this.constructorStandingId = constructorStandingId;
    }


    public int getRaceId() {
        return raceId;
    }


    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }


    public int getConstructorId() {
        return constructorId;
    }


    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }


    public float getPoints() {
        return points;
    }


    public void setPoints(float points) {
        this.points = points;
    }


    public String getPositionText() {
        return positionText;
    }


    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }


    public int getWins() {
        return wins;
    }


    public void setWins(int wins) {
        this.wins = wins;
    }


}

