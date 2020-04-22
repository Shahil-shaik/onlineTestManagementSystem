package com.cg.Entity;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TestTable")
public class Test {
	@Id
	private long testId;
	@Column
	private String testTitle;
	@Column
	private LocalTime testDuration;
	@Column
	private Set<Question> testQuestions;
	@Column
	private long testTotalMarks;
	@Column
	private long testMarksScored;
	public Test(long testId, String testTitle, LocalTime testDuration, Set<Question> testQuestions, long testTotalMarks,
			long testMarksScored, Question currentQuestion, LocalTime startTime, LocalTime endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	@Column
	private Question currentQuestion;
	@Column
	private LocalTime startTime;
	@Column
	private LocalTime endTime;
	public long getTestId() {
		return testId;
	}
	public void setTestId(long testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}
	public Set<Question> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	public long getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(long testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public long getTestMarksScored() {
		return testMarksScored;
	}
	public void setTestMarksScored(long testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public Question getCurrentQuestion() {
		return currentQuestion;
	}
	public void setCurrentQuestion(Question currentQuestion) {
		this.currentQuestion = currentQuestion;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
}
