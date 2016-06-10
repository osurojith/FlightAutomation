package com.vikas.tests;

import org.junit.Test;

import com.vikas.util.BaseClass;

public class Registration extends BaseClass{
@Test
public void TestReg(){
	commonClass.Select("Osura", regPgObj.fname); 
	commonClass.Select("Liyanage", regPgObj.lname);
	commonClass.Select("osurojith@gmail.com", regPgObj.email);
	commonClass.Select("123osu", regPgObj.password);
	commonClass.Select("123osu", regPgObj.confirmpassword);
	commonClass.Click(regPgObj.createbtn);
}
}
