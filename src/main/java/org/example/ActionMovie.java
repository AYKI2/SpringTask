package org.example;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActionMovie implements Movie{
    private String title;

    public String getTitle() {
        return title;
    }

    public void getMovieName() {
        System.out.println("Title: " + getTitle());
    }
}
