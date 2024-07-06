package modelo;

import java.sql.Date;

public class Race {
    private int raceId;
    private int year;
    private int round;
    private int circuitId;
    private String name;
    private String time;
    private Date fp1_date;
    private String url;
    private String fp1_time;
    private Date fp2_date;
    private String fp2_time;
    private Date fp3_date;
    private String fp3_time;
    private Date quali_date;
    private String quali_time;
    private Date sprint_date;
    private String sprint_time;
    
    public Race(int raceId, int year, int round, int circuitId, String name, String time, Date fp1_date, String url,
            String fp1_time, Date fp2_date, String fp2_time, Date fp3_date, String fp3_time, Date quali_date,
            String quali_time, Date sprint_date, String sprint_time) {
        this.raceId = raceId;
        this.year = year;
        this.round = round;
        this.circuitId = circuitId;
        this.name = name;
        this.time = time;
        this.fp1_date = fp1_date;
        this.url = url;
        this.fp1_time = fp1_time;
        this.fp2_date = fp2_date;
        this.fp2_time = fp2_time;
        this.fp3_date = fp3_date;
        this.fp3_time = fp3_time;
        this.quali_date = quali_date;
        this.quali_time = quali_time;
        this.sprint_date = sprint_date;
        this.sprint_time = sprint_time;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(int circuitId) {
        this.circuitId = circuitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getFp1_date() {
        return fp1_date;
    }

    public void setFp1_date(Date fp1_date) {
        this.fp1_date = fp1_date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFp1_time() {
        return fp1_time;
    }

    public void setFp1_time(String fp1_time) {
        this.fp1_time = fp1_time;
    }

    public Date getFp2_date() {
        return fp2_date;
    }

    public void setFp2_date(Date fp2_date) {
        this.fp2_date = fp2_date;
    }

    public String getFp2_time() {
        return fp2_time;
    }

    public void setFp2_time(String fp2_time) {
        this.fp2_time = fp2_time;
    }

    public Date getFp3_date() {
        return fp3_date;
    }

    public void setFp3_date(Date fp3_date) {
        this.fp3_date = fp3_date;
    }

    public String getFp3_time() {
        return fp3_time;
    }

    public void setFp3_time(String fp3_time) {
        this.fp3_time = fp3_time;
    }

    public Date getQuali_date() {
        return quali_date;
    }

    public void setQuali_date(Date quali_date) {
        this.quali_date = quali_date;
    }

    public String getQuali_time() {
        return quali_time;
    }

    public void setQuali_time(String quali_time) {
        this.quali_time = quali_time;
    }

    public Date getSprint_date() {
        return sprint_date;
    }

    public void setSprint_date(Date sprint_date) {
        this.sprint_date = sprint_date;
    }

    public String getSprint_time() {
        return sprint_time;
    }

    public void setSprint_time(String sprint_time) {
        this.sprint_time = sprint_time;
    }
}
