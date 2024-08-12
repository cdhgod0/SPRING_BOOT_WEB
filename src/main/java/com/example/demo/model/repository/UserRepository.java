package com.example.demo.model.repository;
import com.example.demo.model.domain.User;
import jakarta.persistence.EntityManager;
import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository{ //	Entity정보, PK값 자료형
    private final EntityManager em = null;

        // Create, Update
        public void save(User user) {
            em.persist(user);
        }
    
        // Delete
        public void remove(Long id) {
            em.remove(findById(id));
        }
    
        // Read
        public User findById(Long id) {
            return em.find(User.class, id);
        }
    
        public User findByName(String findName) {
            return em.createQuery("SELECT u FROM User u WHERE u.name = :findName", User.class)
                    .setParameter("findName", findName)
                    .getSingleResult();
        }
    
        public List<User> findAll() {
            return em.createQuery("SELECT u FROM User u", User.class)
                    .getResultList();
        }
}