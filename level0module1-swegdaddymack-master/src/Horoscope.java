
public class Horoscope {

	public static void main(String[] args) {
	

String Janurary = "Capricorn";
String Feburary = "Aquarius";
String March = "Pisces";
String April = "Aries";
String May = "Taurus";
String June = "Gemini";
String July = "Cancer";
String August = "Leo";
String September = "Virgo";
String October = "Libra";
String November = "Scorpio";
String December = "Sagittarius";
JOptionPane.showMessageDialog(null, "What mont were you born");
String born = JOptionPane.showInputDialog(null, "What month were you born");
if (born.equals(Janurary)) {
	JOptionPane.showMessageDialog(null, "Your horoscope is" + Janurary);
}
}

}

