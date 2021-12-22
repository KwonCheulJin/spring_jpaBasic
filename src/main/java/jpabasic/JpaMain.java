package jpabasic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.getId() = " + findMember.getId());
//            System.out.println("findMember.getName() = " + findMember.getName());
//            em.remove(findMember);
//            em.persist(member);
//            findMember.setName("HelloJPA");
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                .getResultList();
//            for (Member member1 : result) {
//                System.out.println("member1 = " + member1.getName());
//            }
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());
            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA2");
            //영속
//            System.out.println("=== BEFORE ===");
//            em.persist(member);
//            em.detach(member);
//            System.out.println("=== AFTER ===");
//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);

//            System.out.println("result = " + (findMember1 == findMember2));

//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2);
            //영속
            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZZ");


            System.out.println("=================");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
