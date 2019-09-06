package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideoAnalyticsTest {
	VideoAnalytics v1, v2, v3, v4, v5, v6, v7;

	@BeforeEach
	void setup() throws FileNotFoundException {
		v1 = new VideoAnalytics("Video1");
		v2 = new VideoAnalytics("Video2");
		v3 = new VideoAnalytics("Video3");
		v4 = new VideoAnalytics("Video4");
		v5 = new VideoAnalytics("Video5");
		v6 = new VideoAnalytics("Video6");
		v7 = new VideoAnalytics("Video7");
	}

	@Test
	void testSumViewCounts() {
		assertEquals(232690, v1.sumViewCounts());
		assertEquals(500, v2.sumViewCounts());
		assertEquals(140, v3.sumViewCounts());
		assertEquals(140, v4.sumViewCounts());
		assertEquals(0, v5.sumViewCounts());
		assertEquals(0, v6.sumViewCounts());
	}

	@Test
	void testSumLikes() {
		assertEquals(1513, v1.sumLikes());
		assertEquals(37, v2.sumLikes());
		assertEquals(14, v3.sumLikes());
		assertEquals(14, v4.sumLikes());
		assertEquals(0, v5.sumLikes());
		assertEquals(0, v6.sumLikes());
	}

	@Test
	void testSumDislikes() {
		assertEquals(407, v1.sumDislikes());
		assertEquals(45, v2.sumDislikes());
		assertEquals(1079, v3.sumDislikes());
		assertEquals(70, v4.sumDislikes());
		assertEquals(0, v5.sumDislikes());
		assertEquals(0, v6.sumDislikes());
	}

	@Test
	void testAverageViewCounts() {
		assertEquals(2326.9, v1.averageViewCounts(), 0.01);
		assertEquals(100.0, v2.averageViewCounts(), 0.01);
		assertEquals(20.0, v3.averageViewCounts(), 0.01);
		assertEquals(20.0, v4.averageViewCounts(), 0.01);
		assertEquals(0, v5.averageViewCounts(), 0.01);
		assertEquals(0, v6.averageViewCounts(), 0.01);
	}

	@Test
	void testAverageLikes() {
		assertEquals(15.13, v1.averageLikes(), 0.01);
		assertEquals(7.4, v2.averageLikes(), 0.01);
		assertEquals(2.0, v3.averageLikes(), 0.01);
		assertEquals(2.0, v4.averageLikes(), 0.01);
		assertEquals(0, v5.averageLikes(), 0.01);
		assertEquals(0, v6.averageLikes(), 0.01);
	}

	@Test
	void testAverageDislikes() {
		assertEquals(4.07, v1.averageDislikes(), 0.01);
		assertEquals(9.0, v2.averageDislikes(), 0.01);
		assertEquals(154.14, v3.averageDislikes(), 0.01);
		assertEquals(10.0, v4.averageDislikes(), 0.01);
		assertEquals(0, v5.averageDislikes(), 0.01);
		assertEquals(0, v6.averageDislikes(), 0.01);
	}

	@Test
	void testHighestDailyViewCount() {
		assertEquals(45567, v1.highestDailyViewCount());
		assertEquals(200, v2.highestDailyViewCount());
		assertEquals(20, v3.highestDailyViewCount());
		assertEquals(20, v4.highestDailyViewCount());
		assertEquals(0, v5.highestDailyViewCount());
		assertEquals(0, v6.highestDailyViewCount());
	}

	@Test
	void testHighestDailyLikes() {
		assertEquals(90, v1.highestDailyLikes());
		assertEquals(19, v2.highestDailyLikes());
		assertEquals(2, v3.highestDailyLikes());
		assertEquals(2, v4.highestDailyLikes());
		assertEquals(0, v5.highestDailyLikes());
		assertEquals(0, v6.highestDailyLikes());
	}

	@Test
	void testHighestDailyDislikes() {
		assertEquals(45, v1.highestDailyDislikes());
		assertEquals(25, v2.highestDailyDislikes());
		assertEquals(1000, v3.highestDailyDislikes());
		assertEquals(10, v4.highestDailyDislikes());
		assertEquals(0, v5.highestDailyDislikes());
		assertEquals(0, v6.highestDailyDislikes());
	}

	@Test
	void testLowestDailyViewCount() {
		assertEquals(2, v1.lowestDailyViewCount());
		assertEquals(20, v2.lowestDailyViewCount());
		assertEquals(20, v3.lowestDailyViewCount());
		assertEquals(20, v4.lowestDailyViewCount());
		assertEquals(0, v5.lowestDailyViewCount());
		assertEquals(0, v6.lowestDailyViewCount());
	}

	@Test
	void testLowestDailyLikes() {
		assertEquals(0, v1.lowestDailyLikes());
		assertEquals(1, v2.lowestDailyLikes());
		assertEquals(2, v3.lowestDailyLikes());
		assertEquals(2, v4.lowestDailyLikes());
		assertEquals(0, v5.lowestDailyLikes());
		assertEquals(0, v6.lowestDailyLikes());
	}

	@Test
	void testLowestDailyDislikes() {
		assertEquals(0, v1.lowestDailyDislikes());
		assertEquals(1, v2.lowestDailyDislikes());
		assertEquals(1, v3.lowestDailyDislikes());
		assertEquals(10, v4.lowestDailyDislikes());
		assertEquals(0, v5.lowestDailyDislikes());
		assertEquals(0, v6.lowestDailyDislikes());
	}

	@Test
	void testGetSummary() {
		assertEquals("Video1: Total views: 232690, Total likes: 1513, Total dislikes: 407, Total comments: 7", v1.getSummary());
		assertEquals("Video2: Total views: 500, Total likes: 37, Total dislikes: 45, Total comments: 4", v2.getSummary());
		assertEquals("Video3: Total views: 140, Total likes: 14, Total dislikes: 1079, Total comments: 4", v3.getSummary());
		assertEquals("Video4: Total views: 140, Total likes: 14, Total dislikes: 70, Total comments: 1", v4.getSummary());
		assertEquals("Video5: Total views: 0, Total likes: 0, Total dislikes: 0, Total comments: 1", v5.getSummary());
		assertEquals("Video6: Total views: 0, Total likes: 0, Total dislikes: 0, Total comments: 4", v6.getSummary());
	}

	@Test
	void testGetComments() {
		assertEquals("Comments:\n" + 
				"\"Fantastic video!\"\n" + 
				"\"Love the special effects!\"\n" + 
				"\"Vote for Pedro\"\n" + 
				"\"Me fail English?! That's unpossible!\"\n" + 
				"\"messi. Messi. MESSI.\"\n" + 
				"\"Super Nintendo Chalmers.\"\n" + 
				"\"Cool. CoolCoolCool. Cool.\"", v1.getComments());
		assertEquals("Comments:\n" + 
				"\"what!!!???\"\n" + 
				"\"A+ buyer, fast payment\"\n" + 
				"\"Awww nibbler\"\n" + 
				"\"Can you explain @4:03 again?\"", v2.getComments());
	}

	@Test
	void testEngagementScore() {
		assertEquals("[966, 394, 376, 266, 5384, 673, 675, 23, 83, 383, 584, 486, 334, 54, 5496, 344, 36, 86, 75, 437, 14, -37, -345, -17, -6, 523, 1035, 4664, 334, -5, 295, 383, 493, 685, -15, 1483, 883, 83, 23, -65, 75, 23, 556, 677, 424, 376, -73, 424, 55, 6, 35, 366, 93, 32, 76, 594, 576, 46, 76, 476, 3496, 515, 114, 706, 5606, 564, 106, 695, 64, -4, 636, 504, 16, 646, 24, 16, 76, 4, 66, 46197, 86, 624, 64, 4564, -34, 45436, 116, -35, -57, 63, 10010, 10120, 9930, 10230, 9960, 9950, 10250, 9950, 10010, 9990]", Arrays.toString(v1.engagementScore(10)));
		assertEquals("[114, 206, 70, 76, 18]", Arrays.toString(v2.engagementScore(2)));
		assertEquals("[27, -456, 27, -1, 27, -6966, 27]", Arrays.toString(v3.engagementScore(7)));
		assertEquals("[-7180, -7180, -7180, -7180, -7180, -7180, -7180]", Arrays.toString(v4.engagementScore(900)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(v5.engagementScore(2)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(v6.engagementScore(2)));
		assertEquals("[120, 120, 120]", Arrays.toString(v7.engagementScore(10)));
	}

	@Test
	void testOverallScore() {
		assertEquals(243750, v1.overallScore(10));
		assertEquals(484, v2.overallScore(2));
		assertEquals(-3055, v3.overallScore(3));
		assertEquals(-196, v4.overallScore(6));
		assertEquals(0, v5.overallScore(15));
		assertEquals(0, v6.overallScore(1));
	}

	@Test
	void testCompareTo() {
		assertEquals(1, v1.compareTo(v2));
		assertEquals(1, v2.compareTo(v3));
		assertEquals(-1, v3.compareTo(v4));
		assertEquals(-1, v4.compareTo(v1));
		assertEquals(0, v5.compareTo(v6));
	}

	@Test
	void testGetBestRunViewCount() {
		assertNotNull(v1.getBestRunViewCount(10));
		assertEquals("[10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000]", Arrays.toString(v1.getBestRunViewCount(10)));
		
		assertNull(v1.getBestRunViewCount(101));
		
		assertNotNull(v1.getBestRunViewCount(5));
		assertEquals("[45567, 46, 4, 64, 4564]", Arrays.toString(v1.getBestRunViewCount(5)));
		
		assertNull(v2.getBestRunViewCount(10));
		
		assertNotNull(v2.getBestRunViewCount(3));
		assertEquals("[200, 70, 110]", Arrays.toString(v2.getBestRunViewCount(3)));

		assertNotNull(v4.getBestRunViewCount(5));
		assertEquals("[20, 20, 20, 20, 20]", Arrays.toString(v4.getBestRunViewCount(5)));

	}

	@Test
	void testGetBestRunLikes() {
		assertNotNull(v1.getBestRunLikes(10));
		assertEquals("[65, 6, 56, 5, 65, 6, 5, 65, 56, 6]", Arrays.toString(v1.getBestRunLikes(10)));
		
		assertNull(v1.getBestRunLikes(101));
		
		assertNotNull(v1.getBestRunLikes(5));
		assertEquals("[9, 9, 0, 90, 90]", Arrays.toString(v1.getBestRunLikes(5)));
		
		assertNull(v2.getBestRunLikes(10));
		
		assertNotNull(v2.getBestRunLikes(3));
		assertEquals("[19, 4, 5]", Arrays.toString(v2.getBestRunLikes(3)));

		assertNotNull(v4.getBestRunLikes(5));
		assertEquals("[2, 2, 2, 2, 2]", Arrays.toString(v4.getBestRunLikes(5)));
	}

	@Test
	void testGetBestRunDislikes() {
		assertNotNull(v1.getBestRunDislikes(10));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(v1.getBestRunDislikes(10)));
		
		assertNull(v1.getBestRunDislikes(101));
		
		assertNotNull(v2.getBestRunDislikes(5));
		assertEquals("[12, 1, 5, 25, 2]", Arrays.toString(v2.getBestRunDislikes(5)));
		
		assertNull(v2.getBestRunDislikes(10));
		
		assertNotNull(v2.getBestRunDislikes(3));
		assertEquals("[12, 1, 5]", Arrays.toString(v2.getBestRunDislikes(3)));

		assertNotNull(v4.getBestRunDislikes(5));
		assertEquals("[10, 10, 10, 10, 10]", Arrays.toString(v4.getBestRunDislikes(5)));
	}

	@Test
	void testGetWorstRunViewCount() {
		assertNotNull(v1.getWorstRunViewCount(10));
		assertEquals("[6, 46, 4, 6, 46, 4, 6, 46, 4, 56]", Arrays.toString(v1.getWorstRunViewCount(10)));
		
		assertNull(v1.getWorstRunViewCount(101));
		
		assertNotNull(v2.getWorstRunViewCount(4));
		assertEquals("[200, 70, 110, 20]", Arrays.toString(v2.getWorstRunViewCount(4)));
		
		assertNull(v2.getWorstRunViewCount(10));
		
		assertNotNull(v2.getWorstRunViewCount(3));
		assertEquals("[70, 110, 20]", Arrays.toString(v2.getWorstRunViewCount(3)));

		assertNotNull(v4.getWorstRunViewCount(5));
		assertEquals("[20, 20, 20, 20, 20]", Arrays.toString(v4.getWorstRunViewCount(5)));

	}

	@Test
	void testGetWorstRunLikes() {
		assertNotNull(v1.getWorstRunLikes(10));
		assertEquals("[4, 4, 4, 4, 4, 4, 4, 4, 4, 4]", Arrays.toString(v1.getWorstRunLikes(10)));
		
		assertNull(v1.getWorstRunLikes(101));
		
		assertNotNull(v2.getWorstRunLikes(4));
		assertEquals("[4, 5, 8, 1]", Arrays.toString(v2.getWorstRunLikes(4)));
		
		assertNull(v2.getWorstRunLikes(10));
		
		assertNotNull(v2.getWorstRunLikes(3));
		assertEquals("[5, 8, 1]", Arrays.toString(v2.getWorstRunLikes(3)));

		assertNotNull(v4.getWorstRunLikes(5));
		assertEquals("[2, 2, 2, 2, 2]", Arrays.toString(v4.getWorstRunLikes(5)));
	}

	@Test
	void testGetWorstRunDislikes() {
		assertNotNull(v1.getWorstRunDislikes(10));
		assertEquals("[7, 7, 45, 5, 5, 5, 5, 5, 5, 5]", Arrays.toString(v1.getWorstRunDislikes(10)));
		
		assertNull(v1.getWorstRunDislikes(101));
		
		assertNotNull(v2.getWorstRunDislikes(4));
		assertEquals("[12, 1, 5, 25]", Arrays.toString(v2.getWorstRunDislikes(4)));
		
		assertNull(v2.getWorstRunDislikes(10));
		
		assertNotNull(v2.getWorstRunDislikes(3));
		assertEquals("[5, 25, 2]", Arrays.toString(v2.getWorstRunDislikes(3)));

		assertNotNull(v4.getWorstRunDislikes(5));
		assertEquals("[10, 10, 10, 10, 10]", Arrays.toString(v4.getWorstRunDislikes(5)));
	}

	@Test
	void testNormalizedEngagementScore() {
		assertEquals("[3, 2, 2, 1, 12, 2, 2, 1, 1, 2, 2, 2, 1, 1, 13, 1, 1, 1, 1, 2, 1, 1, 0, 1, 1, 2, 3, 11, 1, 1, 1, 2, 2, 2, 1, 4, 3, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 8, 2, 1, 2, 13, 2, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 100, 1, 2, 1, 11, 1, 98, 1, 1, 1, 1, 22, 22, 22, 23, 22, 22, 23, 22, 22, 22]", Arrays.toString(v1.normalizedEngagementScore(10)));
		assertEquals("[76, 100, 42, 0, 20]", Arrays.toString(v2.normalizedEngagementScore(9)));
		assertEquals("[100, 93, 100, 100, 100, 0, 100]", Arrays.toString(v3.normalizedEngagementScore(1)));
		assertEquals("[0, 0, 0, 0, 0, 0, 0]", Arrays.toString(v4.normalizedEngagementScore(17)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(v5.normalizedEngagementScore(8)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(v6.normalizedEngagementScore(10)));
		assertEquals("[0, 0, 0]", Arrays.toString(v7.normalizedEngagementScore(10)));
	}

}
