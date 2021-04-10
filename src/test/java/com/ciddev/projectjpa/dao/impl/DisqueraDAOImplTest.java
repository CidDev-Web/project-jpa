package com.ciddev.projectjpa.dao.impl;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import com.ciddev.projectjpa.dao.DisqueraDAO;
import com.ciddev.projectjpa.entity.Disquera;

public class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	@Test
	public void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Quijotero");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setStatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	@Test
	public void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9L);
		
		disqueraConsultada.setDescripcion("Disquera IronMaiden");
		
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	@Test
	public void testEliminar() {
		
		Long id = 9L;
		
		this.disqueraDAO.eliminar(id);
	}

	@Test
	public void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		
		assertTrue(disquerasConsultadas.size() > 0);
		
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	@Test
	public void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(9L);
		System.out.println(disquera.getDescripcion());
	}

}
