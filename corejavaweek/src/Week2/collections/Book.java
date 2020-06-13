package Week2.collections;

public class Book {

		private int id;
		private String name;
		private String Author;
		private String Publisher;
		private static int idgenerator=100;

		Book(){
			
		}
		 Book(String name,String Author,String Publisher)
		{
			id=idgenerator++;
			this.name=name;
			this.Author=Author;
			this.Publisher=Publisher;
		}
		protected int getId() {
			return id;
		}
		protected void setId(int id) {
			this.id = id;
		}
		protected String getName() {
			return name;
		}
		protected void setName(String name) {
			this.name = name;
		}
		protected String getAuthor() {
			return Author;
		}
		protected void setAuthor(String author) {
			Author = author;
		}
		protected String getPublisher() {
			return Publisher;
		}
		protected void setPublisher(String publisher) {
			Publisher = publisher;
		}
		@Override
		public String toString() {
			return "Bookcollections [id=" + id + ", name=" + name + ", Author=" + Author + ", Publisher=" + Publisher
					+ "]";
		}
		

	}


