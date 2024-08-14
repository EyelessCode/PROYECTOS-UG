package Interfaz;

import javafx.beans.property.SimpleStringProperty;

public class Formula1Data {
    private final SimpleStringProperty column1;
    private final SimpleStringProperty column2;

    public Formula1Data(String col1, String col2) {
        this.column1 = new SimpleStringProperty(col1);
        this.column2 = new SimpleStringProperty(col2);
    }

    public String getColumn1() {
        return column1.get();
    }

    public void setColumn1(String col1) {
        column1.set(col1);
    }

    public String getColumn2() {
        return column2.get();
    }

    public void setColumn2(String col2) {
        column2.set(col2);
    }
}

