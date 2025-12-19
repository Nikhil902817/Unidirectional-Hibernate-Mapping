package org.jsp.Mapping_Operation2;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverMapping {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // ===== Principal =====
        Principal p1 = new Principal(101, "Mukesh", 20000);

     // ===== Branch Head =====
        BranchHead head = new BranchHead(301, "Vaibhav", "Pune", null);

        // ===== Branches =====
        Branche br1 = new Branche(201, "Computer", 502, head);
        Branche br2 = new Branche(202, "Civil", 503, head);
        Branche br3 = new Branche(203, "Mechanical", 504, head);
        Branche br4 = new Branche(204, "IT", 505, head);

        List<Branche> branchList =
                Arrays.asList(br1, br2, br3, br4);

        // ===== Re-attach list =====
        head = new BranchHead(301, "Vaibhav", "Pune", branchList);


        // ===== Drivers =====
        Driver d1 = new Driver(401, "Raju", 99887766);
        Driver d2 = new Driver(402, "Ganesh", 97887766);

        // ===== Buses =====
        Bus bus1 = new Bus(501, 5432, "Tata", d1);
        Bus bus2 = new Bus(502, 3456, "Mahindra", d2);

        List<Bus> busList =
                Arrays.asList(bus1, bus2);

        // ===== College =====
        List<Principal> principalList =
                Arrays.asList(p1);

        College c1 =
                new College(601, "SPCollege", "Pune",
                        principalList, busList, branchList);

        // ===== University =====
        University u =
                new University(701, "SPPU", "Pune",
                        Arrays.asList(c1));

        // ===== Persist =====
        et.begin();
        em.persist(u);   // CascadeType.ALL
        et.commit();

        em.close();
        emf.close();

        System.out.println("✅ Saved successfully (constructor-only)");
    }
}
