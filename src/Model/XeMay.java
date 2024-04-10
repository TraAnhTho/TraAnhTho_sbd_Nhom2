package Model;

import java.util.ArrayList;

public class XeMay extends Phuong_Tien implements ICar{
	private int CongSuat;
	ArrayList<Phuong_Tien> ds;
	Phuong_Tien phuongtien;

	public XeMay(String iD, String brand, int publishYear, double price, String color, int congSuat) {
		super(iD, brand, publishYear, price, color);
		CongSuat = congSuat;
	}

	public int getCongSuat() {
		return CongSuat;
	}

	public void setCongSuat(int congSuat) {
		CongSuat = congSuat;
	}

	@Override
	public void showInfo() {
		//this.phuongtien.forEach(o -> 
	      System.out.println(ds.toString());		
	}
	
	
}
