package org.example;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Netflix {
    private List<Movie> movie;

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

    public void watchTV(){
        for (Movie m:movie) {
            m.getMovieName();
        }
    }
}
