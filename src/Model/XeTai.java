package Model;

import java.util.ArrayList;

public class XeTai extends Phuong_Tien implements ICar{
	private int TrongTai;
	Phuong_Tien phuongtien;
	ArrayList<Phuong_Tien> ds;

	public XeTai(String iD, String brand, int publishYear, double price, String color, int trongTai) {
		super(iD, brand, publishYear, price, color);
		TrongTai = trongTai;
	}

	public int getTrongTai() {
		return TrongTai;
	}

	public void setTrongTai(int trongTai) {
		TrongTai = trongTai;
	}

	@Override
	public void showInfo() {
		//this.phuongtien.forEach(o -> 
	      System.out.println(ds.toString());		
	}
	
	
}
