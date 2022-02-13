import java.io.*;

import java.util.*;

public class RoleHiera
{
	
public static void main(String[] args)
{
		
Scanner sc = new Scanner(System.in);

		
HashMap<Integer,String>operations = new HashMap<Integer,String>();
		
List<String>employeeList =new ArrayList<String>();
	
List<String>employeeRole=new ArrayList<String>();	
operations.put(1, "Add Sub Role");
		
operations.put(2, "Display Roles");

operations.put(3, "Delete Role");

operations.put(4, "Add User");
		
operations.put(5, "Display User");
		
operations.put(6, "Exit");

while(true)		
{		
			
for(Map.Entry e : operations.entrySet())
{
				
System.out.println(e.getKey() + "." + e.getValue());
			
}
			
System.out.print("Enter operation to be performed : ");
			
int operation = Integer.parseInt(sc.nextLine());
						
if(operation == 4)
{
				
System.out.print("Enter User Name : ");
				
String userName = sc.nextLine();

employeeList.add(userName);				
System.out.print("Enter Role:");
String role=sc.nextLine();
employeeRole.add(role);
}			
else if(operation == 5)
{
for( int i=0;i<employeeList.size();i++)
{
								
System.out.print(employeeList.get(i)+"-"+employeeRole.get(i)+"\n");
}
	 			
System.out.println();
	
}
else if(operation==6)					
{
				
System.exit(0);
			
}
		
}
	
}

}
