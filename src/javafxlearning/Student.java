package javafxlearning;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    public StringProperty name = new SimpleStringProperty(this, "name", "");

    public StringProperty getNameProperty() {
        return name;
    }
    
    public String getName(){
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }
    
}
