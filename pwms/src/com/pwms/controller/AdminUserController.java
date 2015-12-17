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
 * 后台用户信息管理
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/user")
public class AdminUserController extends BaseController {
	/**
	 * 用户验证信息导入
	 * @param file
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/importuserxls")
	 public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) throws IOException {  
        //System.out.println("开始");  
        String path = request.getSession().getServletContext().getRealPath("") + "/WEB-INF/upload/";//
        //System.out.println(file.getInputStream().available());
        String fileName = file.getOriginalFilename();  
        //System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        System.out.println("文件上传至\n" + path + fileName + "\n成功！");
        model.addAttribute("msg", "文件导入成功！");
        return "admin/notice-msg";  
    }
	//查看当前有修改了用户信息，但未生效的用户
	@RequestMapping("/modifylist")
	public String modifylist(Model model){
		return null;
	}
	//处理修改，通过，或者不通过
	@RequestMapping("/deal")
	public String deal(int userid, Model model){
		return null;
	}
	/**
	 * 导出详细用户信息
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
	 * 导出用户转入转出信息
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
	 * 添加转入转出信息
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping("/addjoinout")
	public String addJoinOut(JoinOutRecord record, Model model){
		return null;
	}
	/**
	 * 奖惩登记表导出
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
	 * 添加奖惩记录
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping("/addrewOrPun")
	public String addReward(HttpServletRequest request, RewardPunishRecord record, Model model){
		System.out.println(record.getExplian());
		System.out.println(request.getParameter("stuid"));
		model.addAttribute("msg", "奖惩记录添加成功！");
        return "admin/notice-msg"; 
	}
}
