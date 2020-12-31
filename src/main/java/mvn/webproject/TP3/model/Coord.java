package mvn.webproject.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
    List<Double> coords=new ArrayList<>();

    public List<Double> getCoords() {
        return coords;
    }

    public void setCoords(List<Double> coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "lon"+coords.get(0)+", lat"+coords.get(1);
    }
}