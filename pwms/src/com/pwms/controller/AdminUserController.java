package com.pwms.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
//��̨�û���Ϣ����
@Controller
@RequestMapping("/amdin/user")
public class AdminUserController extends BaseController {
	//�û���֤��Ϣ����
	@RequestMapping("/importuserxls")
	public String importUserXls(File verifyxls, Model model){
		return null;
	}
	//�鿴��ǰ���޸����û���Ϣ����δ��Ч���û�
	@RequestMapping("/modifylist")
	public String modifylist(Model model){
		return null;
	}
	//�����޸ģ�ͨ�������߲�ͨ��
	@RequestMapping("/deal")
	public String deal(int modifyid, Model model){
		return null;
	}
	//xls�û���Ϣ����
	@RequestMapping("/exportxls")
	public String exportXls(Model model){
		return null;
	}
	//xlsת��ת����Ϣ����
	@RequestMapping("/exportout")
	public String exportOutXls(Model model){
		return null;
	}
	//ת��ת����Ϣ����
	@RequestMapping("/addjoinout")
	public String addJoinOut(JoinOutRecord record, Model model){
		return null;
	}
	//xls���͵ǼǱ���
	@RequestMapping("/exportXlsReward")
	public String exportReward(Model model){
		return null;
	}
	//��ӽ��ͼ�¼
	@RequestMapping("/addreword")
	public String addReward(RewardPunishRecord record, Model model){
		return null;
	}
	
}
