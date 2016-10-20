import java.util.Scanner;
public class HelloWorld {

	public static String HelloPerson(){
		String name[];
		String fullName = "";
		String splitName = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Please tell me your name!");
		fullName = s.nextLine();
		do{
			if(!fullName.equals("")){
		name = fullName.split(" ");
		for(int i = 0; i < name.length; i++){
			splitName += name[i].substring(0, 1).toUpperCase() + name[i].substring(1, name[i].length()) + " ";
		}
		s.close();
		}
			return "Hello " + splitName;
		}while(!fullName.equals(""));
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HelloPerson());
	}

}
