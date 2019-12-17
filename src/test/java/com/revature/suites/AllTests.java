package com.revature.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.revature.services.AccountServicesTest;
import com.revature.services.NewUserCreationTest;
import com.revature.services.UserAuthentTest;

@RunWith(Suite.class)
@SuiteClasses({AccountServicesTest.class, NewUserCreationTest.class, UserAuthentTest.class})

public class AllTests {

}
