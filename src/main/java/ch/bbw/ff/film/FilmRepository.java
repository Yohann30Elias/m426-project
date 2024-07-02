package ch.bbw.ff.film;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    List<Film> findByTitleContaining(String title);
    List<Film> findByYearOfProductionContaining(String yearOfProduction);
    List<Film> findByFormat(String format);
    List<Film> findByDuration(String duration);
    List<Film> findByDirectorContaining(String director);
    List<Film> findByDistributorContaining(String distributor);
}
