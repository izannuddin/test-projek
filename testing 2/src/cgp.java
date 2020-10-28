import java.util.*;
public class cgp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		printName();
		printAge();
		printGender();
		printGpa();
		printHp();
		printBirthday();
		printMarital();
		printCitizen();
		printAdress();
		printWork();
		printLanguage();
		printSkill();
		printAward();
		
		
		
	}
		public static void printName() {
			Scanner input = new Scanner (System.in);

		System.out.print("enter your name");
		String name=input.next();
		System.out.println("name "+ name);
		}
		
		public static void printAge() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your age");
		int age =input.nextInt();
		System.out.println("age "+ age);
		}
		
		public static void printGender() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your gender");
		char gender =input.next().charAt(0);
		System.out.println("gender "+ gender);
		
		}
		
		public static void printGpa() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your sem1 gpa");
		float gpa1 =input.nextFloat();
		System.out.println("sem1 cgpa "+ gpa1);
		
		
		System.out.println("enter your sem2 gpa");
		float gpa2 =input.nextFloat();
		System.out.println("sem2 cgpa "+ gpa2);
		
		float sum = gpa1 + gpa2;
		float cgpa = sum/2;
		System.out.println("CGPA for current semester is " +cgpa);
		}
		
		
		public static void printHp() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your HP");
		String hp=input.next();
		System.out.println("hp "+hp);
		}
		
		public static void printBirthday() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your birthday");
		String birthday=input.next();
		System.out.println("birthday "+birthday);
		}
		
		public static void printMarital() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your marital status");
		String marital=input.next();
		System.out.println("marital "+ marital);
		}
		
		
		public static void printCitizen() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your citizenship");
		String citizenship=input.next();
		System.out.println("citizen "+citizenship);
		}
		
		
		public static void printAdress() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your adress");
		String adress=input.next();
		System.out.println("adress "+adress);
		}
		
		
		public static void printWork() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your work experience");
		String workexperience=input.next();
		System.out.println("work experience " +workexperience);
		}
		
		
		public static void printLanguage() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your language");
		String language=input.next();
		System.out.println("language "+language);
		}
		
		public static void printSkill() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your profesional skill");
		String profesionalskill=input.next();
		System.out.println("profesionalskill " +profesionalskill);
		}
		
		
		public static void printAward() {
			Scanner input = new Scanner (System.in);
		System.out.println("enter your award and cerification");
		String award=input.next();
		System.out.println("award and certification " +award);
		input.close();
		}
		
	
		
	}

	


