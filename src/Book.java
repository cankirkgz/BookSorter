public class Book implements Comparable<Book>{
    private String bookName;
    private int pageCount;
    private String author;
    private String publishedDate;

    public Book(String bookName, int pageCount, String author, String publishedDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.getBookName());
    }
}
