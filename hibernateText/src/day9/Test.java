package day9;

public class Test
{
public static void main(String[] args)
{
	/*Male male=new Male();
	
	male.setName("wangp");
	
	Female female = new Female();
	
	female.setName("liao");
	
	male.setFemale(female);
	
	female.setMale(male);
	
	System.out.println(male);*/
	
	IMaleDao dao = new MaleDaoImpl();
			
	//dao.addMale(male);
	
	dao.deleteMaleById(2);
	
	//System.out.println(male.getFemale());
	

}
}
