package com.nozha.etudiant.repos;



import com.nozha.etudiant.entities.Etudiant;
import com.nozha.etudiant.entities.Formation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//les methodes prédefinie

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByNomEtudiantContains(String nom);
	List<Etudiant> findByNomEtudiant(String nom);
	@Query("select p from Etudiant p where p.nomEtudiant like %?1 and p.prixEtudiant > ?2")
	List<Etudiant> testFindByNomEtudiant(String nom, Double prix);

	@Query("select p from Etudiant p where p.formation = ?1")
	List<Etudiant> findByFormation(Formation formation);
	List<Etudiant> findByFormationId(Long id);
	
	@Query("select p from Etudiant p order by p.nomEtudiant ASC, p.prixEtudiant DESC")
	List<Etudiant> trierEtudiantNomEtudiant();
	List<Etudiant> findByOrderByNomEtudiantAsc();




	
}