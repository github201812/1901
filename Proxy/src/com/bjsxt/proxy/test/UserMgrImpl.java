package com.bjsxt.proxy.test;

public class UserMgrImpl implements UserMgr {

	@Override
	public void addUser() {
		System.out.println("1: �����¼��user��");
		System.out.println("2: ����־������һ�ű�");
	}
	@Override
	public void deleteUser(){
		System.out.println("delete userase ");
	}
	
}
