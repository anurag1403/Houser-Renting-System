package Information;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;
//import java.util.Scanner;
public class Start {
//	static Vector<Customer> CArray=new Vector<>();
	private static int i = 0;
	public static void main(String[] args) throws NameException {
		int n = 1;
		Scanner sc=new Scanner(System.in);		
		TreeMap<String, String[]> Cmap = new TreeMap<String, String[]>(); 
		TreeMap<String, OwnerInformation> Cmap1 = new TreeMap<String, OwnerInformation>(); 
		TreeMap<String, HouseInformation> Cmap2 = new TreeMap<String, HouseInformation>(); 
		String s = null;
		
		//System.out.println("If already logged in then ");
	
	//ArrayList<Owner> OArray = new ArrayList<Owner>();
	while(n!=0){
		System.out.println("enter the username ");
		String s1;
		int flag=1;
		int flag1 = 1;
		s = sc.next();
		try
		{
			if(s.length()<3)
			{
				flag=0;
				throw new NameException("Username is too small please enter again");
				
			}
		}
		catch(NameException e)
		{
			System.out.println(e.getMessage());
			continue;
		}
		if(flag!=0){
			try {
				System.out.println("Enter the password");
				s1=sc.next();
				if(s1.length()<7){
					flag1 = 0;
					throw new NameException("Password is too small please enter again");
				}
			
				if (Cmap.get(s) == null){
					String [] ss1=new String[2];	
					ss1[0]=s1;
					ss1[1]="O"+i;
				    Cmap.put(s,ss1 ); 
				}
				else
				{
					System.out.println("Username already in use. Please enter different username");
					continue;
				}
			
			}catch(NameException e){
				System.out.println(e.getMessage());
				continue;
			}
			if(flag1 == 0) {
				continue;
			}
		}
		n = 0;
	}
	n = 1;
	while(n!=0) {
		System.out.println("Press 0 to exit");
		System.out.println("Enter 1 to enter details of the Owner");
		/*System.out.println("Enter 2 to Update the details of the Owner");
		System.out.println("Enter 3 to delete the details of the Owner");
		System.out.println("Entetr 4 to Add the details of the customer");
		System.out.println("Enter 5 to print  the Custmoers");
		System.out.println("Enter 6 to print the Owners");
		System.out.println("Enter 7 to search for the Customer");
		System.out.println("Enter 8 to search for the Owner");
		System.out.println("Enter 9 to search for the customer");
		*/
		n=sc.nextInt();
		if(n==0)
		{
			break;
		}
		switch(n)
		{
		case 1:	
			String temp1, temp2, temp3, temp4;
			System.out.println("Enter the name");
			temp1 = sc.next();
			System.out.println("Enter the email");
			temp2 = sc.next();
			System.out.println("Enter the address");
			temp3 = sc.next();
			System.out.println("Enter the phone number");
			temp4 = sc.next();
			
			String id = Cmap.get(s)[1];
			OwnerInformation owner = new OwnerInformation(id, temp1, temp2, temp3, temp4);
			Cmap1.put(id, owner);
			try {
				FileOutputStream fos = new FileOutputStream(id + "owner.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(Cmap1);
				oos.close();
				fos.close();
				System.out.println("Data added....");
			}catch(IOException e) {
				e.printStackTrace();
			}
			String t1,t2,t3,t4,t5,t7,t8;
			boolean b1, b2, b3, b4;
			System.out.println("Enter the house name");
			t1 = sc.next();
			System.out.println("Enter the house address");
			t2 = sc.next();
			System.out.println("rent or sell?");
			t3 = sc.next();
			b1  =  (t3 == "rent" ? true :false);
			System.out.println("Broker required?");
			t4 = sc.next();
			b2  =  (t4 == "yes" ? true :false);
			System.out.println("Apartment or House?");
			t5 = sc.next();
			b3  =  (t5 == "Apartment" ? true :false);
			System.out.println("room type?");
			
			System.out.println("cost?");
			double t6 = Double.parseDouble(sc.next());
			System.out.println("Amenities?");
			System.out.println("Family or Bachelor?");
			t8 = sc.next();
			b4  =  (t8 == "Family" ? true : false);
			
			HouseInformation house = new HouseInformation(t1,t2 ,b1, b2, b3, RoomType.BHK1, t6, Amenities.AC, b4, owner, id);
			Cmap2.put(id, house);
			try {
				FileOutputStream fos1 = new FileOutputStream(id + "house.ser");
				ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
				oos1.writeObject(Cmap2);
				oos1.close();
				fos1.close();
				System.out.println("Data added....");
			}catch(IOException e) {
				e.printStackTrace();
			}
			/*break;
		case 2:
			break;
		case 3:	
			break;
			
		case 4: 
			fun1();
			
			//CArray.add()
			
			break;
		case 5:
			int flag=CArray.size();
			
			System.out.println("Name EmainId address phno.");
			for(int i=0;i<flag;i++)
			{
				System.out.println(CArray.get(i).getName()+" "+CArray.get(i).getEmainId()+" "+CArray.get(i).getAddress()+" "+CArray.get(i).getPhno());
			}
			break;
		case 6:
			break;
		case 7:
			NameS name = new NameS(); 
			String s=sc.next();
			Collections.sort(CArray, name); 
			int index = 0;
			try {
				index = Collections.binarySearch(CArray, 
						new Customer(s, null,null,null), name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(index);
			break;
		case 8:
			break;
		case 9:
			break;
		default:
			break;
			
		}	
		System.out.println("Enter o for owner registration");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------------------------------------");
		System.out.println("Name EmainId address phno.");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		*/
	
		
	}
	
}

/*public static  void fun1() {
	
	System.out.println("enter the details");
	Scanner sc=new Scanner(System.in);
	
	String ss=sc.nextLine();

	String[] s = ss.split("\\s+");
	int k=s.length;
	
	Customer cs = null;
	try {
		cs = new Customer(s[0],s[1],s[2],s[3]);
	} catch (NameException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CArray.add(cs);
*/
	


	
	
	}
}
