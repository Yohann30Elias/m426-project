package ch.bbw.ff.film;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "film")
public class Film implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    private String title;
    private String format;
    private String director;
    private int year_ofProduction;
    private int duration;
    private String distributor;

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear_ofProduction() {
        return year_ofProduction;
    }

    public void setYear_ofProduction(int year_ofProduction) {
        this.year_ofProduction = year_ofProduction;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
