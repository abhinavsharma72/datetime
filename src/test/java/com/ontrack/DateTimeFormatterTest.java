package com.ontrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

public class DateTimeFormatterTest {
    
    @Test
    void testFormatCurrentDateTime() {
        // Arrange
        DateTimeFormatter formatter = new DateTimeFormatter();
        LocalDateTime testDateTime = LocalDateTime.of(2025, 5, 15, 8, 42, 5);
        
        // Act
        String result = formatter.formatDateTime(testDateTime);
        
        // Assert
        assertEquals("2025-05-15 08:42:05", result, "DateTime format should match UTC format YYYY-MM-DD HH:MM:SS");
    }
    
    @Test
    void testFormatCurrentDateTimeWithSingleDigits() {
        // Arrange
        DateTimeFormatter formatter = new DateTimeFormatter();
        LocalDateTime testDateTime = LocalDateTime.of(2025, 1, 5, 8, 2, 5);
        
        // Act
        String result = formatter.formatDateTime(testDateTime);
        
        // Assert
        assertEquals("2025-01-05 08:02:05", result, "DateTime should pad single digits with zeros");
    }
}