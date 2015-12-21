package com.pwms.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
import com.pwms.pojo.UserinfoModify;
import com.pwms.service.IJoinOutRecordService;
import com.pwms.service.IRewardPunishRecordService;
import com.pwms.service.IUserinfoService;
import com.pwms.tools.FileManage;
/**
 * ��̨�û���Ϣ����
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/user")
public class AdminUserController extends BaseController {
	@Resource
	private IRewardPunishRecordService rprService;
	@Resource
	private IJoinOutRecordService jorService;
	@Resource
	private IUserinfoService userinfoService;
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
	/**
	 * ����û���Ϣ�޸ģ����
	 * @param id �޸���Ϣid
	 * @param flag 0��ʾͨ����1��ʾ��ͨ��
	 * @return
	 */
	@RequestMapping(value="/userdetail-modify/{id}/{flag}")
	public @ResponseBody String deal(@PathVariable int id, @PathVariable int flag,HttpServletRequest request){
		UserinfoModify um = userinfoService.getUserinfoModifyByid(id);
		String msg = request.getParameter("msg");
		if(msg == null){
			msg = "";
		}
		System.out.println(id + "  " + flag + "  " + msg);
		userinfoService.dealModify(um, flag, msg);//������
		return "���ͨ��";
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
	@RequestMapping(value="/joinout",method=RequestMethod.POST)
	public String addJoinOut(JoinOutRecord record, Model model){
		//System.out.println("������" + record.getName() + "���ڣ�" + record.getOutDate());
		record.setUserId(1);
		jorService.save(record);
		model.addAttribute("msg", "ת��ת����¼��ӳɹ���");
        return "admin/notice-msg";
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
	@RequestMapping(value="/rewOrPun",method=RequestMethod.POST)
	public String addReward(HttpServletRequest request, RewardPunishRecord record, Model model){
		System.out.println(record.getExplian());
		System.out.println(request.getParameter("stuid"));
		record.setUserId(1);//�˴���Ҫһ������ѧ�Ų�ѯ�û�id�ķ���
		record.setRewPunDate(new Date());
		rprService.save(record);
		model.addAttribute("msg", "���ͼ�¼��ӳɹ���");
        return "admin/notice-msg"; 
	}
	/**
	 * ɾ�����ͼ�¼
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/rewOrPun/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable int id,HttpServletRequest request, Model model){
		System.out.println("ɾ�����ͼ�¼�ɹ���");
		//rprService.getRewardPunishRecord(id);
		model.addAttribute("msg", "ɾ�����ͼ�¼��ӳɹ���");
        return "admin/notice-msg"; 
	}
}
