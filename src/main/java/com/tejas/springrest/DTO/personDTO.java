package com.tejas.springrest.DTO;

public class personDTO {
    private String name;
    private String school;
    
     
	public personDTO(String name, String school) {
		super();
		this.name = name;
		this.school = school;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "personDTO [name=" + name + ", school=" + school + "]";
	}
}
