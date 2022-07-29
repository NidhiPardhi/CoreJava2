package com.rays.exercise97;

public class Ques7ParentChild {

	public static void main(String[] args) {

		Ques7Parent p = new Ques7Parent();

		p.PI();

		Ques7Parent pc = new Ques7Child();
		pc.PI();

		Ques7Child c = new Ques7Child();
		c.PI();

		// type casting child to parent
		Ques7Child cp = (Ques7Child) p;
		cp.PI();
	}

}
