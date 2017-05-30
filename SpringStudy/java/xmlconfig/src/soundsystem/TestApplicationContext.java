package xmlconfig.src.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlconfig.src.models.CompactDisc;

/**
 * Created by rob on 5/22/17.
 */
public class TestApplicationContext {
    public static void main(String[] args) {
        ApplicationContext setup = new ClassPathXmlApplicationContext("beans.xml");
        CompactDisc cd = (CompactDisc)setup.getBean("compactDisc");
        cd.play();
    }
}
