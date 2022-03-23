package com.gpa.model;

import java.util.HashMap;
import java.util.Map;

public enum GradePointEnum {
	
	A_PLUS("A+", 4.2),
    A_("A", 4.0),
    A_MINUS("A-", 3.8),
    B_PLUS("B+", 3.6),
    B_("B", 3.4),
    B_MINUS("B-", 3.2),
    C_PLUS("C+", 3.0),
    C_("C", 2.8),
    C_MINUS("C-", 2.6),
    D_PLUS("D+", 2.4),
    D_("D", 2.2),
    D_MINUS("D-", 2.0),
    E("E", 1.6),
    F("F", 1.0),
    G("G", 0.4),
    NG("NG", 0.0);

	private String grade;
    private Double value;
    
    private static Map<String, Double> gradePointMap;

	private GradePointEnum(String grade, Double value) {
		this.grade = grade;
		this.value = value;
	}
	
	public static Double getGradePoint(String grade) {
		if(gradePointMap == null)
			init();
		return gradePointMap.get(grade);
	}
	
	private static void init() {
		gradePointMap = new HashMap<>();
		for(GradePointEnum gp : values())
			gradePointMap.put(gp.grade, gp.value);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
