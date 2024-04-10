package ch.bbw.ff.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService{

    private FilmRepository repo;

    @Autowired
    public FilmService(FilmRepository repo){
        this.repo=repo;
    }

    public Iterable<Film> getFilmList(){
        return repo.findAll();
    }

    public void createFilm(Film film){

        repo.save(film);
    }

}

