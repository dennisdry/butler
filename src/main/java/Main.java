import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import butlerchat.Butlerservlet;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("butlerPU");
        EntityManager em = emf.createEntityManager();
    }
}
