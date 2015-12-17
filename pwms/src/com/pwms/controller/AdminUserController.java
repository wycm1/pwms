package com.pwms.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
import com.pwms.tools.FileManage;
/**
 * ��̨�û���Ϣ����
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/user")
public class AdminUserController extends BaseController {
	/**
	 * �û���֤��Ϣ����
	 * @param file
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/importuserxls")
	 public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) throws IOException {  
        //System.out.println("��ʼ");  
        String path = request.getSession().getServletContext().getRealPath("") + "/WEB-INF/upload/";//
        //System.out.println(file.getInputStream().available());
        String fileName = file.getOriginalFilename();  
        //System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //����  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        System.out.println("�ļ��ϴ���\n" + path + fileName + "\n�ɹ���");
        model.addAttribute("msg", "�ļ�����ɹ���");
        return "admin/notice-msg";  
    }
	//�鿴��ǰ���޸����û���Ϣ����δ��Ч���û�
	@RequestMapping("/modifylist")
	public String modifylist(Model model){
		return null;
	}
	//�����޸ģ�ͨ�������߲�ͨ��
	@RequestMapping("/deal")
	public String deal(int userid, Model model){
		return null;
	}
	/**
	 * ������ϸ�û���Ϣ
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportxls")
	public ModelAndView exportXls(HttpServletRequest request,  
		      HttpServletResponse response) throws Exception {  
		String storeName="11.xlsx";  
		FileManage.download(request, response, storeName);  
		return null;  
	} 
	/**
	 * �����û�ת��ת����Ϣ
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/exportout")
	public String exportOutXls(HttpServletRequest request,  
		      HttpServletResponse response) throws Exception{
		String storeName="11.xlsx";  
		FileManage.download(request, response, storeName);  
		return null;
	}
	/**
	 * ���ת��ת����Ϣ
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping("/addjoinout")
	public String addJoinOut(JoinOutRecord record, Model model){
		return null;
	}
	/**
	 * ���͵ǼǱ���
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportXlsReward")
	public String exportReward(HttpServletRequest request,  
		      HttpServletResponse response) throws Exception{
		String storeName="11.xlsx";  
		FileManage.download(request, response, storeName);  
		return null;
	}
	/**
	 * ��ӽ��ͼ�¼
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping("/addrewOrPun")
	public String addReward(HttpServletRequest request, RewardPunishRecord record, Model model){
		System.out.println(record.getExplian());
		System.out.println(request.getParameter("stuid"));
		model.addAttribute("msg", "���ͼ�¼��ӳɹ���");
        return "admin/notice-msg"; 
	}
}
