/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Denzel
 */
public class Person {
    private final String name;
    private final Education education;
    
    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    
    public Education getEducation() {
        return this.education;
    }
    
    @Override
    public String toString() {
        return name + ", " + education;
    }
}
