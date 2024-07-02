package ch.bbw.ff.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmService {

    private FilmRepository repo;

    @Autowired
    public FilmService(FilmRepository repo) {
        this.repo = repo;
    }

    public Iterable<Film> getFilmList() {
        return repo.findAll();
    }

    public List<Film> findFilmsByTitle(String title) {
        return repo.findByTitleContaining(title);
    }

    public List<Film> findFilmsByYearOfProduction(String yearOfProduction) {
        return repo.findByYearOfProductionContaining(yearOfProduction);
    }

    public List<Film> findFilmsByFormat(String format) {
        return repo.findByFormat(format);
    }

    public List<Film> findFilmsByDuration(String duration) {
        return repo.findByDuration(duration);
    }

    public List<Film> findFilmsByDirector(String director) {
        return repo.findByDirectorContaining(director);
    }

    public List<Film> findFilmsByDistributor(String distributor) {
        return repo.findByDistributorContaining(distributor);
    }

    public void createFilm(Film film) {
        repo.save(film);
    }
}
