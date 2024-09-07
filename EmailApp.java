import emailAdminApp.*;
public class EmailApp{
	
	public static void main(String[] args){
	
		Email em1=new Email("Shubhangee","Agrawal");

		//em1.setMailboxCapacity(capacity);
		//em1.setAlternateEmail("sa@gmail.com");
		//System.out.println(em1.getAlternateEmail());

		System.out.println(em1.showInfo());
	}
}