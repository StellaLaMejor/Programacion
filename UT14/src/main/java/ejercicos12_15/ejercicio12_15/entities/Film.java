package ejercicos12_15.ejercicio12_15.entities;

import java.util.Objects;

public class Film implements Comparable<Film>{

    private final int filmId;
    private final String title;
    private final String description;
    private final int releaseYear;
    private final int length;
    private final String rating;

    public Film(int filmId, String title, String description, int releaseYear, int length, String rating) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
        this.rating = rating;
    }
    public int getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getLength() {
        return length;
    }

    public String getRating() {
        return rating;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film film)) return false;
        return filmId == film.filmId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId);
    }

    @Override
    public int compareTo(Film o) {
        return Integer.compare(this.filmId, o.filmId);
    }


}
