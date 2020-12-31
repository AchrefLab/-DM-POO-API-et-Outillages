package mvn.webproject.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reponse {

	 private String type;
     private String version;
     List<Features> features = new ArrayList<>();
     private String attribution;
     private String licence;
     private String query;
     private float limit;



     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }

     public String getVersion() {
         return version;
     }

     public void setVersion(String version) {
         this.version = version;
     }

     public List<Features> getFeatures() {
         return features;
     }

     public void setFeatures(ArrayList<Features> features) {
         this.features = features;
     }

     public String getAttribution() {
         return attribution;
     }

     public void setAttribution(String attribution) {
         this.attribution = attribution;
     }

     public String getLicence() {
         return licence;
     }

     public void setLicence(String licence) {
         this.licence = licence;
     }

     public String getQuery() {
         return query;
     }

     public void setQuery(String query) {
         this.query = query;
     }

     public float getLimit() {
         return limit;
     }

     public void setLimit(float limit) {
         this.limit = limit;
     }

	 @Override
	 public String toString() {
	     return  "{type: " + type + "\n"+", version: "+ version + "\n" + ", features: " + features + "\n"+", attribution: "+attribution+ "\n"+" , licence: "+licence+", query: "+query+ "\n"+", limite: "+limit+ "\n";
	 }
 }