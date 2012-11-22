package day9;

public interface IMaleDao
{

	void addMale(Male male);
	
	Male fingById(int i) ;
	
	void deleteMaleById (int i);
}
