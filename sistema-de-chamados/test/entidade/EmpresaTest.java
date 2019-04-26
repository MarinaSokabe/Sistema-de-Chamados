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

  
public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    //@BeforeClass
    //public static void setUpClass() {
    //}
    
   // @AfterClass
    //public static void tearDownClass() {
    //}
    
    //@Before
    //public void setUp() {
    //}
    
    //@After
    //public void tearDown() {
  //  }
  
    
    @Test
    public void criarEmpresaTest(){
       Empresa e = new Empresa(123, "deslizar de bariga");
       assertEquals(123, e.getNumeroContrato());
       assertEquals("deslizar de bariga", e.getNomeEmpresa());
    } 
     
    
    
}
