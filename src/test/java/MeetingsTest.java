package org.example;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class MeetingsTest {

    @Test
    public void testMaxMeetings() {
        // Test case 1
        int[] start1 = {1, 3, 0, 5, 8, 5};
        int[] end1 = {2, 4, 5, 7, 9, 9};
        int[] expected1 = {1, 2, 4, 5};
        assertMeetingOrder(expected1, Meetings.maxMeetings(start1, end1, start1.length));

        int[] start2 = {1,4,6,9,8,5};
        int[] end2 = {2,8,6,2,4,5};
        int[] expected2 = {1,4,5,6,3};
        assertMeetingOrder(expected2, Meetings.maxMeetings(start2, end2, start2.length));

        int start3[] = {10, 12, 20};
        int end3[] = {20, 25, 30};
        int[] expected3 = {1};
        assertMeetingOrder(expected3, Meetings.maxMeetings(start3, end3, start3.length));

        int start4[] = {0,7,1,4,8};
        int end4[] = {2,9,5,9,10};
        int[] expected4 = {1,2};
        assertMeetingOrder(expected4, Meetings.maxMeetings(start4, end4, start4.length));
    }
    @Test
    public void testMaxMeetingsWithDuplicates() {
        // Test case with duplicate start times and end times
        int[] start = {1, 3, 9, 4};
        int[] end = {2, 3, 4, 5};
        int[] expected = {1, 2, 3};
        assertMeetingOrder(expected, Meetings.maxMeetings(start, end, start.length));
    }
    @Test
    public void testMaxMeeting() {
        int[] start = {1, 1, 0, 5, 8, 5};
        int[] end = {2, 2, 5, 7, 9, 9};
        int[] expected = {1, 4, 5};
        assertMeetingOrder(expected, Meetings.maxMeetings(start, end, start.length));
    }
    @Test
    public void testMaxMeetingsSingleMeeting() {
        // Test case with only one meeting
        int[] start = {1};
        int[] end = {2};
        int[] expected = {1};
        assertMeetingOrder(expected, Meetings.maxMeetings(start, end, start.length));
    }
    @Test
    public void testMaxMeetingsOverlappingMeetings() {
        // Test case with overlapping meetings
        int[] start = {1, 2, 3, 4, 5};
        int[] end = {5, 6, 7, 8, 9};
        int[] expected = {1};
        assertMeetingOrder(expected, Meetings.maxMeetings(start, end, start.length));
    }

    private void assertMeetingOrder(int[] expected, ArrayList<Integer> actual) {
        assertEquals("The size of the meeting order is incorrect", expected.length, actual.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals("Meeting order is incorrect at position " + (i + 1), expected[i], actual.get(i).intValue());
        }
    }
}
