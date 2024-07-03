package ch.bbw.ff;

import ch.bbw.ff.film.FilmController;
import ch.bbw.ff.film.FilmService;
import ch.bbw.ff.film.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FilmControllerTest {

    @Mock
    private FilmService filmService;

    @InjectMocks
    private FilmController filmController;

    @BeforeEach
    public void setUp() {
        Film film1 = new Film();
        film1.setTitle("Titanic");
        film1.setYearOfProduction("1997");

        Film film2 = new Film();
        film2.setTitle("Titanic");
        film2.setYearOfProduction("1953");

        List<Film> titanicFilms = Arrays.asList(film1, film2);

        when(filmService.findFilmsByTitle("Titanic")).thenReturn(titanicFilms);
    }

    @Test
    public void testFindFilmsByTitle_Titanic() {
        String viewName = filmController.getFilms("Titanic", null, null, null, null, null, null);

        verify(filmService, times(1)).findFilmsByTitle("Titanic");

        assertEquals("listeFilm", viewName);
    }
}
