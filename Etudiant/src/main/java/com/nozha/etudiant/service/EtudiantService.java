package com.nozha.etudiant.service;

import java.util.List;

import com.nozha.etudiant.entities.Etudiant;
import com.nozha.etudiant.entities.Formation;




public interface EtudiantService {
	
	Etudiant saveEtudiant(Etudiant p);
	Etudiant updateEtudiant(Etudiant p);
	void deleteEtudiant(Etudiant p);
	void deleteEtudiantById(Long id);
	Etudiant getEtudiant(Long id);
	List<Etudiant> getAllEtudiants();
	List<Etudiant> findByNomEtudiant(String nom);
	List<Etudiant> findByNomEtudiantContains(String nom);

	List<Etudiant> findByFormation (Formation formation);
	List<Etudiant> findByFormationIdCat(Long id);
	List<Etudiant> findByOrderByNomEtudiantAsc();

	List<Etudiant> trierEtudiantNomEtudiant() ;



}
