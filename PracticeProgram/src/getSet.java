class myEmployee
{
	private int id;
	private String name;
	
	
	public void setId(int i) 
	{
		this.id= i;

	}
	
	 public int getId() 
	{
		 return id;		
		 
				
	}
	
	 public void setName(String n)
    {
		name=n;
	}
	 
     public String getName()
    {
    	return name;
	}
    
   
    
	
}
public class getSet {
	public static void main(String args[])
	{
		myEmployee me=new myEmployee();
		
		me.setId(123);
		me.setName("Krushna tale");
		
		System.out.print("The Employee name is "+ me.getName());
		System.out.println(" and Id number is - "+me.getId());
		
	}

}
