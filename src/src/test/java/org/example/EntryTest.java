package org.example;

import org.example.Entry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {



        @Nested
        @DisplayName("Entry Constructor Test")
        class EntryTestConstructor {

            @Test
            public void testConstructorReturnsExpectedValues() {
                // Arrange
                String testContent = "today I felt poorly";
                Date testDate = new Date((int) 2024, (int) 5, (int) 7 );
                // Act
                Entry testEntry = new Entry(testContent, testDate);
                // Assert
                assertAll(
                        () -> assertEquals(testContent, testEntry.getContents()),
                        () -> assertEquals(testDate, testEntry.getEntryDate())
                );
            }
            @Test
            @DisplayName("Test content cannot be null")
            public void testContentCannotBeNull() {
                // Arrange
                String testContent = null;
                Date testDate = new Date();
                // Act
                Entry testEntry = new Entry(testContent, testDate);
                // Assert
                assertEquals("", testEntry.getContents());
            }
            @Test
            @DisplayName("Test date cannot be null and defaults to current date")
            public void testDateCannotBeNullAndDefaultsToCurrentDate() {
                // Arrange
                String testContent = "I hate mornings";
                Date testDate = null;
                // Act
                Entry testEntry = new Entry(testContent, testDate);
                // Assert
                assertEquals(new Date(), testEntry.getEntryDate());
            }
        }
    @Nested
    @DisplayName("Entry Check Date Test")
    class EntryTestCheckDate {

        @Test
        @DisplayName("Test checking with same date returns true")
        public void testCheckWithMatchingDateReturnsTrue() {
            // Arrange
            String testContent = "I hate mornings";
            Date testDate = new Date((int) 2024, (int) 5, (int) 7);
            // Act
            Entry testEntry = new Entry(testContent, testDate);
            // Assert
            assertTrue(testEntry.checkDate(testDate));
        }

        @Test
        @DisplayName("Test checking with different dates returns false")
        public void testCheckWithDifferentDateReturnsFalse() {
            // Arrange
            String testContent = "I hate mornings";
            Date testDate = new Date((int) 2024, (int) 5, (int) 7);
            Date secondDate = new Date();
            // Act
            Entry testEntry = new Entry(testContent, testDate);
            // Assert
            assertFalse(testEntry.checkDate(secondDate));
        }

    }
}
