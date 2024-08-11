package java_day2;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int d, int m, int y) {
		if(d>=1 && d<=31)
			this.day = d;
		else {
			this.day= 1;
		}
		
		if(m>=1 && m<=12)
			this.month = m;
		else {
			this.month=1;
		}
		if(y >=1)
			this.year = y;
		else {
			this.year=1;
		}
	}
	
	public int getDay() {
		return this.day;
	}

	public void setDay(int d) {
		if(d >=1 && d<=31)
			this.day = d;
	}
	
	

	public int getMonth() {
		return month;
	}

	public void setMonth(int m) {
		if(m>=1 && m<=12)
			this.month = m;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		if(y>=1)
			this.year = y;
	}

	public static void main(String[] args) {
		Date ob= new Date(25,1,2024);
		
		System.out.println("day= "+ob.getDay());
		ob.setDay(32);
		System.out.println("day= "+ob.getDay());
//		System.out.println("month= "+ob.getMonth());
//		ob.setMonth(13);
//		System.out.println("month= "+ob.getMonth());
		
	}
	
	
}
