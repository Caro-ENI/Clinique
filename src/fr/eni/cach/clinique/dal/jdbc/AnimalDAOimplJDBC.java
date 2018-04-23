package fr.eni.cach.clinique.dal.jdbc;

import java.util.List;

import fr.eni.cach.clinique.bo.Animal;
import fr.eni.cach.clinique.dal.AnimalDAO;
import fr.eni.cach.clinique.dal.DalException;

public class AnimalDAOimplJDBC implements AnimalDAO {

	@Override
	public Animal selectById(int id) throws DalException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void insert(Animal value) throws DalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Animal value) throws DalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(Animal value) throws DalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Animal> selectAnimauxByClient(int codeClient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// Méthodes inutiles
	//**************************************************************
	@Override
	public List<Animal> selectAll() throws DalException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//*******************************************************************

}
