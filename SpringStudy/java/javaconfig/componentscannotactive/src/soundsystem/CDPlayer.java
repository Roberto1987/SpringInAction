package javaconfig.componentscannotactive.src.soundsystem;

import javaconfig.componentscannotactive.src.models.CompactDisc;
import javaconfig.componentscannotactive.src.models.MediaPlayer;
import org.springframework.stereotype.Component;

/**
 * Created by rob on 5/22/17.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;



    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        this.cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
