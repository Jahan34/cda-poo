package minuteur;

public class Minuteur {
	 private int minute = 0;
	 
	 
	public int getMinute() {
		return this.minute;
	}
	

	public void setMinute(int nouvelleValeur) {
		if (nouvelleValeur > 59 || nouvelleValeur < 0) {
			this.minute = 0;
		} else {
			this.minute = nouvelleValeur;
		}
	}
	

	public void tic() {
		
		if (minute == 59) {
			minute = 0;
		} else {
			this.minute += 1;
		}
		System.out.println("tic = "+this.minute);
	}

	public void avancer(int n) {
		for (int i = 0; i >= minute; i++)
			;
		this.tic();

	}
}
