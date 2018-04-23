package fr.eni.cach.clinique.dal;

import java.util.List;

import fr.eni.cach.clinique.bo.Animal;

public interface AnimalDAO extends DAO<Animal>{
	
	public List <Animal> selectAnimauxByClient (int codeClient);
	

}
