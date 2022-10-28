package com.nozha.etudiant;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.nozha.etudiant.entities.Etudiant;
import com.nozha.etudiant.entities.Formation;
import com.nozha.etudiant.repos.EtudiantRepository;


@SpringBootTest
class EtudiantApplicationTests {
@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Test
	public void testCreateEtudiant() {
	Etudiant prod = new Etudiant("ebtihel","3eme",new Date());
	etudiantRepository.save(prod);
	}
	
	@Test
	public void testFindEtudiant()
	{
	Etudiant p = etudiantRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	
	public void testUpdateEtudiant()
	{
	Etudiant p = etudiantRepository.findById(1L).get();
	p.setNomEtudiant("eya");
	etudiantRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteEtudiant()
	{
		etudiantRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousEtudiants()
	{
	List<Etudiant> prods = etudiantRepository.findAll();
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomEtudiant()
	{
	List<Etudiant> prods = etudiantRepository.findByNomEtudiant("iphone");
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomEtudiantContains ()
	{
	List<Etudiant> prods=etudiantRepository.findByNomEtudiantContains("iphone X");
	for (Etudiant p : prods)
	{
	System.out.println(p);
	
	} }
	
	
	@Test
	public void testfindByFormation()
	{
	Formation cat = new Formation();
	cat.setIdFormation(1L);
	
	List<Etudiant> prods = etudiantRepository.findByFormation(cat);
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByFormationId()
	{
	List<Etudiant> prods = etudiantRepository.findByFormationId(1L);
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	 }
	
	@Test
	public void testfindByOrderByNomEtudiantAsc()
	{
	List<Etudiant> prods = 
	etudiantRepository.findByOrderByNomEtudiantAsc();
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	}





	

	
	
	
}
