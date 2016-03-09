package com.pwms.service;

import java.util.List;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.NoticeTheroyContruction;

public interface INoticeService {
	/**
	 * �������
	 * @param notice
	 */
	public void save(NoticeTheroyContruction notice);
	/**
	 * ͨ��id����ȡ����
	 * @param id
	 * @return
	 */
	public NoticeTheroyContruction getNoticeById(Integer id);
	/**
	 * ͨ�����������Ҷ���
	 * @param type 1:֪ͨ����  2������  4������ר��  ��1��2��4������λ���㣩
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	
	public List<Articletype> getChildrenAT(Integer pid);
	
	public Articletype getArticletypeByid(Integer id);
	
	List<NoticeTheroyContruction> selectAll();
	
	List<Articletype> getAllChildrenType();
	
	public Articletype selectByLinkname(String linkname);
	
//	public Articletype getArticletypeByid1(Integer id);
	
//	public Articletype selectByLinkname1(String linkname);
	
	List<Articletype> getByPid(Integer pid);
}
