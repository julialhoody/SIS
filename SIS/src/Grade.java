import java.util.Scanner; 
public class Grade
	{

		public static void main(String[] args)
			{
				
				Grade studentGrade = new Grade(StudentList.studentList());
				//change grade 
				Scanner scanner = new Scanner(System.in);
				System.out.println("What is the first name of the student you want to change?");
				String firstName = scanner.nextLine();
				System.out.println("What is the students last name?");
				String lastName = scanner.nextLine();
				System.out.println("What is the students class period?");
				int classPeriod = scanner.nextInt();
				System.out.println("What do you want to change" + firstName + "'s grade to?");
				char newGrade = scanner.next().charAt(0);
				
				public static changeGrade(String firstName, String lastName, int classPeriod, char newGrade)
				{
					
					studentGrade.changeGrade(firstName, lastName, classPeriod, newGrade);
					System.out.println(firstName + lastName + "'s grade has been changed.");

				}
				
			}

	}
