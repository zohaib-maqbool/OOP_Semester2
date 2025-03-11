public class Book{
	
	String title;
	String issn;
	Date publicationDate;
	Person author;

	public Book(String title,String issn,Date publicationDate,Person author){
		this.title=title;
		this.issn=issn;
		this.publicationDate= new Date(publicationDate);
		this.author= new Person(author);
	}

	public Book(Book other){
		this.title=other.title;
		this.issn=other.issn;
		this.publicationDate= new Date(other.publicationDate);
		this.author= new Person(other.author)[;
	}

	public void showDetails(){
		System.out.println(title + " , " +issn+ " , " +publicationDate+ " , " + author);
	}
		




}