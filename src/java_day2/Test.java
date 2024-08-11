package java_day2;

public class Test {
	public static void main(String[] args) {
		Ngay day1= new Ngay(1,2,2022);
		Ngay day2= new Ngay(2,4,2023);
		
		TacGia tg1= new TacGia("mduc", day1);
		TacGia tg2= new TacGia("mphu", day2);
		
		Sach s1= new Sach("oop",2022,10000,tg1);
		Sach s2= new Sach("ltc",2023,15000,tg2);
		Sach s3= new Sach("etc",2023,120000,tg1);
		
		s1.inTen();
		s2.inTen();
		s3.inTen();
		
		System.out.println(s1.isTrung(s2));
		System.out.println(s2.isTrung(s3));
		
		System.out.println(s1.cost(5));
		System.out.println(s2.cost(10));
	}
}
