package com.pwms.service;

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

}
