package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Model.QL_PhuongTien;

public class Oto extends Phuong_Tien implements ICar{
	Phuong_Tien phuongtien;
	ArrayList<Phuong_Tien> ds;

	private int Slots;
	private String engineType;
	public Oto(String iD, String brand, int publishYear, double price, String color, int slots, String engineType) {
		super(iD, brand, publishYear, price, color);
		Slots = slots;
		this.engineType = engineType;
	}
	public Oto(String iD, String brand, int publishYear, double price, String color) {
		super(iD, brand, publishYear, price, color);
	}
	public Oto() {
		super();
	}
	public int getSlots() {
		return Slots;
	}
	public void setSlots(int slots) {
		Slots = slots;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public void showInfo() {
      //this.phuongtien.forEach(o -> 
      System.out.println(ds.toString());
	}
	
	
	
}
