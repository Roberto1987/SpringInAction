package javaconfig.componentscanactive.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javaconfig.componentscanactive.src.models.CompactDisc;
import javaconfig.componentscanactive.src.models.MediaPlayer;
import javaconfig.componentscanactive.src.soundsystem.CDPlayerConfig;

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
