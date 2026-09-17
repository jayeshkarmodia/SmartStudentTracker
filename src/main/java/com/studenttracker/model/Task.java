package com.studenttracker.model;
import java.time.LocalDate;
public class Task {
 private int id; private String title, subject, description; private Priority priority; private LocalDate deadline; private double estimatedHours; private TaskStatus status;
 public Task(int id,String title,String subject,String description,Priority priority,LocalDate deadline,double estimatedHours,TaskStatus status){this.id=id;this.title=title;this.subject=subject;this.description=description;this.priority=priority;this.deadline=deadline;this.estimatedHours=estimatedHours;this.status=status;}
 public Task(String title,String subject,String description,Priority priority,LocalDate deadline,double estimatedHours){this(0,title,subject,description,priority,deadline,estimatedHours,TaskStatus.PENDING);}
 public int getId(){return id;} public void setId(int id){this.id=id;} public String getTitle(){return title;} public String getSubject(){return subject;} public String getDescription(){return description;} public Priority getPriority(){return priority;} public LocalDate getDeadline(){return deadline;} public double getEstimatedHours(){return estimatedHours;} public TaskStatus getStatus(){return status;} public void setStatus(TaskStatus s){status=s;}
 public boolean isOverdue(){return status!=TaskStatus.COMPLETED && deadline.isBefore(LocalDate.now());}
 @Override public String toString(){return String.format("#%d | %-28s | %-15s | %-6s | %s | %.1fh | %s",id,title,subject,priority,deadline,estimatedHours,status);}
}
