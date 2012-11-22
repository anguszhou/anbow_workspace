package day7;

public class test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        User user=new User(4,"zhoucong","asldfjk");
        
        IUserDao dao=new UserDaoImpl();
        
        dao.addUser(user);
        
        System.out.println("........");
        
        
	}
}
