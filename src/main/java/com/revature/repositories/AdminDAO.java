package com.revature.repositories;

import java.util.List;

import com.revature.models.Admin;

public interface AdminDAO {
	
	public List<Admin> findAll();
	public Admin findById(int id);
	public Admin findByLogIn (String logIn);
	public boolean insert(Admin e);
	public boolean update(Admin e);
	public List<Admin> findApprove();


}
