package com.ysx.pojo;

public class Types {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Types(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	
	public String toString() {
		return "Types [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
