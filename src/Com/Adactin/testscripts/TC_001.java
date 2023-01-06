package Com.Adactin.testscripts;
import org.testng.annotations.Test;

import Com.Adactin.lib.General;




public class TC_001 
{
	@Test
	public  void tc001() 
	{
		General obj=new General();
		obj.openApplication();

		obj.titile_Verify();
		
		
		
		
	}
	

}
