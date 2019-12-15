package com.revature.repositories;

import java.util.List;


import com.revature.models.Client;


public interface ClientDAO {
	
	public List<Client> findAll();
	public Client findById(int id);
	public Client findByLogIn (String logIn);
	public boolean insert(Client c);
	public boolean update(Client c);

}
