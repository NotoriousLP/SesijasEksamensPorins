import javax.swing.JOptionPane;

public class MiniTests {
	static int punkti = 0; //Mainīgais, kas skaitīs pareizās atbildes
	static String atbilde; //Mainīgais, kuru es izmantošu metodēs
	static String[] nepareizasAtbildes = {" "," "," "}; //Tukšs masīvs ar garumu 10, izmantošu rezultātam
	public static void Sakums() {
		JOptionPane.showMessageDialog(null, "Šis ir elektroniskais tests par Viendimensiju masīviem programmēšanas valodā Java\nTests satur 10 jautājumus, katram jautājumam 4 atbilžu varianti, no kuriem pareizi ir 2 vai 3 atbilžu varianti.");
	}
	public static void pirmaisJautajums() {
		do{
		atbilde = JOptionPane.showInputDialog("1. Kuri no tiem ir pareizi uzrakstīta masīva sintakse"
				+ "\na)int[] A"
				+ "\nb)int []A"
				+ "\nc)[]int A"
				+ "\nd)int A[]"
				+ "\n2 vai 3 atbildes var būt pareizas"
				+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b"
				+ "\nAtbildes liekat alfabētu secībā!");
		atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		 //While cikls, lai nevar ievadīt neko nepareizu
		if(atbilde.equals("a;b;d")) punkti++; //ja atbilde sakrīt ar to kas ir ierakstīts, tad pienāk punkts
		else nepareizasAtbildes[0] = "1."; // ja nē, tad masīvā pieraksta "1." un tā pie katras metodes.
	}
	public static void otraisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("2. Ar kādiem veidiem var izdrukāt masīvus?"
					+ "\na)for each"
					+ "\nb)do while cikls"
					+ "\nc)while cikls"
					+ "\nd)for cikls"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;d")) punkti++;
		else nepareizasAtbildes[1] = "2.";
	}
	public static void tresaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("3. Kādas ir masīvu priekšrocības?"
					+ "\na)Nav lieluma ierobežojuma"
					+ "\nb)Brīvķluve"
					+ "\nc)Koda optimizācija"
					+ "\nd)Masīva lielums nav fiksēts"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("b;c")) punkti++;
		else nepareizasAtbildes[2] = "3.";
	}
	
	public static void rezultats() {
		if(punkti == 0) { //ja nav vispār nekas atbildēts pareizi, tad izvadīs ziņojumu, ka nav atbildēts pareizi uz nevienu jautājumu.
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi uz nevienu jautājumu no 3 jautājumiem."
					+"\nJautājumi, kuri nebija pareizi: ");
		}else if(punkti == 3) { //Ja viss ir atbildēts pareizi, tad izvadīs ziņojumu, kad viss ir atbildēts pareizi.
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi uz visiem jautājumiem  "+punkti+" no 3");
	
	     }else if(punkti == 1) { //Ja tikai viens jautājums pareizs tad izvadīs ziņojumu, ka esi atbildēji pareizi tikai uz vienu jautājumu, šis ir ielikts galotnes dēļ
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi tikai "+punkti+" jautājumu no 3 jautājumiem."
					+"\nJautājumi, kuri nebija pareizi: ");
		}else{ //Ja vairāk par viens, tad izvadīs tādu pašu atbildi, tikai galotni samainīta.
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi "+punkti+" jautājumus no 3 jautājumiem"
					+"\nJautājumi, kuri nebija pareizi: ");
		}
		
		//Ja punkti nav 10, tad izies cauri switch konstrukcijai
		if(punkti!=3) {
		for(int i=0; i<nepareizasAtbildes.length; i++) {
			switch(nepareizasAtbildes[i]) {
			//Switchā tagad skatīsies, kur ir "1." vai "2." utt. un izdrukās nepareizo jautājumu sarakstu.
			case "1.": JOptionPane.showMessageDialog(null, "1. Kuri no tiem ir pareizi uzrakstīta masīva sintakse"
					+ "\na)int[] A"
					+ "\nb)int []A"
					+ "\nc)[]int A"
					+ "\nd)int A[]"); break;
			case "2.": JOptionPane.showMessageDialog(null, "2. Ar kādiem veidiem var izdrukāt masīvus?"
					+ "\na)for each"
					+ "\nb)do while cikls"
					+ "\nc)while cikls"
					+ "\nd)for cikls"); break;
			case "3.": JOptionPane.showMessageDialog(null, "3. Kādas ir masīvu priekšrocības?"
					+ "\na)Nav lieluma ierobežojuma"
					+ "\nb)Brīvķluve"
					+ "\nc)Koda optimizācija"
					+ "\nd)Masīva lielums nav fiksēts"); break;
			}
		}
	 }
	}
	
	public static void main(String[] args) {
	 Sakums();
	 pirmaisJautajums();
	 otraisJautajums();
	 tresaisJautajums();
	 rezultats();
	}

}
