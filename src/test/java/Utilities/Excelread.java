package Utilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Excelread {

	static Fillo fillo = new Fillo();
	static Connection connection;
	public static HashMap<String, String> excelHashMapValues = new HashMap<String, String>();

	public static HashMap<String, String> extractExcelData(String testCaseID, String sheetName)
			throws FilloException, IOException {
		connection = fillo.getConnection("./TestData/Fillo.xlsx");
		String strQuery = "select * from " + sheetName + " where TestCaseID='" + testCaseID + "'";
		Recordset recordset = connection.executeQuery(strQuery);
		while (recordset.next()) {
			List<String> ColCollection = recordset.getFieldNames();
			
			for (int i = 0; i < ColCollection.size(); i++) {
				String colname = ColCollection.get(i);
				String colvalue = recordset.getField(colname);
				excelHashMapValues.put(colname, colvalue);
				// System.out.println(colname+" "+colvalue);
			}
		}
		return excelHashMapValues;
	}
}
