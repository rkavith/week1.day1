package Selenium.week1.day1;

public class Student {
		
		public static void main(String[] args) {
			Student obj = new Student();
			System.out.println("Name: "+obj.Name);
			System.out.println("Roll: "+obj.RollNum);
			obj.college();
			
		}
		String Name = "Kavitha";
		private int RollNum= 18;
		public void college()
		{
			String CollegeName = "VMU";
			System.out.println("CollegeName: "+CollegeName);
			}
		}