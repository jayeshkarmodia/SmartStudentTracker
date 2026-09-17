package com.studenttracker;
import com.studenttracker.database.DatabaseManager; import com.studenttracker.ui.ConsoleUI;
public class Main {public static void main(String[] args){try(DatabaseManager db=new DatabaseManager()){new ConsoleUI(db).run();}catch(Exception e){System.err.println("Application startup failed: "+e.getMessage());System.exit(1);}}}
