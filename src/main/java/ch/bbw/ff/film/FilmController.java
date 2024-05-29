package ch.bbw.ff.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmController{

    @Autowired
    private FilmService filmService;


    @GetMapping("/index")
    public String filmSuchen(Model model){
        model.addAttribute("filmSuchen",filmService.getFilmList());
        return"index";
    }
    @GetMapping("/listeFilm")
    public String showFilm(Model model){
        model.addAttribute("filmlist",filmService.getFilmList());
        return"listeFilm";
    }

    
}

