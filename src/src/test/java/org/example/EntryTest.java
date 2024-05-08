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
            } @Test
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

        }

}
