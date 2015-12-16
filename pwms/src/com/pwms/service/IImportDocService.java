package com.pwms.service;

import java.util.List;

import com.pwms.pojo.ImportDoc;

public interface IImportDocService {
	//�������
	public void save(ImportDoc doc);
	//���¶���
	public void updateById(ImportDoc doc);
	//ɾ������ 
	public void deleteById(ImportDoc doc);
	//��ȡ����
	public ImportDoc getImportDocById(Integer id);
	/**
	 * ��ȡ�б� ��ʱ������
	 * @param id
	 * @return
	 */
	public List<ImportDoc> getImportDocList();

}
