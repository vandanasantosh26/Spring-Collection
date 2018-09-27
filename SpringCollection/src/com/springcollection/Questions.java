package com.springcollection;

import java.util.List;

public class Questions {

	int q_no;
	String question;
	List<String> answers;
	public Questions(int q_no, String question, List<String> answers) {
		
		this.q_no = q_no;
		this.question = question;
		this.answers = answers;
	}
	public String toString()
	{
		return q_no + " "+ question;
	}
	public void displayAnswers()
	{
	for(Object o:answers)
	{
		System.out.println(o);
	}
	}
	
}
