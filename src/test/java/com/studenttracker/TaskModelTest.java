package com.studenttracker;
import com.studenttracker.model.*; import org.junit.jupiter.api.Test; import java.time.LocalDate; import static org.junit.jupiter.api.Assertions.*;
class TaskModelTest {@Test void overdueTaskDetected(){Task t=new Task("A","Java","",Priority.HIGH,LocalDate.now().minusDays(1),2);assertTrue(t.isOverdue());}@Test void completedTaskIsNotOverdue(){Task t=new Task("A","Java","",Priority.HIGH,LocalDate.now().minusDays(1),2);t.setStatus(TaskStatus.COMPLETED);assertFalse(t.isOverdue());}}
