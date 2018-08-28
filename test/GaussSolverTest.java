/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

/**
 *
 * @author Dr. Baharav
 */
public class GaussSolverTest {


    /**
     * Test of Solve method, of class GaussSolver.
     */
    @Test
    public void t2_testSolveSimpleCaseII() {
        System.out.print("Solve: Simple case II. 3x3");
        GaussSolver instance ;
        double[][] A = {{1,2,-1},{-1,2,3},{-1,1,2}} ;
        double[]   b = {2,12,7};
        instance = new GaussSolver(A,b);
        double[] expResult = {1,2,3};
        double[] result = instance.Solve();
        assertArrayEquals(expResult, result, 0.01);
        System.out.println(" --> Passed successfuly");
    }
    
    
    /**
     * Test of Solve method, of class GaussSolver.
     */
    /*
    @Test
    public void t1_testSolveSimpleCaseI() {
        System.out.print("Solve: Simple case I. 2x2 ");
        // GaussSolver instance = new GaussSolver(new double[][] {{1,2},{3,4}},new double[] {5,11});
        GaussSolver instance ;
        double[][] A = {{1,2},{3,4}} ;
        double[]   b = {5,11};
        instance = new GaussSolver(A,b);
        double[] expResult = {1,2};
        double[] result = instance.Solve();
        assertArrayEquals(expResult, result, 0.01);
        System.out.println(" --> Passed successfuly");
    }
    
    
    @Test
    public void t3_testSolveZeros() {
        System.out.print("Solve: Zeros. 3x3");
        GaussSolver instance ;
        double[][] A = {{1,2,-1},{-1,0,0},{-1,1,2}} ;
        double[]   b = {2,-1,7};
        instance = new GaussSolver(A,b);
        double[] expResult = {1,2,3};
        double[] result = instance.Solve();
        assertArrayEquals(expResult, result, 0.01);
        System.out.println(" --> Passed successfuly");
    }

    @Test
    public void t4_testSolveZeros() {
        System.out.print("Solve: Zeros after first manipulation. 3x3");
        GaussSolver instance ;
        double[][] A = {{1,2,-1},{-1,-2,0},{-1,1,2}} ;
        double[]   b = {2,-5,7};
        instance = new GaussSolver(A,b);
        double[] expResult = {1,2,3};
        double[] result = instance.Solve();
        assertArrayEquals(expResult, result, 0.01);
        System.out.println(" --> Passed successfuly");
    }

    @Test
    public void t5_testSolveZeros() {
        System.out.print("Solve: Zeros in first top element. 3x3");
        GaussSolver instance ;
        double[][] A = {{0,2,-1},{-1,-2,0},{-1,1,2}} ;
        double[]   b = {1,-5,7};
        instance = new GaussSolver(A,b);
        double[] expResult = {1,2,3};
        double[] result = instance.Solve();
        assertArrayEquals(expResult, result, 0.01);
        System.out.println(" --> Passed successfuly");
    }

    @Test
    public void t6_testNoSolution() {
        System.out.print("Solve: NoSolution. 3x3");
        GaussSolver instance ;
        double[][] A = {{0,2,-1},{0,2,-1},{-1,1,2}} ;
        double[]   b = {1,2,7};
        instance = new GaussSolver(A,b);
        double[] result = instance.Solve();
        assertNull(result);
        System.out.println(" --> Passed successfuly");
    }

    @Test
    public void t7_testNoInfiniteSolution() {
        System.out.print("Solve: NoSolution. 3x3");
        GaussSolver instance ;
        double[][] A = {{0,2,-1},{0,2,-1},{-1,1,2}} ;
        double[]   b = {1,1,7};
        instance = new GaussSolver(A,b);
        double[] result = instance.Solve();
        assertNull(result);
        System.out.println(" --> Passed successfuly");
    }
 */
    
}
