/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import reference.comparator.*;
import reference.domain.*;
import java.util.Map;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Comparator;

/**
 *
 * @author Denzel
 */
public class Reference {
    private RatingRegister register;
    
    public Reference(RatingRegister ratingRegister) {
        this.register = ratingRegister;
    }
    
    public Film recommendFilm2(Person person) {
        Map<Film, List<Rating>> ratings = this.register.filmRatings();
        FilmComparator comparator = new FilmComparator(ratings);
        List<Film> filmList = this.register.films();
        Collections.sort(filmList, comparator);
        try {
            return filmList.get(0);
        } catch(Exception e) {
            return null;
        }
    }
    
    public Film recommendFilm(Person person) {
        List<Person> people = this.register.reviewers();
        if (people.contains(person)) {
            Map<Integer, Person> sims = new HashMap();
            int personalSim;
            for (Person i : people) {
                if (i.equals(person)) continue;
                personalSim = 0;
                for (Film j:this.register.personalFilms(person)) {
                    if (this.register.personalFilms(i).contains(j)) {
                        personalSim+=this.register.getRating(person, j).getValue()*this.register.getRating(i, j).getValue();
                    }
                }
                sims.put(personalSim, i);
            }
            
            int bestMatch = -9999;
            for (int i:sims.keySet()) if (i>bestMatch) bestMatch=i;
            Person closest = sims.get(bestMatch);
            Film recommendation = null;
            int bestWatched = 1;
            for (Film f : this.register.getPersonalRatings(closest).keySet()) {
                if (this.register.personalFilms(person).contains(f)) continue;
                if (this.register.getPersonalRatings(closest).get(f).getValue() > bestWatched) {
                    bestWatched = this.register.getPersonalRatings(closest).get(f).getValue();
                    recommendation = f;
                }
            }
            
            return recommendation;
        } 
        return recommendFilm2(person);
    }
    
}
