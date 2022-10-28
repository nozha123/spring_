package com.nozha.etudiant.service;

import java.util.List;

import com.nozha.etudiant.entities.Etudiant;
import com.nozha.etudiant.entities.Formation;
import com.nozha.etudiant.repos.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Override
	public Etudiant saveEtudiant(Etudiant e) {
	
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		return etudiantRepository.save(e);
	}

	@Override
	public void deleteEtudiant(Etudiant e) {
		etudiantRepository.delete(e);
	}

	@Override
	public void deleteEtudiantById(Long id) {
		etudiantRepository.deleteById(id);
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		return etudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		return etudiantRepository.findAll();
	}

	
	@Override
	public List<Etudiant> findByNomEtudiant(String nom) {
	return etudiantRepository.findByNomEtudiant(nom);
	}
	@Override
	public List<Etudiant> findByNomEtudiantContains(String nom) {
	return etudiantRepository.findByNomEtudiantContains(nom);
	}
	


	@Override
	public List<Etudiant> findByFormation(Formation formation) {
		return etudiantRepository.findByFormation(formation); }

	

	@Override
	public List<Etudiant> findByFormationIdCat(Long id) {
		return etudiantRepository.findByFormationId(id) ;
		
	}

	@Override
	public List<Etudiant> findByOrderByNomEtudiantAsc() {

		return  etudiantRepository.findByOrderByNomEtudiantAsc();

	}

	@Override
	public List<Etudiant> trierEtudiantNomEtudiant(){

		return etudiantRepository.trierEtudiantNomEtudiant();
}


	}
