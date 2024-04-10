package Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Model.Oto;
import Model.Phuong_Tien;
import Model.QL_PhuongTien;
import Model.XeMay;

public class TestMain {
    public static void main(String[] args) {
    	ArrayList<Phuong_Tien> ds1;
    	Scanner scanner = new Scanner(System.in);
        QL_PhuongTien ql1 = new QL_PhuongTien();

      while (true) {
          System.out.println("\n----------");
          System.out.println("Lựa chọn:");
          System.out.println("1. Tạo");
          System.out.println("2. Xoa");
          System.out.println("3. Sua");
          System.out.println("4. Doc");
          System.out.print("Nhập lựa chọn của bạn: ");
          int ch = scanner.nextInt();

          switch (ch) {
              case 1:
            	  System.out.println("Nhập ID: ");
            	  String id = scanner.nextLine();
            	  System.out.println("Nhập Hãng: ");
            	  String hang = scanner.nextLine();
            	  System.out.println("Nhập nămSX: ");
            	  int nSS = scanner.nextInt();
            	  System.out.println("Nhập Gia: ");
            	  double gia = scanner.nextDouble();
            	  System.out.println("Nhập Màu: ");
            	  String mau = scanner.nextLine();
            	  Phuong_Tien pt1 = new Phuong_Tien(id, hang, nSS, gia, mau);
            	  ql1.Tao();
            	  System.out.println(pt1.toString());
            	  
            	  break;
              case 2:
            	  boolean KT= false;
            	  System.out.println("Nhập ID can xoa: ");
            	  String idxoa = scanner.nextLine();
            	  
//                	for(int j =  0 ; j < ql1.ds.get(i).size(); j++) {
//                		if(idxoa.equals(ql1.ds.get(i).pt.get(j).getiD()) {
//                			KT = true;
//                			break;
//                		}}
                	
            	  ql1.Xoa();
            	  
            	  break; 
              case 3:
            	  boolean KT1= false;
            	  System.out.println("Nhập ID can sua: ");
            	  String idsua = scanner.nextLine();
            	  
            	  
            	  break;
              case 4:
            	  ql1.showInfo();
            	  break;
            	  
            	  
				
            	  
            	  
            	  
            	  

              	default:
                  System.out.println("Lựa chọn không hợp lệ");
      
      }}
    }
}
