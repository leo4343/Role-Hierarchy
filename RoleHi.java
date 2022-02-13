  import java.io.*;

import java.util.*;

public class RoleHi
{
	
public static void main(String[] args)
{
		
Scanner sc = new Scanner(System.in);

		
HashMap<Integer,String>operations = new HashMap<Integer,String>();
		
List<String>employeeList =new ArrayList<String>();
		
System.out.print("Enter root role : ");
	
	
String rootRole = sc.nextLine();
		
employeeList.add(rootRole);
	

operations.put(1, "Add Sub Role");
				
operations.put(2, "Exit");
		
while(true)
{		
			
for(Map.Entry e : operations.entrySet())
{
				
System.out.println(e.getKey() + "." + e.getValue());
			
}
			
System.out.print("Enter operation to be performed : ");
			
int operation = Integer.parseInt(sc.nextLine());
			
if(operation == 1)
{
				
System.out.print("Enter sub role : ");
				
String subRole = sc.nextLine();
				
employeeList.add(subRole);

System.out.print("Enter reporting to role name:");
String roleName=sc.nextLine();				
}
			
else if(operation == 2)
{
				
for(String employee : employeeList)
{
					
System.out.print(employee+" ");
				
}
				
System.out.println();
	
System.exit(0);		
}

}
}
}			

		






	