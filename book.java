

             class book{
	public String title;
	public String author;
	public String year_of_publication;
	
	public void book(){
	this.title=title;
	this.author=author;
	this.year_of_publication=year_of_publication;
	}
	public static void main(String[] args){
	book book1=new book();
	book book2=new book();
		book1.book();
		book1.title="Sherlock Holmes";
		book1.author="Arthur Conan Doyle";
		book1.year_of_publication="1887";
		book2.book();
		book2.title="Harry Potter";
		book2.author="J.K. Rowling";
		book2.year_of_publication="1997";
		System.out.println("Book-1");
		System.out.println("Title :" +book1.title);
		System.out.println("Author :" +book1.author);
System.out.println("Year of publication :" +book1.year_of_publication);
		System.out.println("Book-2");
		System.out.println("Title :" +book2.title);
		System.out.println("Author :" +book2.author);
System.out.println("Year of publication :" +book2.year_of_publication);
	}
}
