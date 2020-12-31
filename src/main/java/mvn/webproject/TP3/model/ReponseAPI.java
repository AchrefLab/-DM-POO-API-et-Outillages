package mvn.webproject.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReponseAPI {
    int id;
    Coord coord;
    String name;
    String message;
    String cod;
    String base;
    @JsonProperty("main")
    Main main;
    List<Weather> weather=new ArrayList<>();
    Sys sysMeteo;
    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }



    public Sys getSysMeteo() {
        return sysMeteo;
    }

    public void setSysMeteo(Sys sysMeteo) {
        this.sysMeteo = sysMeteo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "id: "+id+", name: "+name+"weather"+weather+", message: "+message+", code: "+cod;
    }
}
