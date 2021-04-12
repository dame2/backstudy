package homework;


public class Notice {
	
		private int id;
		private int hit;
		private String title;
		private String writerId;
		
		public Notice() {}
		
		public Notice(int id, String title, String writerId, int hit) {
			this.id = id;
			this.hit = hit;
			this.title = title;
			this.writerId = writerId;
		}
		
		public String toString() {
			String rtn = "id:" + id +", title: "+title+", writerId: "+writerId+", hit: "+hit;
			return rtn;
		}
	}
