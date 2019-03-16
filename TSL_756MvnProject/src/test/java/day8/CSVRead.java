package day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVRead extends Base1{
  @Test
  public void f() throws Exception 
  {
	   CSVReader csv=new CSVReader(new FileReader(".\\data.csv"));
	List <String[]> strlist= csv.readAll();
	 
	 for(String rowData[]:strlist)
	 {
		 
		 for(String ColData:rowData)
		 {
			 System.out.println(ColData);
		 }
			 
		 //System.out.println(rowData[0]);
		 System.out.println(rowData[1]);
		 //System.out.println(rowData[2]);
		 
	 }
	 
	 
	 
	 
	 
  }
}
