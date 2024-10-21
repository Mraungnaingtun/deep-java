package org.logant.StandardJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StandardJPACode {

    //1. Create an EntityManagerFactory
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    public void transferMoney(Long fromAccountId, Long toAccountId, Double amount) {
        // Create new EntityManager with EntityManagerFactory' Instance
        EntityManager em = emf.createEntityManager();

        // Create new EntityTransaction with EntityManager
        EntityTransaction transaction = em.getTransaction();

        try {
            //------transaction begin---------------
            transaction.begin();

            // Fetch accounts
            Account fromAccount = em.find(Account.class, fromAccountId);
            Account toAccount = em.find(Account.class, toAccountId);

            // Check if enough balance exists
            if (fromAccount.getBalance() < amount) {
                throw new RuntimeException("Insufficient funds");
            }

            // Perform the transfer
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);

            // ------ Commit the transaction------------
            transaction.commit();

            System.out.println("Transfer successful!");

        } catch (Exception e) {
            // -------- Rollback the transaction in case of error -------------
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;  // Rethrow the exception
        } finally {
            em.close();
        }
    }
}
