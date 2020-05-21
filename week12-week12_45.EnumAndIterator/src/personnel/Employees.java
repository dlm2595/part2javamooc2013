/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Denzel
 */
public class Employees {
    private ArrayList<Person> people;
    
    public Employees() {
        this.people = new ArrayList();
    }
    
    public void add(Person person) {
        //adds the parameter person to the employees
        this.people.add(person);
    }
    
    public void add(List<Person> persons)  {
        //adds the parameter list of people to the employees
        this.people.addAll(persons);
    }
    public void print() {
        //prints all the employees
        Iterator<Person> peopleIt = this.people.iterator();
        while (peopleIt.hasNext()) {
            System.out.println(peopleIt.next());
        }
    }
    
    public void print(Education education)  {
        //prints all the employees, who have the same education as the one specified as parameter
        Iterator<Person> peopleIt = this.people.iterator();
        while (peopleIt.hasNext()) {
            Person p = peopleIt.next();
            if (p.getEducation()==education) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> peopleIt = this.people.iterator();
        while (peopleIt.hasNext()) {
            if (peopleIt.next().getEducation()==education) {
                peopleIt.remove();
            }
        }
    }
}
