/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Denzel
 */
import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> unique;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        unique = new HashSet();
        duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (unique.contains(characterString)) duplicates++;
        
        unique.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return unique;
    }

    @Override
    public void empty() {
        unique.clear();
        duplicates = 0;
    }
    
}
