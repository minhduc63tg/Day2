package java_day2;

public class Sach {
	private String tenSach;
	private int nxb;
	private double gia;
	private TacGia tg;
	public Sach(String tenSach, int nxb, double d, TacGia tg) {
		this.tenSach = tenSach;
		this.nxb = nxb;
		this.gia = d;
		this.tg = tg;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public int getNxb() {
		return nxb;
	}
	public void setNxb(int nxb) {
		this.nxb = nxb;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public TacGia getTg() {
		return tg;
	}
	public void setTg(TacGia tg) {
		this.tg = tg;
	}
	public void inTen() {
		System.out.println(this.tenSach); 
	}
	public boolean isTrung(Sach sachKhac) {
		return this.nxb== sachKhac.nxb;
	}
	
	public double cost(double x) {
		return this.gia *(1-x/100);
	}
	
}
