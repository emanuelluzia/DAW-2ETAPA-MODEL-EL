package br.edu.ifsul.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;
    
    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("DAW-2019-1-5N2-Trabalho");
        }
        
        if (em == null) {
            em = emf.createEntityManager();
        }
        
        return em;
        
    }
}
