package com.pwms.service;

import java.io.File;

import com.pwms.pojo.ProveLetter;

//֤����
public interface IProveLetterService {
	//����֤���Ŷ���
	public void save(ProveLetter proveletter);
	//��ȡ����
	public ProveLetter getProveLetter(int id);
	//����֤����
	public File exportWord(ProveLetter proveletter);

}
