package com.nozha.etudiant.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Etudiant {
	
     	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	    private Long idEtudiant;
     	
	    private String nomEtudiant ;
	
	    private String niveauEtudiant ;
	  
	    private Date date;
	    
	    @ManyToOne
	    private Formation formation;




		public Etudiant() {
			super();
		}



		public Etudiant(String nomEtudiant, String niveauEtudiant, Date date) {
			super();
		
			this.nomEtudiant = nomEtudiant;
			this.niveauEtudiant = niveauEtudiant;
			this.date = date;
		}



		public Long getIdEtudiant() {
			return idEtudiant;
		}



		public void setIdEtudiant(Long idEtudiant) {
			this.idEtudiant = idEtudiant;
		}



		public String getNomEtudiant() {
			return nomEtudiant;
		}



		public void setNomEtudiant(String nomEtudiant) {
			this.nomEtudiant = nomEtudiant;
		}



		public String getNiveauEtudiant() {
			return niveauEtudiant;
		}



		public void setNiveauEtudiant(String niveauEtudiant) {
			this.niveauEtudiant = niveauEtudiant;
		}



		public Date getDate() {
			return date;
		}



		public void setDate(Date date) {
			this.date = date;
		}



		@Override
		public String toString() {
			return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", niveauEtudiant="
					+ niveauEtudiant + ", date=" + date + "]";
		}



	

			    
}
