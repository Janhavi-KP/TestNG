package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyMethods {
		@Test(priority=1)
		void openApp(){
			Assert.assertEquals(1, 2);
		}
		@Test(priority=2,dependsOnMethods= {"openApp"})//if the openApp is passed then only login will execute if not it wont execute
		void login(){
			Assert.assertEquals(1, 1);
		}
		@Test(priority=3,dependsOnMethods= {"login"})
		void search(){
			Assert.assertEquals(1, 1);
		}
		@Test(priority=4)
		void advanceSearch(){
			Assert.assertEquals(1, 1);
		}
		@Test(priority=5)
		void logout(){
			Assert.assertEquals(1, 1);
		}
}
//we are not writung any webdriver methods...for understanding we are writing only assert statements