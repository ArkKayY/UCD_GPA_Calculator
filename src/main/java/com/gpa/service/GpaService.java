package com.gpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gpa.model.Grade;
import com.gpa.model.GradePointEnum;
import com.gpa.model.Score;

@Service
public class GpaService {

	public Grade computeGPA(List<Grade> grades) {
		Grade finalGrade = new Grade();

		int totalCredits = 0;
		Double totalGradePoints = 0.0;

		for (Grade grade : grades) {
			totalCredits += grade.getCredits();
			Double totalPoints = 0.0;
			for (Score score : grade.getScores()) {
				int percentage = score.getPercentage();
				Double gradePoint = GradePointEnum.getGradePoint(score.getGrade());
				totalPoints += (gradePoint * percentage) / 100;
			}
			Double gradePoint = getNearestValue(totalPoints);
			totalGradePoints += gradePoint * grade.getCredits();
		}

		finalGrade.setCredits(totalCredits);
		finalGrade.setGpa(Math.round(totalGradePoints * 100.0 / totalCredits) / 100.0);

		System.out.println("Total grade points: " + totalGradePoints);
		System.out.println("Total Credits: " + totalCredits);
		System.out.println("GPA: " + finalGrade.getGpa());

		return finalGrade;
	}

	private Double getNearestValue(Double gradePoint) {
		double min = Double.MAX_VALUE;
		Double nearestValue = gradePoint;
		for (GradePointEnum gp : GradePointEnum.values()) {
			double diff = Math.abs(gp.getValue() - gradePoint);
			if (diff < min) {
				min = diff;
				nearestValue = gp.getValue();
			}
		}
		return nearestValue;
	}

}
