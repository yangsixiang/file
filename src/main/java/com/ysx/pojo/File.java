package com.ysx.pojo;

import java.util.Date;

public class File {

	private Integer id;
	private String name;
	private String introduce;
	private String direct;
	private Date begintime;
	public File(Integer id, String name, String introduce, String direct, Date begintime) {
		super();
		this.id = id;
		this.name = name;
		this.introduce = introduce;
		this.direct = direct;
		this.begintime = begintime;
	}
	public File() {
		super();
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", introduce=" + introduce + ", direct=" + direct + ", begintime="
				+ begintime + "]";
	}
	
	
	
	
}
