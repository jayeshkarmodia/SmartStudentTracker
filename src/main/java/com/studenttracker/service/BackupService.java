package com.studenttracker.service;
import java.io.*; import java.nio.file.*; import java.time.*;
public class BackupService {public Path backup()throws IOException{Path src=Path.of("data/student_tracker.db");if(!Files.exists(src))throw new FileNotFoundException("Database does not exist yet.");Path dir=Path.of("data/backups");Files.createDirectories(dir);Path dest=dir.resolve("student_tracker_"+LocalDateTime.now().toString().replace(":","-")+".db");return Files.copy(src,dest,StandardCopyOption.REPLACE_EXISTING);} }
