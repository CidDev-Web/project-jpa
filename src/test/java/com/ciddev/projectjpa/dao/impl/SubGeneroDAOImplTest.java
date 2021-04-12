/**
 * 
 */
package com.ciddev.projectjpa.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import com.ciddev.projectjpa.dao.SubGeneroDAO;
import com.ciddev.projectjpa.entity.Genero;
import com.ciddev.projectjpa.entity.SubGenero;

/**
 * @author miguelcid
 * Clase test para comprobar el funcionamiento de los metodos del crud de subgenero
 */
public class SubGeneroDAOImplTest {
	
	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for {@link com.ciddev.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.ciddev.projectjpa.entity.SubGenero)}.
	 */
	@Test
	public void testGuardar() {
		
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Heavy");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setStatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setStatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.ciddev.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.ciddev.projectjpa.entity.SubGenero)}.
	 */
	@Test
	public void testActualizar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ciddev.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ciddev.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	public void testConsultar() {
		
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();
		
		assertTrue(subGenerosConsultados.size() > 0);
		
		for (SubGenero subGenero : subGenerosConsultados) {
			System.out.println("Subgenero: " + subGenero.getDescripcion());
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
		}
		
	}

	/**
	 * Test method for {@link com.ciddev.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	public void testConsultarById() {
		fail("Not yet implemented");
	}

}
