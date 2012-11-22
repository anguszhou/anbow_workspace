package jdbc.util;

import java.io.InputStream;
import java.util.Properties;

public class DBConfig
{
  private Properties pro=new Properties();
  
  private String path="dbinfo.properties";
  
  private static DBConfig dbconfig;
  
  private DBConfig()
  {
	  readConfig();
  }

	private void readConfig()
  {
	  InputStream in=null;
	  
	  try{
		  in=ClassLoader.getSystemResourceAsStream(path);
		  
		  pro.load(in);		  
		  
	  }catch(Exception e)
	  {
		  
	  }
	  
  }
	public synchronized static DBConfig getInstance()
	{
		if(dbconfig==null)
		
			dbconfig=new DBConfig();
		
		return dbconfig;
	}
	public String getValue(String key)
	{
		return pro.getProperty(key);
	}
	public static void main(String[] args)
	{
		System.out.println(DBConfig.getInstance().getValue("db_url"));
	}
}
