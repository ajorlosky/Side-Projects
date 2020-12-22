package onlineTest;

import java.util.*;
import java.io.*;

public class Student implements Comparable<Student>, Serializable {
	private String name;
	private HashMap<Integer, Double> examScores;
	private static final long serialVersionUID = 1L;

	// constructor for a specific student: creates a name instance field and hash
	// map with a student scores for each exam.
	public Student(String name) {
		this.name = name;
		examScores = new HashMap<Integer, Double>();
	}

	//returns a student's name
	public String getName() {
		return name;
	}

	//adds points to the total points of an exam
	public void addPoints(double points, int examId) {
		double score = examScores.get(examId);
		score += points;
		examScores.put(examId, score);
	}

	//adds an exam score when an exam is created by SystemManager
	public void addExamScore(int examId) {
		examScores.put(examId, 0.0);
	}

	//returns a specified exam score for the student according to the id
	public double getExamScore(int examId) {
		return examScores.get(examId);
	}

	//compareTo between two students used for ordering of students in SystemManager
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
}
