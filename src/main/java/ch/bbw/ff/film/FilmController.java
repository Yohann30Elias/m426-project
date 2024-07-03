package ch.bbw.ff.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/index")
    public String filmSuchen(Model model) {
        model.addAttribute("filmSuchen", filmService.getFilmList());
        return "index";
    }

    @GetMapping("/listeFilm")
    public String getFilms(@RequestParam(value = "title", required = false) String title,
                           @RequestParam(value = "yearOfProduction", required = false) String yearOfProduction,
                           @RequestParam(value = "format", required = false) String format,
                           @RequestParam(value = "duration", required = false) String duration,
                           @RequestParam(value = "director", required = false) String director,
                           @RequestParam(value = "distributor", required = false) String distributor,
                           Model model) {


        List<Film> films = (List<Film>) filmService.getFilmList();


        if (title != null && !title.isEmpty()) {
            films = filmService.findFilmsByTitle(title);
        }
        if (yearOfProduction != null && !yearOfProduction.isEmpty()) {
            List<Film> filteredFilms = filmService.findFilmsByYearOfProduction(yearOfProduction);
            films.retainAll(filteredFilms);
        }
        if (format != null && !format.isEmpty()) {
            List<Film> filteredFilms = filmService.findFilmsByFormat(format);
            films.retainAll(filteredFilms);
        }
        if (duration != null && !duration.isEmpty()) {
            List<Film> filteredFilms = filmService.findFilmsByDuration(duration);
            films.retainAll(filteredFilms);
        }
        if (director != null && !director.isEmpty()) {
            List<Film> filteredFilms = filmService.findFilmsByDirector(director);
            films.retainAll(filteredFilms);
        }
        if (distributor != null && !distributor.isEmpty()) {
            List<Film> filteredFilms = filmService.findFilmsByDistributor(distributor);
            films.retainAll(filteredFilms);
        }

        model.addAttribute("title", title);
        model.addAttribute("films", films);
        return "listeFilm";
    }
    @GetMapping("/veranstaltungen")
    public String veranstaltungen(Model model) {
        model.addAttribute("veranstaltungen", filmService.getFilmList());
        return "veranstaltungen";
    }
}

