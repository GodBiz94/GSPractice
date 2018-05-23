import java.util.Scanner;

public class Fraction {

	private int numerator, denominator;

	public Fraction() {
		// TODO Auto-generated constructor stub
		numerator = denominator = 0;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Fraction add(Fraction b) {
		if ((denominator == 0) || (b.denominator == 0))
			throw new IllegalArgumentException("Invalid input");
		int common = lcd(denominator, b.denominator);

		Fraction commonA = new Fraction();
		Fraction commonB = new Fraction();

		commonA = convert(common);
		commonB = b.convert(common);

		Fraction sum = new Fraction();

		sum.numerator = commonA.numerator + commonB.numerator;
		sum.denominator = common;
		sum = sum.reduce();

		return sum;

	}

	private int lcd(int denom1, int denom2) {
		int factor = denom1;
		while ((denom1 % denom2) != 0)
			denom1 += factor;
		return denom1;
	}

	private Fraction convert(int common) {
		Fraction result = new Fraction();
		int factor = common / denominator;
		result.numerator = numerator * factor;
		result.denominator = common;

		return result;

	}

	private Fraction reduce() {
		Fraction result = new Fraction();
		int common = 0;

		int num = Math.abs(numerator);
		int den = Math.abs(denominator);

		if (num > den)
			common = gcd(num, den);
		else if (num < den)
			common = gcd(den, num);
		else
			common = num;
		result.numerator = numerator / common;
		result.denominator = denominator / common;

		return result;

	}

	private int gcd(int denom1, int denom2) {

		int factor = denom2;
		while (denom2 != 0) {
			factor = denom2;
			denom2 = denom1 % denom2;
			denom1 = factor;
		}
		return denom1;
	}

	
	
	public void output(){
		System.out.println(this);
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		String buffer = numerator + "/" + denominator;
		return buffer;
	}

	public static void main(String[] args) {

		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();

		Scanner sc = new Scanner(System.in);
        
		
		
		f1.setNumerator(101);
		f1.setDenominator(95);

		f2.setNumerator(102);
		f2.setDenominator(96);

		Fraction result = new Fraction();

		result = f1.add(f2);
		System.out.println(f1 + "+" + f2 + " = " + result);

		
		
	}

}
