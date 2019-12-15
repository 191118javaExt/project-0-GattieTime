package com.revature.repositories;

import java.util.List;

import com.revature.models.Account;

public interface AccountDAO {
	
	public List<Account> findAll();
	public Account findById(int id);
	public List<Account> findByOwnerId (int id);
	public boolean insert(Account e);
	public boolean update(Account e);
	public List<Account> findApprove();

}
