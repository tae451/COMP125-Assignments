package assignment1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class VideoAnalytics {
	public String name;
	public int[] viewCount;
	public int[] likes;
	public int[] dislikes;
	public String[] comments;

	/**
	 * DO NOT MODIFY
	 * @param dir
	 * @throws FileNotFoundException
	 */
	public VideoAnalytics(String dir) throws FileNotFoundException {
		name = dir;
		viewCount = readNumbers("data/"+dir+"/viewCounts.txt");
		likes = readNumbers("data/"+dir+"/likes.txt");
		dislikes = readNumbers("data/"+dir+"/dislikes.txt");
		comments = readLines("data/"+dir+"/comments.txt");
	}

	/**
	 * DO NOT MODIFY
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String[] readLines(String filename) throws FileNotFoundException {
		FileReader file = new FileReader(filename);
		Scanner scanner = new Scanner(file);
		int count = 0;
		while(scanner.hasNextLine()) {
			count++;
			scanner.nextLine(); //ignore
		}

		String[] result = new String[count];
		scanner.close();

		file = new FileReader(filename);
		scanner = new Scanner(file);

		for(int i = 0; i < count; i++) {
			result[i] = scanner.nextLine();
		}

		scanner.close();
		return result;
	}

	/**
	 * DO NOT MODIFY
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 */
	public static int[] readNumbers(String filename) throws FileNotFoundException {
		FileReader file = new FileReader(filename);
		Scanner scanner = new Scanner(file);
		int count = 0;
		while(scanner.hasNextLine()) {
			count++;
			scanner.nextLine(); //ignore
		}

		int[] result = new int[count];
		scanner.close();

		file = new FileReader(filename);
		scanner = new Scanner(file);

		for(int i = 0; i < count; i++) {
			result[i] = scanner.nextInt();
		}

		scanner.close();
		return result;	
	}

	//DO NOT MODIFY ANY CODE ABOVE THIS COMMENT

	//add any helper methods you want here

	/**
	 * 
	 * @return the total of all view counts
	 */
	public int sumViewCounts() {
		int total =0;
		for (int i = 0; i< viewCount.length; i++) {
			total += viewCount[i];
		}
		return total; //to be completed
	}

	/**
	 * 
	 * @return the total of all likes
	 */
	public int sumLikes() {
		int total =0;
		for (int i = 0; i< likes.length; i++) {
			total += likes[i];
		}
		return total; //to be completed
	}

	/**
	 * 
	 * @return the total of all dislikes
	 */
	public int sumDislikes() {
		int total = 0;
		for (int i = 0; i< dislikes.length; i++) {
			total += dislikes[i];
		}
		return total; //to be completed
	}

	/**
	 * 
	 * @return the average of all view counts
	 */
	public double averageViewCounts() {
		double total = 0;
		for (int i = 0; i< viewCount.length; i++) {
			total += viewCount[i];
		}
		return total/viewCount.length; //to be completed
	}

	/**
	 * 
	 * @return the average of all likes
	 */
	public double averageLikes() {
		double total = 0;
		for (int i = 0; i< likes.length; i++) {
			total += likes[i];
		}
		return total/likes.length; //to be completed
	}

	/**
	 * 
	 * @return the average of all dislikes
	 */
	public double averageDislikes() {
		double total = 0;
		for (int i = 0; i< dislikes.length; i++) {
			total += dislikes[i];
		}
		return total/dislikes.length; //to be completed
	}

	/**
	 * 
	 * @return the highest of view counts
	 */
	public int highestDailyViewCount() {
		int highest = 0;
		for (int i = 0; i< viewCount.length; i++) {
			if (viewCount[i]>highest) highest = viewCount[i];
		}
		return highest; //to be completed
	}

	/**
	 * 
	 * @return the highest of likes
	 */

	public int highestDailyLikes() {
		int highest = 0;
		for (int i = 0; i< likes.length; i++) {
			if (likes[i]>highest) highest = likes[i];
		}
		return highest; //to be completed
	}

	/**
	 * 
	 * @return the highest of dislikes
	 */

	public int highestDailyDislikes() {
		int highest = 0;
		for (int i = 0; i< dislikes.length; i++) {
			if (dislikes[i]>highest) highest = dislikes[i];
		}
		return highest; //to be completed
	}

	/**
	 * 
	 * @return the lowest of view counts
	 */

	public int lowestDailyViewCount() {
		int lowest = viewCount[0];
		for (int i = 0; i< viewCount.length; i++) {
			if (viewCount[i]<lowest) lowest = viewCount[i];
		}
		return lowest; //to be completed
	}

	/**
	 * 
	 * @return the lowest of likes
	 */

	public int lowestDailyLikes() {
		int lowest = likes[0];
		for (int i = 0; i< likes.length; i++) {
			if (likes[i]<lowest) lowest = likes[i];
		}
		return lowest; //to be completed
	}

	/**
	 * 
	 * @return the lowest of dislikes
	 */
	public int lowestDailyDislikes() {
		int lowest = dislikes[0];
		for (int i = 0; i< dislikes.length; i++) {
			if (dislikes[i]<lowest) lowest = dislikes[i];
		}
		return lowest; //to be completed
	}

	/**
	 * 
	 * @return summary of the video.
	 * Example is provided to explain syntax required.
	 * Video1: Total views: 232690, Total likes: 1513, Total dislikes: 407, Total comments: 7
	 */
	public String getSummary() {
		return name + ": Total views: " + sumViewCounts() + ", Total likes: " + sumLikes() + ", Total dislikes: " + sumDislikes() + ", Total comments: " + comments.length; //to be completed
	}

	/**
	 * 
	 * @return a list of comments (with a header "Comments:"). 
	 * For example, for Video1, the method should return the following String:
	 * <begin sample output string>
	 * Comments:
	 * "Fantastic video!"
	 * "Love the special effects!"
	 * "Vote for Pedro"
	 * "Me fail English?! That's unpossible!"
	 * "messi. Messi. MESSI."
	 * "Super Nintendo Chalmers."
	 * "Cool. CoolCoolCool. Cool."
	 * <end sample output string>
	 */
	public String getComments() {
		String total = "Comments:";
		for (int i = 0; i< comments.length; i++) {
			total = total + "\n" + comments[i];
		}
		return total; //to be completed
	}

	/**
	 * Precondition (assumption): viewCount, likes, dislikes are of the same length
	 * @param likeDislikeWeight
	 * @return an array containing daily engagement scores. 
	 * For each day, engagement score is defined as the sum of view count with the weighted difference between likes and dislikes.
	 * For example, if likeDislikeWeight is 10, it means likes and dislikes are 10 times more important to me than views.
	 * Now, if on a given day, a video has 200 views, 4 likes and 7 dislikes, the score for that day would be 200 + 10*(4-7) = 170. 
	 */
	
	//dailyview + likedislikeweight*(l-dl) =
	
	public int[] engagementScore(int likeDislikeWeight) {
		int[] output = new int[viewCount.length];
		for (int i = 0; i< viewCount.length; i++) {
			output[i] = viewCount[i]+likeDislikeWeight*(likes[i]-dislikes[i]);
		}
		return output; //to be completed
	}

	/**
	 * @param likeDislikeWeight
	 * @return cumulative engagement score. that is, the sum of all items in the array returned by engagementScore 
	 */
	public int overallScore(int likeDislikeWeight) {
		int total = 0;
		for (int i = 0; i< viewCount.length; i++) {
			total += viewCount[i]+likeDislikeWeight*(likes[i]-dislikes[i]);
		}
		return total; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return 	1 if calling object has a higher overallScore than parameter object
	 * 			-1 if calling object has a lower overallScore than parameter object
	 * 			0 if calling object has the same overallScore as the parameter object
	 * NOTE: overallScore should be computed using likeDislikeWeight = 10
	 */
	public int compareTo(VideoAnalytics other) {
		if (this.overallScore(10) > other.overallScore(10)) return 1;
		if (this.overallScore(10) == other.overallScore(10)) return 0;
		if (this.overallScore(10) < other.overallScore(10)) return -1;
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return an array containing the n consecutive day view counts that have 
	 * a higher total than any other sequence of n consecutive day view counts.
	 * 
	 * For example, if viewCounts = {10, 2, 8, 8, 12} and n = 3, {8, 8, 12} adds up to 28.
	 * No other sequence of 3 consecutive view counts is more than 28.
	 * 
	 * Return null if array viewCounts is null or doesn't contain at least n items.
	 * 
	 * Return the first sequence in order of appearance in case of a tie.
	 */
	public int[] getBestRunViewCount(int n) {
		if (viewCount == null || viewCount.length < n) return null;
		int besttot = 0; //The highest total achieved by a run
		int bestind = 0; //Index for location of best run
		int[] result = new int[n]; //Generate the result array with n size
		for (int i = 0; i < viewCount.length-n; i++) { //Go through each index in viewCounts...
			if (getViewCountRunTotal(i, n) > besttot) {
				bestind = i;
				besttot = getViewCountRunTotal(i,n);
			}
		}
		for (int x = 0; x < result.length; x++) { //Get run at recorded index
			result[x] = viewCount[x+bestind+1];
		}
		return result; //Returns the result
	}
	
	public int getViewCountRunTotal(int loc, int size) { //Returns sum for size-length sequence at loc
		int result = 0;
		for (int i = 0; i < size; i ++) {
			result += viewCount[i+loc];
		}
		return result;
	}

	/**
	 * 
	 * @param n
	 * @return an array containing the n consecutive day likes that have 
	 * a higher total than any other sequence of n consecutive day likes.
	 * 
	 * For example, if likes = {10, 2, 8, 8, 12} and n = 3, {8, 8, 12} adds up to 28.
	 * No other sequence of 3 consecutive likes is more than 28.
	 * 
	 * Return null if array likes is null or doesn't contain at least n items.
	 * 
	 * Return the first sequence in order of appearance in case of a tie.
	 */
	public int[] getBestRunLikes(int n) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an array containing the n consecutive day dislikes that have 
	 * a LOWEST total than any other sequence of n consecutive day dislikes.
	 * 
	 * For example, if dislikes = {10, 2, 8, 8, 12} and n = 3, {2, 8, 8} adds up to 18.
	 * No other sequence of 3 consecutive dislikes is LESS than 28.
	 * 
	 * Return null if dislikes is null or doesn't contain at least n items.
	 * 
	 * Return the first sequence in order of appearance in case of a tie.
	 */
	public int[] getBestRunDislikes(int n) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return same as getBestRunViewCount but return array with lowest total instead of highest
	 * Return null if viewCounts is null or doesn't contain at least n items.
	 * 
	 */
	public int[] getWorstRunViewCount(int n) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return same as getBestRunLikes but return array with lowest total instead of highest
	 * Return null if likes is null or doesn't contain at least n items.
	 * 
	 */
	public int[] getWorstRunLikes(int n) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return same as getBestDislikes but return array with HIGHEST total instead of LOWEST
	 * Return null if dislikes is null or doesn't contain at least n items.
	 * 
	 */
	public int[] getWorstRunDislikes(int n) {
		return null; //to be completed
	}

	/**
	 * Precondition (assumption): viewCount, likes, dislikes are of the same length
	 * @param likeDislikeWeight
	 * @return Normalized engagement score such that the highest value in 
	 * the array returned by engagementScore is mapped to 100 and the lowest value is mapped to 0.
	 * All other values should be rounded off to the nearest integers.
	 * 
	 * For example, let's say the array returned by engagementScore(likeDislikeWeight) is 
	 * {30, -660, 30, -10, 30, -9960, 30}
	 * The 30s are mapped to 100.
	 * The -9960 is mapped to 0.
	 * The other values are mapped according to the range (-9960 to 30 implies the range is 9990).
	 * Hence, Every 99.9 drop accounts for 1% drop in the normalized values.
	 * Since -660 is 690 less than the highest value (30), it has a 6.906 drop from the peak of 100.
	 * This value is 93.09, which rounded off to the nearest integer, is 93.
	 * 
	 * The normalized engagement score for {30, -660, 30, -10, 30, -9960, 30} should be {100, 93, 100, 100, 100, 0, 100}
	 * 
	 * If all values are the same, return an array containing all zeroes
	 * So if engagementScore = {50, 50, 50}, return the array {0, 0, 0}
	 */
	public int[] normalizedEngagementScore(int likeDislikeWeight) {
		return null; //to be completed
	}
}
