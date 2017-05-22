package javaconfig.componentscannotactive.src.soundsystem;


import javaconfig.componentscannotactive.src.models.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by rob on 5/22/17.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing "+title +"by "+artist);
    }
}
