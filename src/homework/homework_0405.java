package homework;

public class homework_0405 {

	public static void main(String[] args) {
		Season[] season = new Season[4];
		season[2] = new Spring();
		season[3] = new Summer();
		season[1] = new Fall();
		season[0] = new Winter();


		for (int i = 0; i < 4; i++) {
			System.out.printf("%s: %d", season[i].change(), season[i].getTemp());
		}
	}

	abstract class Season {
		int temp;
		public abstract String change();
		
		public int getTemp() {
			return temp;
		}
	}

	class Spring extends Season {
		public Spring() {
			temp = 12;
		}
		public String change() {
			return "Spring";
		}
	}

	class Summer extends Season {
		public Summer() {
			temp = 33;
		}
		public String change() {
			return "Summer";
		}
	}

	class Fall extends Season {
		public Fall() {
			temp = 21;
		}
		public String change() {
			return "Fall";
		}
	}

	class Winter extends Season {
		public Winter() {
			temp = 1;
		}
		public String change() {
			return "Winter";
		}
	}

}
