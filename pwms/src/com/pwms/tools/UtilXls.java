package com.pwms.tools;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class UtilXls {
	public static void WriteXls(File file, Map<String, List> map) {
		WritableWorkbook workbook = null;
		try {
			workbook = Workbook.createWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		WritableSheet sheet = workbook.createSheet("sheet", 0);
		List list1 = null;
		
		for (Map.Entry<String, List> entry : map.entrySet()) {
			// System.out.println(entry.getKey()+"--->"+entry.getValue());
			list1=entry.getValue();
			if(list1!=null){
				break;
			}
		}
		Label label[] = new Label[map.size()*list1.size()];
		System.out.println(map.size()*list1.size());
		int j = 0;
		int k = 0;
		for (Map.Entry<String, List> entry : map.entrySet()) {
			label[k++] = new Label(j, 0, entry.getKey());j++;
		}
		j=0;
		int m=1;
		for (Map.Entry<String, List> entry : map.entrySet()) {
			for(int l=1;l<entry.getValue().size();l++){
			label[k++] = new Label(j, m++, (String) entry.getValue().get(l));
			}
			j++;m=1;
		}
		for (int i = 0; i < label.length; i++) {
			try {
				sheet.addCell(label[i]);
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			workbook.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.close();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
