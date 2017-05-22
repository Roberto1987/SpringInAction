package javaconfig.componentscannotactive.test;



import javaconfig.componentscannotactive.src.models.CompactDisc;
import javaconfig.componentscannotactive.src.models.MediaPlayer;
import javaconfig.componentscannotactive.src.soundsystem.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rob on 5/22/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdMustNotBeNull(){
        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void cdPlayerMustNotBeNull(){
        assertNotNull(player);
        player.play();
    }
}
