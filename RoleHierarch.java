import java.io.*;

import java.util.*;

public class RoleHierarch
{
	
public static void main(String[] args)
{
		
Scanner sc = new Scanner(System.in);

		
HashMap<Integer,String>operations = new HashMap<Integer,String>();
		
List<String>employeeList =new ArrayList<String>();
	
List<String>employeeRole=new ArrayList<String>();		
System.out.print("Enter root role : ");
	
	
String rootRole = sc.nextLine();
		
employeeList.add(rootRole);
	
operations.put(1, "Add Sub Role");
		
operations.put(2, "Display Roles");

operations.put(3, "Delete Role");

operations.put(4, "Add User");
		
operations.put(5, "Display User");

operations.put(6,"Display User and Sub User");
operations.put(7,"Delete User");	
operations.put(8,"Number of User from top");	
operations.put(9, "Exit");

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

}	
else if(operation == 3)
{
				
System.out.print("Enter the role to be deleted : ");
				
String deleted = sc.nextLine();
				
employeeList.remove(deleted);

System.out.print("Enter the role to be transferred:");
String transferred=sc.nextLine();
employeeList.add(transferred);				
}

else if(operation == 4)
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
}
else if(operation == 6)
 {
for( int i=0;i<employeeList.size();i++)
{
								
System.out.print(employeeList.get(i)+"-"+employeeRole.get(i)+"\n");
}
}
if(operation == 7)
{
				
System.out.print("Enter user Name to be deleted : ");
				
String deleted = sc.nextLine();
				
employeeList.remove(deleted);
			
}

if(operation == 8)
{
				
System.out.print("Enter user name : ");
				
String userName = sc.nextLine();

employeeList.add(userName);				
System.out.print("Number of User from top:");
String top=sc.nextLine();
employeeList.add(top);	 		 								
System.out.println();
	
}
else if(operation==9)	
{
System.exit(0);		
}

}
}
}			