package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QL_PhuongTien implements ICar{
	Phuong_Tien phuongtiennew;
	public ArrayList<Phuong_Tien>ds;
	public void Tao() {
		this.ds.add(phuongtiennew);
	}
	public void Xoa() {
		this.ds.remove(phuongtiennew);
	}
//	public void Doc() {
//		this.ds.forEach(phuongtiennew);
//	}
//	public void Sua() {
//		this.ds.(phuongtiennew);
//	}
	@Override
	public void showInfo() {
	      System.out.println(ds.toString());		

	}
}
