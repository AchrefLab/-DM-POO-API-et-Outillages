package mvn.webproject.TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;



import mvn.webproject.TP3.model.Addresse;
import mvn.webproject.TP3.model.Reponse;
import mvn.webproject.TP3.model.ReponseAPI;

@Controller 
public class MeteoController {
	
	@PostMapping("/meteo")
    public String CoordGPS(Addresse adresse, Model model) {
        model.addAttribute("adresse",adresse.getAdresse());
        model.addAttribute("codepostal",adresse.getCodePostal());
        
        String UrlGPS = "https://api-adresse.data.gouv.fr/search/?q=" + adresse.getAdresse()+"&postcode="+adresse.getCodePostal();

        RestTemplate restTemplate = new RestTemplate();
        Reponse reponse = restTemplate.getForObject( UrlGPS , Reponse.class);
        String city = reponse.getFeatures().get(0).getProperties().getCity();
        float x = reponse.getFeatures().get(0).getProperties().getX();
        float y = reponse.getFeatures().get(0).getProperties().getY();
        double lat = reponse.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        double lon =reponse.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        model.addAttribute("city",city);
        model.addAttribute("lat", lat);
        model.addAttribute("lon", lon);
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        
        
        
        String UrlMeteo="http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=d96633cde1b7128e7e16659517e32ff6&lang=fr&units=metric";
        ReponseAPI reponseMeteo=restTemplate.getForObject(UrlMeteo, ReponseAPI.class);
        model.addAttribute("description", reponseMeteo.getWeather().get(0).getDescription());
        model.addAttribute("temperature",reponseMeteo.getMain().getTemp());
        model.addAttribute("humidite",reponseMeteo.getMain().getHumidity());
        model.addAttribute("feelslike",reponseMeteo.getMain().getFeels_like());
        model.addAttribute("pressure",reponseMeteo.getMain().getPressure());
        return "meteo";
    }
}
