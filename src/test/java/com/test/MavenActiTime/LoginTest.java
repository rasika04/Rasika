package com.test.MavenActiTime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTime.BaseTest;
import com.pages.MavenActiTime.PomActitimeLogin;

public class LoginTest extends BaseTest
{
   @Test
   public void login() throws IOException
   {
	  PomActitimeLogin login=new PomActitimeLogin(driver);
	  login.loginMethod();
	  
   }
}
