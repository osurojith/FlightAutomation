package com.vikas.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.vikas.tests.Home;
import com.vikas.tests.Registration;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Home.class,Registration.class
})
public class Test {

}
