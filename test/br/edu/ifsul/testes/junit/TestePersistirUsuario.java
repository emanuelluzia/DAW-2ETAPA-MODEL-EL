 package br.edu.ifsul.testes.junit;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Autor;
import br.edu.ifsul.modelo.Catalogo;
import br.edu.ifsul.modelo.Formato;
import br.edu.ifsul.modelo.Idioma;
import br.edu.ifsul.modelo.Livraria;
import br.edu.ifsul.modelo.Livro;
import br.edu.ifsul.modelo.Usuario;

import java.util.Calendar;

import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePersistirUsuario {
    
    EntityManager em;
    
    public TestePersistirUsuario() {}
    
    @Before
    public void setUp() {
        em = EntityManagerUtil.getEntityManager();
    }
    
    @After
    public void tearDown() {
        em.close();
    }
    
    @Test
    public void teste(){
        boolean exception = false;
        try {
	
            Usuario u = new Usuario();
            u.setApelido("usuario");
            u.setAtivo(true);
            u.setNome("xd");
            u.setSenha("12345");
            em.getTransaction().begin();//            c.adicionarLivro(em.find(Livro.class, "Teste_Livro_ISBN"));
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e){
            exception = true;
            e.printStackTrace();
        }
        Assert.assertEquals(false, exception);
    }
    
}