/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;
import reference.domain.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Denzel
 */
public class FilmComparator implements Comparator<Film> {
    private final Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film film1, Film film2) {
        int film1Mean = 0;
        int film2Mean = 0;
        for (Rating rating : ratings.get(film1)) film1Mean+=rating.getValue();
        for (Rating rating : ratings.get(film2)) film2Mean+=rating.getValue();
        
        return film2Mean/ratings.get(film2).size() - film1Mean/ratings.get(film1).size();
    }
    
}
