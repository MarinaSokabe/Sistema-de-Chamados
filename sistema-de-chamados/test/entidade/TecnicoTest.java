/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31704786
 */
public class TecnicoTest {
    
    public TecnicoTest() {
    }
    
    //@BeforeClass
    //public static void setUpClass() {
    //}
    
    //@AfterClass
    //public static void tearDownClass() {
    //}
    
   // @Before
   // public void setUp() {
    //}
    
    //@After
   // public void tearDown() {
   // }

    @Test
    public void criarTecnicoTest(){
       Tecnico t = new Tecnico("fabio", 75589);
       assertEquals("fabio", t.toString());
       assertEquals(75589,t.getTelefone());
    } 
    
    @Test
    public void criarTecniconegativaTest(){
      Tecnico t = new Tecnico("fabio", -75589);
       assertEquals("fabio", t.toString());
       assertTrue(t.getTelefone()> 0);
    } 
 
    
}
