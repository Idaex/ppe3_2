/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Idaex
 */
public class InterfaceGraphiqueTest {
    
    public InterfaceGraphiqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connecte method, of class InterfaceGraphique.
     */
    @Test
    public void testConnecte() {
        System.out.println("connecte");
        Personne lutilisateur = null;
        InterfaceGraphique instance = new InterfaceGraphique();
        instance.connecte(lutilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deconnecte method, of class InterfaceGraphique.
     */
    @Test
    public void testDeconnecte() {
        System.out.println("deconnecte");
        InterfaceGraphique instance = new InterfaceGraphique();
        instance.deconnecte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of majConnexion method, of class InterfaceGraphique.
     */
    @Test
    public void testMajConnexion() {
        System.out.println("majConnexion");
        InterfaceGraphique instance = new InterfaceGraphique();
        instance.majConnexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of majModifInfos method, of class InterfaceGraphique.
     */
    @Test
    public void testMajModifInfos() {
        System.out.println("majModifInfos");
        InterfaceGraphique instance = new InterfaceGraphique();
        instance.majModifInfos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InterfaceGraphique.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterfaceGraphique.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
