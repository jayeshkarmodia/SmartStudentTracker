package com.studenttracker.util;
import java.time.LocalDate; import java.time.temporal.ChronoUnit;
public final class DateUtil {private DateUtil(){} public static long daysUntil(LocalDate date){return ChronoUnit.DAYS.between(LocalDate.now(),date);} }
