package com.pwms.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pwms.pojo.ExamQuestion;

public class ParseQuestion{
	public static void main(String args []){
//		String question = "1.\"��������\"��Ҫ˼���Ǽ�ǿ�͸Ľ����Ľ��衢�ƽ��ҹ���������������ƺͷ�չ��ǿ��������������ȫ�������ǻ۵Ľᾧ����(  )��B\n" +
//"A. �������ۻ��� B. �����볤�ڼ�ֵ�ָ��˼�� C. �����ж�ָ��" +
//"2. \"�ĸ�����\"����Ҫ���ǣ� ����A" +
//"A. ȫ���������� B. �¼������ϼ� C. �������Ӷ���" +
//"3. (    )�ǵ��ڵ���ߴ��� B" +
//"A. ��������ְ�� B. �������� C. ���ؾ���" +
//"4. ��   ��������Ϊ����ִ��Ϊ�������ǵ�ͬһ�а����׼������ĸ�������B" +
//"A. ������ϵȺ�� B. ȫ��ȫ��Ϊ������� C. ʵ������" +
//"5. ��  �����ǵ�Сƽ���й��������Ե����й���������Ŀ�ѧ�жϡ�A" +
//"A. �ҹ����������������׶� B. �ҹ��Ƿ�չ�е����������� C. ���������ʵ����" +
//"6. ��  ������ȡ�뵳����Ҫ���⡣C" +
//"A. �ݽ��뵳������ B. �㱨˼�� C. �����뵳����" +
//"7. ��  ����ʽ�ѵ�Сƽ�������뵳�¡� C" +
//"A. ����ʮ���� B����ʮ�Ĵ� C. ����ʮ���";
		String question = "1�� �й�����ʷ��ѻƬս��Ϊ���ˣ���Ҫ����Ϊ(  )  C" +
				"A.�й���һ�α���������ս��     B.���ڱչ�����״��������" +
				"C.������ʿ�ʼ���������仯     D.����ì��ȡ���˽׼�ì��" +
				"2��������ʷ��ʼ�����ʱ�����ʱ���ı�־��(  ) A" +
				"A.1640��Ӣ���ʲ��׼�����     B.1642��Ӣ���ʲ��׼����� " +
				"C.1789�귨���ʲ��׼�����     D.1790�귨���ʲ��׼�����";
		parse(question,1);
	}
	/**
	 * ����������Ŀ
	 * @param parseStr Ҫ�������ַ���
	 * @return
	 */
	public static List<ExamQuestion> parse(String parseStr,int exameId){
		List<ExamQuestion> eqList = new ArrayList<ExamQuestion>();
		ExamQuestion eq = null;
	      String AQ = "";//�����Ѿ���
	      String answer = "";
	      int i = 0;
	      parseStr = parseStr.replaceAll(" |\\s+", "");//��ȥ���з��Ϳո�
	      Matcher m = null;
	      String [] s = parseStr.split("\\d{1,3}(\\.|��|��|ؼ)");
	      for(int j = 0;j < s.length;j++){
	    	  eq = new ExamQuestion();
	    	  eq.setExamId(1);
	    	  if(!s[j].equals("")){
	    		  AQ = s[j];
	    		  System.out.println(AQ);
	    	      m = Pattern.compile("[A-D]").matcher(AQ);
	    	      m.find();
	    	      answer = m.group();
	    	      parseStr = AQ.substring(0,AQ.indexOf(answer));
	    	      System.out.println("����:" + parseStr);
	    	      m = Pattern.compile("[^A-D(\\.|��)][^ABCD\\.]*").matcher(AQ.substring(AQ.indexOf(answer) + 1));
	    	      i = 0;
	    	      while(m.find()){
	    	    	  i++;
	    	    	  if(i == 1){
	    	    		  System.out.println("A." + m.group(0));
	    	    		  eq.setOptionA(m.group(0));
	    	    	  }
	    	    	  else if(i == 2){
	    	    		  System.out.println("B." + m.group(0));
	    	    		  eq.setOptionB(m.group(0));
	    	    	  }
	    	    	  else if(i == 3){
	    	    		  System.out.println("C." + m.group(0));
	    	    		  eq.setOptionC(m.group(0));
	    	    	  }
	    	    	  else if(i == 4){
	    	    		  System.out.println("D." + m.group(0));
	    	    		  eq.setOptionD(m.group(0));
	    	    	  }
	    	      }
	    	      System.out.println("��:"  + answer);
	    	      eq.setAnswer(answer);
	    	      eq.setQuestion(parseStr);
	    	      eqList.add(eq);
	    	  }
	    	  
	      }

		return eqList;
	}
}