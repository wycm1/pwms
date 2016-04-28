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
	 * @param 
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	/**
     * ͨ��pid����Articletype
     * @param pid
     * @return Articletype�б�
     */
	public List<Articletype> getChildrenAT(Integer pid);
	
	public Articletype getArticletypeByid(Integer id);
	
	List<NoticeTheroyContruction> selectAll();
	 /**
     * ��ȡ���� chlidrenarticletype
     * @return chlidrenarticletype�б�
     */
	List<Articletype> getAllChildrenType();
	
	public Articletype selectByLinkname(String linkname);
	
	public Articletype getArticletypeByid1(Integer id);
	
	public Articletype getArticletypeByid2(Integer id);
	
//	public Articletype selectByLinkname1(String linkname);
	/**
     * ͨ��pid����Articletype
     * @param pid
     * @return Articletype�б�
     */
	List<Articletype> getByPid(Integer pid);
	
	List<NoticeTheroyContruction> selectTopArticleByAtid(Integer [] atid);
	
	List<NoticeTheroyContruction> selectTopXWAndDXGG();
}
