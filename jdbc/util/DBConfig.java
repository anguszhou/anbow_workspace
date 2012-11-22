package com.ambow.jdbc.util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 
 * @author allandou
 * ����ģʽ
 */
public class DBConfig {
		//����Properties
		private Properties pro = new Properties();
		//˵�����õ�·��
		private String path ="dbinfo.properties";
		//ʵ������
		private static DBConfig dbconfig;
			
		private DBConfig(){
			
			readCongig();
		}
		/**
		 *  �����ȡ�����ļ������inputstream��,���ص�Properties����
		 */
		private void readCongig() {
			
			InputStream in = null;
			
			try {
				//ͨ��ClassLoad�������
				in = ClassLoader.getSystemResourceAsStream("dbinfo.properties");
				
				pro.load(in);
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		/**
		 * 
		 * @return DBConfig
		 *  ��Ϊ˽�л����캯��������Ҫ�ṩ����õ�ǰ����ķ���
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
		 * ��װProperties ͨ��key�õ�value��ֵ
		 */
		public String getValue(String key){
			
			return pro.getProperty(key);
		}
		
		public static void main(String[] args) {
			
			System.out.println(DBConfig.getInstance().getValue("db_url"));
		}
}










