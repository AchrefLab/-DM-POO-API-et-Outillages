package mvn.webproject.TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mvn.webproject.TP3.model.Addresse;

@Controller
public class AdresseController {
	@GetMapping("/adresse")
    public String adresse (Model model ) {
        model.addAttribute("adresse",new Addresse());
        return "adresse";
    }
}
