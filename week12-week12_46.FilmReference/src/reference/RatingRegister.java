/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
/**
 *
 * @author Denzel
 */
public class RatingRegister {
    private final HashMap<Film, List<Rating>> anonRegister;
    private final HashMap<Person, Map<Film, Rating>> personRegister;
    
    public RatingRegister() {
        this.anonRegister = new HashMap();
        this.personRegister = new HashMap();
    }
    
    public void addRating(Film film, Rating rating) {
        if (this.anonRegister.containsKey(film)) {
            this.anonRegister.get(film).add(rating);
        } else {
            this.anonRegister.put(film, new ArrayList());
            this.anonRegister.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {
        try {
            return this.anonRegister.get(film);
        } catch (Exception e) {
            return null;
        }
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.anonRegister;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (this.personRegister.containsKey(person)) {
            if (!this.personRegister.get(person).containsKey(film)) {
                this.personRegister.get(person).put(film, rating);
            }
        } else {
            this.personRegister.put(person, new HashMap());
            this.personRegister.get(person).put(film, rating);
        }
        this.addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film) {
        if (this.personRegister.get(person).containsKey(film)) return this.personRegister.get(person).get(film);
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (this.personRegister.containsKey(person)) return this.personRegister.get(person);
        this.personRegister.put(person, new HashMap());
        return this.personRegister.get(person);
    }
    
    public List<Person> reviewers() {
        ArrayList<Person> toReturn = new ArrayList();
        for (Person p : this.personRegister.keySet()) toReturn.add(p);
        return toReturn;
    }
    
    public List<Film> films() {
        ArrayList<Film> toReturn = new ArrayList();
        for (Film f : this.anonRegister.keySet()) toReturn.add(f);
        return toReturn;
    }
    
    public List<Film> personalFilms(Person person) {
        ArrayList<Film> toReturn = new ArrayList();
        for (Film f : this.personRegister.get(person).keySet()) toReturn.add(f);
        return toReturn;
    }
}
