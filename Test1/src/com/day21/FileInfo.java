package com.day21;

import java.io.Serializable;

public class FileInfo implements Serializable{
	
	/*
	 code
	 100 : ���� ���� ����(���ϸ�)
	 110 : ���� ���� ����
	 200 : ���� ���� ����(���ϸ�)
	 size : ����ũ��
	 data : ���۳��� 
    */
	
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
}