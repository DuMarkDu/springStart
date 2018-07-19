package com.springdemo.DIdemo;

public class GradeOneStudent implements Student {	
	
	private Homework todayWork;
	
	public GradeOneStudent(Homework todayWork){
		this.todayWork= todayWork;		
	}
	
	public void finishHomeWork() {	
		todayWork.doHomework();
	}

}
