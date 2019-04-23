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
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    //@BeforeClass
    //public static void setUpClass() {
    //}
    
    //@AfterClass
    //public static void tearDownClass() {
    //}
    
    //@Before
    //public void setUp() {
    //}
    
    //q@After
    //public void tearDown() {
    //}
       
    
   
     
    
    @Test
    public void criarUmaPessoaTest(){
        Pessoa p = new Pessoa("Meu Nome", 123456789);
        assertEquals("Meu Nome", p.getNome());
        assertEquals(123456789, p.getTelefone());
    } 
    
    @Test
    public void criarUmaPessoaComTelefoneNwgativo() {
        Pessoa p = new Pessoa ("Meu Nome", -123456789);
        assertTrue(p.getTelefone() > 0);
    }
    
    @Test(expected = Exception.class)
    public void criarUmaPessoaComTelefoneNegativoComExcecaoTest(){
        Pessoa p = new Pessoa("Meu Nome", -123456789);
    }
    
}
