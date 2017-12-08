import com.bailian.service.product.ProductServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductServiceApplication.class)
public class TestELK {

    @Test
    public void contextLoads() {
    }

    //private Logger logger = Logger.getLogger(getClass());
    private Logger logger = LoggerFactory.getLogger(TestELK.class);

    //private static org.slf4j.Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);
    @Test
    public void test() throws Exception {

        for(int i=0;i<5;i++) {
            logger.info("输出info  ");
            logger.debug("输出debug+skkkw嗡嗡嗡kw");
            logger.error("输出error  嗡嗡嗡我");
        }
    }
}
