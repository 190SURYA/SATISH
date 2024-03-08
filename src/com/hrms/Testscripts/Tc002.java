package com.hrms.Testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Global;

public class Tc002 {
	 //public static void main(String args[]) {
    @Test
    public void tc002() {
        //Test Steps
    DOMConfigurator.configure("log4j.xml");
Global g= new Global();    
    g.openApplication();
    g.login();
    g.enterFrame();
    g.addNewEmp();
    g.exitFrame();
    g.logout();
    g.closeApplication();


}
}