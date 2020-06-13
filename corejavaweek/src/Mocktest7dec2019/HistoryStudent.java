package Mocktest7dec2019;

public class HistoryStudent extends data{

		private int historymarks;
		private int civicsmarks;
		
		public HistoryStudent(){
			
		}
		public HistoryStudent(String studentName,String studentclass,int historymarks,int civicsmarks){
			super(studentName,studentclass);
			this.historymarks=historymarks;
			this.civicsmarks=civicsmarks;
		}
		protected int getHistorymarks() {
			return historymarks;
		}
		protected void setHistorymarks(int historymarks) {
			this.historymarks = historymarks;
		}
		protected int getCivicsmarks() {
			return civicsmarks;
		}
		protected void setCivicsmarks(int civicsmarks) {
			this.civicsmarks = civicsmarks;
		}
		@Override
		public double percentage() {
			int marks1=historymarks+civicsmarks;
			return (marks1/200)*100;
		}
		@Override
		public String toString() {
			return "HistoryStudent [historymarks=" + historymarks + ", civicsmarks=" + civicsmarks + ", percentage()="
					+ percentage() + ", getId()=" + getId() + ", getStudentName()=" + getStudentName()
					+ ", getStudentclass()=" + getStudentclass() + "]";
		}
		
		
		
		
		
		
		}
		
	


