package classes;
import java.lang.*;


public class MainDish extends FoodItem
{
	private String category;
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	
	}
	
	public void showInfo()
	{
		System.out.println(" fid: "+fid);
		System.out.println(" Name: "+name);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price : " +price);
		System.out.println(" Category: "+ category);
		System.out.println();
	}
}