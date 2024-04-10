package Model;

import java.util.ArrayList;

public class Phuong_Tien {
	private String ID;
	private String Brand;
	private int publishYear;
	private double Price;
	private String Color;
	ArrayList<Phuong_Tien>pt;
	public Phuong_Tien(String iD, String brand, int publishYear, double price, String color) {
		super();
		ID = iD;
		Brand = brand;
		this.publishYear = publishYear;
		Price = price;
		Color = color;
	}
	public Phuong_Tien() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	
	
	
	
	
}
