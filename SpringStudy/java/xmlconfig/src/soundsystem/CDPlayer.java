package xmlconfig.src.soundsystem;

import org.springframework.stereotype.Component;
import xmlconfig.src.models.CompactDisc;
import xmlconfig.src.models.MediaPlayer;

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
