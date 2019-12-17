package com.revature.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.revature.services.AccountServicesTest;
import com.revature.services.AdminServicesTest;
import com.revature.services.ClientServicesTest;
import com.revature.services.EmployeeServicesTest;
import com.revature.services.UserAuthentTest;

@RunWith(Suite.class)
@SuiteClasses({AccountServicesTest.class, UserAuthentTest.class, ClientServicesTest.class, EmployeeServicesTest.class, AdminServicesTest.class})

public class AllTests {

}
