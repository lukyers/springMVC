import com.bin.springDemo.domain.User;
import com.bin.springDemo.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: hasMatchUser(String userName, String password)
     */
    @Test
    public void testHasMatchUser() throws Exception {
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "1111");
        assertTrue(b1);
        assertTrue(!b2);
    }

    /**
     * Method: findUserByUserName(String userName)
     */
    @Test
    public void testFindUserByUserName() throws Exception {
//TODO: Test goes here...
        User user = userService.findUserByUserName("admin");
        assertEquals(user.getUserName(), "admin");
    }

    /**
     * Method: loginSuccess(User user)
     */
    @Test
    public void testLoginSuccess() throws Exception {
//TODO: Test goes here...
        User user = userService.findUserByUserName("admin");
        user.setUserId(1);
        user.setUserName("admin");
        user.setLastIp("192.168.12.8");
        user.setLastVisit(new Date());
        userService.loginSuccess(user);
    }
}
