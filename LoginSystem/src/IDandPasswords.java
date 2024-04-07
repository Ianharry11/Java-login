import java.util.HashMap;

public class IDandPasswords {
     
	 HashMap<String,String> logininfo= new HashMap<String,String>();
	 
	 IDandPasswords(){
		 
		 logininfo.put("Ian","9998876");
		 logininfo.put("Michez","Ianmaina11");
		 logininfo.put("BroCode","abc123");
		 	 
	 }
	 
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
