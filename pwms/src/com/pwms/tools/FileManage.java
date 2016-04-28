package com.pwms.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ļ��Ĺ���
 * @author Administrator
 *
 */
public class FileManage{
	public static void main(String args []) throws Exception{
		FileManage.copyDirectiory("D:/Program Files (x86)/Apache Software Foundation/Tomcat 7.0/webapps/pwms/upload", 
				"D:\\myworkspaces\\git repertory\\pwms\\pwms\\WebRoot\\upload\\");
	}
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
	  /**
		 * 
		 * @param sourceFilePath Ҫ�����ļ���·��
		 * @param targetFilePath Ŀ���ļ�·��
		 * @throws IOException
		 */
	    public static void copyFile(String sourceFilePath, String targetFilePath) throws IOException {
	        File sourceFile = new File(sourceFilePath);
	        File targetFile = new File(targetFilePath);
	    	BufferedInputStream inBuff = null;
	        BufferedOutputStream outBuff = null;
	        try {
	            // �½��ļ����������������л���
	            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

	            // �½��ļ���������������л���
	            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

	            // ��������
	            byte[] b = new byte[1024 * 5];
	            int len;
	            while ((len = inBuff.read(b)) != -1) {
	                outBuff.write(b, 0, len);
	            }
	            // ˢ�´˻���������
	            outBuff.flush();
	        } finally {
	            // �ر���
	            if (inBuff != null)
	                inBuff.close();
	            if (outBuff != null)
	                outBuff.close();
	        }
	    }
	    public static void copyFile(File sourcefile,File targetFile) throws IOException{
	        //�½��ļ����������������л���
	        FileInputStream input=new FileInputStream(sourcefile);
	        BufferedInputStream inbuff=new BufferedInputStream(input);
	        //�½��ļ���������������л���
	        FileOutputStream out=new FileOutputStream(targetFile);
	        BufferedOutputStream outbuff=new BufferedOutputStream(out);
	        //��������
	        byte[] b=new byte[1024*5];
	        int len=0;
	        while((len=inbuff.read(b))!=-1){
	            outbuff.write(b, 0, len);
	        }
	        //ˢ�´˻���������
	        outbuff.flush();
	        //�ر���
	        inbuff.close();
	        outbuff.close();
	        out.close();
	        input.close();
	    }
	    /**
	     * ����Ŀ¼
	     * @param sourceDir
	     * @param targetDir
	     * @throws IOException
	     */
	    public static void copyDirectiory(String sourceDir,String targetDir) throws IOException{
	        //�½�Ŀ��Ŀ¼
	        (new File(targetDir)).mkdirs();
	        //��ȡԴ�ļ��е��µ��ļ���Ŀ¼
	        File[] file=(new File(sourceDir)).listFiles();
	        System.out.println(file.length);
	        for (int i = 0; i < file.length; i++) {
	            if(file[i].isFile()){
	                //Դ�ļ�
	                File sourceFile=file[i];
	                //Ŀ���ļ�
	                File targetFile=new File(new File(targetDir).getAbsolutePath()+File.separator+file[i].getName());
	                copyFile(sourceFile, targetFile);
	            }
	            if(file[i].isDirectory()){
	                //׼�����Ƶ�Դ�ļ���
	                String dir1=sourceDir+"/"+file[i].getName();
	                //׼�����Ƶ�Ŀ���ļ���
	                String dir2=targetDir+"/"+file[i].getName();
	                copyDirectiory(dir1, dir2);
	            }
	        }
	    }
}