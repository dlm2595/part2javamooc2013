/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Denzel
 */
public class RingingCentre {
    private Map<Bird, List<String>> obs;
    
    public RingingCentre() {
        this.obs = new HashMap();
    }
    
    public void observe(Bird observed, String place) {
        if(obs.containsKey(observed)) {
            obs.get(observed).add(place);
        } else {
            obs.put(observed, new ArrayList());
            obs.get(observed).add(place);
        }
    }
    
    public void observations(Bird bird) {
        if (obs.containsKey(bird)) {
            System.out.println(bird + " observations: " + obs.get(bird).size());
            for (String i:obs.get(bird)) {
                System.out.println(i);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    }
}
