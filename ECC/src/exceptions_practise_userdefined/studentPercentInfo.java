package exceptions_practise_userdefined;

import java.util.*;

public class studentPercentInfo {

	public static void main(String[] args) throws StudentFailedException {

		int[] subjectScore = new int[4];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of Students : ");
		int[] totalStudents = new int[sc.nextInt()];
		
		for(int i = 0 ; i < totalStudents.length ; i++){
			
			System.out.println("Enter the score of the "+ (i+1) + " student : ");

			System.out.println("Math :");
			subjectScore[0] = sc.nextInt();

			System.out.println("English :");
			subjectScore[1] = sc.nextInt();

			System.out.println("Social : ");
			subjectScore[2] = sc.nextInt();

			System.out.println("Science : ");
			subjectScore[3] = sc.nextInt();
			
			percentageOfstudent(subjectScore);
			
		}
	
	}

	/*
	 * public static void percentageOfStudent() throws StudentFailedException {
	 * 
	 * String failedSubs = ""; double sumOfScores = 0;
	 * 
	 * HashMap<Integer, String> subjectScores = new HashMap<Integer, String>();
	 * 
	 * subjectScores.put(math, "math"); subjectScores.put(eng, "english");
	 * subjectScores.put(social, "social"); subjectScores.put(science,
	 * "science");
	 * 
	 * for (Map.Entry<Integer, String> run : subjectScores.entrySet()) {
	 * 
	 * if (run.getKey() < 40) failedSubs += run.getValue() + " "; else
	 * sumOfScores += run.getKey(); }
	 * 
	 * if (failedSubs.isEmpty()) {
	 * 
	 * double percent = sumOfScores/4.0;
	 * System.out.println("The student Percent is : " + percent);
	 * 
	 * } else
	 * 
	 * throw new StudentFailedException(failedSubs + " Below 40 "); }
	 */

	public static void percentageOfstudent(int[] subjectScore) throws StudentFailedException {

		String failedSubs = "";
		double score = 0;

		String[] subjects = { "Math", "English", "Social", "Science" };

		for (int i = 0; i < 4; i++) {

			if (subjectScore[i] < 40)
				failedSubs += subjects[i];
			else
				score += subjectScore[i];

		}

		if (failedSubs.isEmpty())
			System.out.println("Total percentage " + (score / 4.0));
		else
			throw new StudentFailedException(failedSubs + "Below 40");

	}
}
