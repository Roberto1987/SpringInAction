package xmlconfig.test;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xmlconfig.src.models.CompactDisc;
import xmlconfig.src.models.MediaPlayer;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rob on 5/22/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "beans.xml")
public class CDPlayerTest {

    private ApplicationContext setup;

    //@Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Before
    public void contextCreation(){
        setup = new ClassPathXmlApplicationContext("beans.xml");
        assertNotNull(setup);
    }


    @Test
    public void cdMustNotBeNull(){
        assertNotNull("Application Context not initialized",setup);
        cd = (CompactDisc)setup.getBean("compactDisc");
        assertNotNull(cd);
    }

    @Test
    public void cdPlayerMustNotBeNull(){
        assertNotNull("Player not initialized",player);
        player.play();
    }
}
