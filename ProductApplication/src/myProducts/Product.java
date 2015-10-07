package myProducts;

import java.text.NumberFormat;

public class Product
{
    protected String code;
    protected String description;
    protected double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
    	this.code = "";
    	this.description = "";
    	this.price = 0;
    	count++;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    // create public access for the count variable
	public static int getCount()   
    {                              
        return count;
    }
    
    public String getFormattedPrice(){
    	NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price); 
    }
    public String classType(){
    	return "This is a product.";
    }
}
