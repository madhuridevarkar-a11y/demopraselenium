package madhuri.Data;

import java.io.IOException;
import java.util.ArrayList;

public class GetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			GetExcelData exd = new GetExcelData();
			ArrayList data1= exd.ExcelDataprovider("madhuri");
			System.out.println(data1.get(0));
			System.out.println(data1.get(1));
			System.out.println(data1.get(2));
		}
	}


