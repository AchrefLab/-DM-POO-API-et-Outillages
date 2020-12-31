package mvn.webproject.TP3.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry
{
    private String type;
    List<Double> coordinates = new ArrayList<Double>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {return "Geometry{ type: " + type  + ", coordinates: " + coordinates + '}'+"\n";
    }
}