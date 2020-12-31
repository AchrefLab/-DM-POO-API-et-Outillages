package mvn.webproject.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    private String label;
    private float score;
    private String housenumber;
    private String id;
    private String name;
    private String postcode;
    private String citycode;
    private float x;
    private float y;
    private String city;
    private String context;
    private String type;
    private float importance;
    private String street;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public float getImportance() {
        return importance;
    }

    public void setImportance(float importance) {
        this.importance = importance;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Override
    public String toString() {
        return "Properties:{ label: " +label+", score: "+ score+"housenumber:  " +housenumber +",id:"+id+"name: " +name + ", postcode: "+postcode+", citycode: "+citycode+", x: "+x+", y: "+y+ ", city: "+city+ ", context: " +context+ ", type: "+ type+", importance: "+importance+ ", street: "+street+"}"+"/n";
    }

}