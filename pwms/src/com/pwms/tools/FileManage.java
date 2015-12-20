package com.pwms.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ļ��Ĺ���
 * @author Administrator
 *
 */
public class FileManage{
	/**
	 * �ļ�������
	 * @param request
	 * @param response
	 * @param storeName �ļ���
	 * @throws Exception
	 */
	  public static void download(HttpServletRequest request,  
	      HttpServletResponse response, String storeName) throws Exception {  
	    
	    request.setCharacterEncoding("UTF-8");  
	    BufferedInputStream bis = null;  
	    BufferedOutputStream bos = null;  
	  
	    //��ȡ��Ŀ��Ŀ¼
	    String ctxPath = request.getSession().getServletContext()  
	        .getRealPath("");  
	    
	    //��ȡ�����ļ�¶��
	    String downLoadPath = ctxPath+"/WEB-INF/upload/"+ storeName;  
	  
	    //��ȡ�ļ��ĳ���
	    long fileLength = new File(downLoadPath).length();  

	    //�����ļ��������
	    response.setContentType("application/octet-stream");  
	    response.setHeader("Content-disposition", "attachment; filename="  
	        + new String(storeName.getBytes("utf-8"), "ISO8859-1")); 
	    //�����������
	    response.setHeader("Content-Length", String.valueOf(fileLength));  
	    //��ȡ������
	    bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
	    //�����
	    bos = new BufferedOutputStream(response.getOutputStream());  
	    byte[] buff = new byte[2048];  
	    int bytesRead;  
	    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
	      bos.write(buff, 0, bytesRead);  
	    }  
	    //�ر���
	    bis.close();  
	    bos.close(); 
	    System.out.println("�����ļ�\n" + downLoadPath+ "\n�ɹ���");
	  }  
}