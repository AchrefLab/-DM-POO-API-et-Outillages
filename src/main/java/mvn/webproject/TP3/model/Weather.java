package mvn.webproject.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	private int id;
	private String description;
	
	private String mainMeteo;
	  public int getId() {
	      return id;
	  }
	
	  public void setId(int id) {
	      this.id = id;
	  }
	
	  public String getDescription() {
	      return description;
	  }
	
	  public void setDescription(String description) {
	      this.description = description;
	  }
	
	  public String getMainMeteo() {
	      return mainMeteo;
	  }
	
	  public void setMainMeteo(String mainMeteo) {
	      this.mainMeteo = mainMeteo;
	  }
	
	  @Override
	  public String toString() {
	      return "id: "+id+", description: "+description+", main:"+mainMeteo;
	  }
}
