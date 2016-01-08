/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author One
 */
public class BSTTest {
    
    public BSTTest() {
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
     * Test of main method, of class BST.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BST.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BST.
     */
    @org.junit.Test
    public void testInsert() {
        System.out.println("insert");
        Object data = null;
        BST instance = new BST();
        int ndata=12;
        instance.insert(ndata);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BST.
     */
    @org.junit.Test
    public void testSearch() {
        System.out.println("search");
        Object toSearch = null;
        BST instance = new BST();
        boolean expResult = false;
        int n=0;
        boolean result = instance.search(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BST.
     */
    @org.junit.Test
    public void testDelete() {
        System.out.println("delete");
        Object toDelete = null;
        BST instance = new BST();
        int n =15;
        instance.delete(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BST.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        BST instance = new BST();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of preOrderTraversal method, of class BST.
     */
    @org.junit.Test
    public void testPreOrderTraversal() {
        System.out.println("preOrderTraversal");
        BST instance = new BST();
        instance.preOrderTraversal();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of inOrderTraversal method, of class BST.
     */
    @org.junit.Test
    public void testInOrderTraversal() {
        System.out.println("inOrderTraversal");
        BST instance = new BST();
        instance.inOrderTraversal();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class BST.
     */
    @org.junit.Test
    public void testClone() {
        System.out.println("clone");
        BST instance = new BST();
        BST expResult = null;
        BST result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class BST.
     */
    @org.junit.Test
    public void testHeight() {
        System.out.println("height");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of countLeaves method, of class BST.
     */
    @org.junit.Test
    public void testCountLeaves() {
        System.out.println("countLeaves");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.countLeaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restore method, of class BST.
     */
    @org.junit.Test
    public void testRestore() {
        System.out.println("restore");
        Comparable[] pre = null;
        Comparable[] in = null;
        BST instance = new BST();
        instance.restore(pre, in);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of width method, of class BST.
     */
    @org.junit.Test
    public void testWidth_0args() {
        System.out.println("width");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.width();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of width method, of class BST.
     */
    @org.junit.Test
    public void testWidth_BSTNode_int() {
        System.out.println("width");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.width(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of diameter method, of class BST.
     */
    @org.junit.Test
    public void testDiameter() {
        System.out.println("diameter");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.diameter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class BST.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        BST instance = new BST();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
