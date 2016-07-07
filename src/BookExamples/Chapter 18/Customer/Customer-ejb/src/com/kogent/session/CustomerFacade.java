package com.kogent.session;
import com.kogent.entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CustomerFacade implements CustomerFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Customer customer) {
        em.persist(customer);
    }

    public void edit(Customer customer) {
        em.merge(customer);
    }

    public void remove(Customer customer) {
        em.remove(em.merge(customer));
    }

    public Customer find(Object id) {
        return em.find(com.kogent.entity.Customer.class, id);
    }

    public List<Customer> findAll() {
        return em.createQuery("select object(o) from Customer as o").getResultList();
    }

}
