package com.rays.exercise97;

public final class Ques5ImmutableClass {
	
	private final String name;
	private final String language;
	
	
	public Ques5ImmutableClass(String name,String language) {
		
		this.name= name;
		this.language= language;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	
    public static void main(String[]args) {
	
    	Ques5ImmutableClass a= new Ques5ImmutableClass("Nidhi","JAVA language");
    	
    	System.out.println(a.getName());
    	System.out.println(a.getLanguage());
    	
    	Ques5ImmutableClass b= new Ques5ImmutableClass("Ruchi", "C/C++ language");
    	
    	System.out.println(b.name);
    	System.out.println(b.language);
	   
    	Ques5ImmutableClass c= new Ques5ImmutableClass("Kanishka","PYTHON language");
        
    	System.out.println(c.name);
    	System.out.println(c.language);
    }
	
	

}
