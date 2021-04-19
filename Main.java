import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
	Random rand = new Random();
	int n = 20000000;
	int [] dice1 = new int[n];
	int [] dice2 = new int[n];
	int [] dice3 = new int[n];
	int [] dice4 = new int[n];
	int [] dice5 = new int[n];
	for (int i = 0; i < n; i++) {
		dice1[i] = rand.nextInt(4) + 1;
		dice2[i] = rand.nextInt(4) + 1;
		dice3[i] = rand.nextInt(4) + 1;
	}
	int count = 0;

	// ///// QUESTION 1 /////
	for (int i = 0; i < n - 1; i++) {
		int sum1 = dice1[i] + dice2[i];
		int sum2 = dice1[i + 1] + dice2[i + 1];
		if (sum1 == sum2) {
			count++;
		}
	}
	System.out.println("Question 1"); 
	System.out.println(count / (double) n);
	System.out.println("\n");

	count = 0;
	///// QUESTION 2 /////
	for (int i = 0; i < n; i++) {
		int sum = dice1[i] + dice2[i] + dice3[i];
		if (sum >= 9) {
			count++;
		}
	}
	System.out.println("Question 2"); 
	System.out.println(count / (double) n);
	System.out.println("\n");

	count = 0;

	///// QUESTION 3 /////
	for(int i = 0; i < n - 1; i++) {
		int sum1 = dice1[i] + dice2[i] + dice3[i];
		int sum2 = dice1[i + 1] + dice2[i + 1] + dice3[i + 1];
		if (sum2 > sum1) {
			count++;
		}
	}
	System.out.println("Question 3"); 
	System.out.println(count / (double) n);
	System.out.println("\n");

	count = 0;

	///// QUESTION 4a /////
	for (int i = 0; i < n; i++) {
		int monster1 = rand.nextInt(31) + 1;
		int monster2 = rand.nextInt(31) + 1;
		int monster3 = rand.nextInt(31) + 1;
		int monster4 = rand.nextInt(31) + 1;
		int monster5 = rand.nextInt(31) + 1;
		if (monster1 == monster2 || monster1 == monster3 || monster1 == monster4 || monster1 == monster5 || monster2 == monster3 ||monster2 == monster4 || monster2 == monster5 || monster3 == monster4 || monster3 == monster5 || monster4 == monster5) {
			count++;
		}
	}
	System.out.println("Question 4a"); 
	System.out.println(count / (double) n);
	System.out.println("\n");

	count = 0;

	///// QUESTION 4b /////
	for (int i = 0; i < n; i++) {
		int monster1 = rand.nextInt(31) + 1;
		int monster2 = rand.nextInt(31) + 1;
		int monster3 = rand.nextInt(31) + 1;
		int monster4 = rand.nextInt(31) + 1;
		int monster5 = rand.nextInt(31) + 1;
		int monster6 = rand.nextInt(31) + 1;
		int monster7 = rand.nextInt(31) + 1;
		boolean isMonster1 = monster1 == monster2 || monster1 == monster3 || monster1 == monster4 || monster1 == monster5 || monster1 == monster6 || monster1 == monster7;
		boolean isMonster2 = monster2 == monster3 ||monster2 == monster4 || monster2 == monster5 || monster2 == monster6 || monster2 == monster7; 
		boolean isMonster3 = monster3 == monster4 || monster3 == monster5 || monster3 == monster6 || monster3 == monster7;
		boolean isMonster4 = monster4 == monster5 || monster4 == monster6 || monster4 == monster7;
		boolean isMonster5 = monster5 == monster6 || monster5 == monster7;
		boolean isMonster6 = monster6 == monster7;
		if (isMonster1 || isMonster2 || isMonster3 || isMonster4 || isMonster5 || isMonster6) {
			count++;
		}
	}
	System.out.println("Question 4b"); 
	System.out.println(count / (double) n);
	System.out.println("\n");

	count = 0;

	///// QUESTION 5 /////
	HashSet<Integer> set = new HashSet<>();
	int [] freq = new int[7];
	Arrays.fill(freq, 0);

	for (int i = 0; i < n; i++) {
		count = 0;
		for (int j = 0; j < 6; j++) {
			int ticket = rand.nextInt(63);
			//System.out.print(ticket+ " ");
			if (!set.contains(ticket)) {
				set.add(ticket);
			}
			else {
				count++;	
			}
		}
		//System.out.println(count);
		freq[count]++;
		set.clear();
	}
	System.out.println("Question 5");
	for (int i = 0; i < 6; i++) {
		System.out.println(freq[i] / (double) n);
	}

	

    
  }
}