package xmlconfig.src.soundsystem;

import xmlconfig.src.models.CompactDisc;

/**
 * Created by rob on 5/22/17.
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Album "+title+" performed by "+artist);

    }
}
