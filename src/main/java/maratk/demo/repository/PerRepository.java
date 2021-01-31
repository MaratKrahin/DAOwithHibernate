package maratk.demo.repository;

import maratk.demo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(
                "SELECT p FROM Person p WHERE p.cityOfLiving LIKE :city")
                .setParameter("city", city)
                .getResultList();
    }
}
