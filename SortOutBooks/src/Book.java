public class Book  implements Comparable<Book>{
    String name;
    String authorName;
    int issueDate;
    int pageCount;


    public Book(String name, String authorName, int issueDate, int pageCount) {
        this.name = name;
        this.authorName = authorName;
        this.issueDate = issueDate;
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.name);
    }

    public String toString() {
        return "Book name : " + getName() + "|| Author :" + getAuthorName() + "|| Issue date :" + getIssueDate() + "|| Page count : " + getPageCount() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
