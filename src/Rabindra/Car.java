package Rabindra;

public class Car {


		private String color;
		private	double price;
		private String brand;
		private	String model;
		Car(String color,double price,String brand,String model)
		{
			this.color=color;
			this.price=price;
			this.brand=brand;
			this.model=model;
		}
		
		public String getColor()
		{
			return color;
		}
		public double getPrice()
		{
			return price;
		}
		public String getBrand()
		{
			return brand;
		}
		public String getModel()
		{
			return model;
		}
		public void setColor(String color,String brand,String model,double price)
		{
			this.color=color;
			this.price=price;
			this.brand=brand;
			this.model=model;
			
		}
	

}
