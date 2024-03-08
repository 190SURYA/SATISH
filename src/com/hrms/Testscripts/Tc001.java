package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Global;


public class Tc001 {
	 @Test
     public void tc001() {
         //Test Steps
     DOMConfigurator.configure("log4j.xml");
     Global g = new Global();
     g.openApplication();
     g.login();
     g.logout();
     g.closeApplication();


}
}
