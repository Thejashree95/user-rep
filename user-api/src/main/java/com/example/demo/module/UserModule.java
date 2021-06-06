package com.example.demo.module;

import javax.persistence.*;

@Entity
public class UserModule {
	@Id
	private String uid;
	private String uname;
	private int age;
	
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserModule [uid=" + uid + ", uname=" + uname + ", age=" + age + "]";
	};

}
