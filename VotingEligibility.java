package wiprotraining;

	import java.util.Scanner;

	public class VotingEligibility {

	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Create a Voter object
	        Voter voter = new Voter();

	        // Input voter's name and age
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        voter.setName(name);

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        voter.setAge(age);

	        // Check eligibility
	        if (voter.isEligibleToVote()) {
	            System.out.println(voter.getName() + ", you are eligible to vote.");
	        } else {
	            System.out.println(voter.getName() + ", you are not eligible to vote.");
	        }
	        
	        scanner.close();
	    }
	}

	// Voter class demonstrating encapsulation
	class Voter {
	    private String name; // Private field for name
	    private int age;     // Private field for age

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Method to check voting eligibility
	    public boolean isEligibleToVote() {
	        return age >= 18; // Returns true if age is 18 or above
	    }
	}
