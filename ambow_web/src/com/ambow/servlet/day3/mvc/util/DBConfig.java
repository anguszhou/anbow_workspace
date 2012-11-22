package com.ambow.servlet.day3.mvc.util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 
 * @author allandou
 * 单例模式
 */
public class DBConfig {
		//申明Properties
		private Properties pro = new Properties();
		//说明配置的路径
		private String path ="dbinfo.properties";
		//实例引用
		private static DBConfig dbconfig;
			
		private DBConfig(){
			
			readCongig();
		}
		/**
		 *  负责读取配置文件，获得inputstream流,加载到Properties里面
		 */
		private void readCongig() {
			
			InputStream in = null;
			
			try {
				//通过ClassLoad来获得流
				//in = ClassLoader.getSystemResourceAsStream("dbinfo.properties");
				
				//in = DBConfig.class.getClassLoader().getResourceAsStream(path);
				
				in = this.getClass().getClassLoader().getResourceAsStream(path);
				pro.load(in);
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		/**
		 * 
		 * @return DBConfig
		 *  因为私有化构造函数，所以要提供外界获得当前对象的方法
		 */
		public synchronized static DBConfig getInstance(){
			
			if(dbconfig== null){
				
				dbconfig = new DBConfig();
				
			}
			return dbconfig;
		}
		/**
		 * 
		 * @param key
		 * @return Stirng
		 * 封装Properties 通过key得到value的值
		 */
		public String getValue(String key){
			
			return pro.getProperty(key);
		}
		
		public static void main(String[] args) {
			
			System.out.println(DBConfig.getInstance().getValue("db_url"));
		}
}










