package com.ikkaku.restfulwebservices.versioning;

public class PersonV1 {

	private String name;

	public PersonV1() {}
	
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
