import com.codecool.butler.model.User;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserQueryTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void userFirstNameTest() {
        List<String> nameList = em.createNativeQuery("SELECT firstname FROM butleruser").getResultList();
        System.out.println(nameList);
    }

}
