<h1>Book Sorter</h1>

  <p>
        This Java program demonstrates a book sorting application using sets and comparators. The program allows you
        to create instances of the <code>Book</code> class, which represents a book with properties such as book name,
        page count, author name, and published date. The books are sorted based on their attributes using two different
        sorting criteria: by book name and by page count.
    </p>

   <h2>Table of Contents</h2>

   <ul>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#usage">Usage</a></li>
        <li><a href="#examples">Examples</a></li>
        <li><a href="#contributing">Contributing</a></li>
        <li><a href="#license">License</a></li>
    </ul>

   <h2 id="installation">Installation</h2>

   <ol>
        <li>Ensure you have Java Development Kit (JDK) installed on your system.</li>
        <li>Clone this repository to your local machine or download the source code as a ZIP file.</li>
        <li>Compile the Java source files using a Java compiler of your choice. For example:
            <pre><code>javac Main.java</code></pre>
        </li>
        <li>Run the compiled program:
            <pre><code>java Main</code></pre>
        </li>
    </ol>

   <h2 id="usage">Usage</h2>

   <p>
        The <code>Main</code> class serves as the entry point for the application. It contains a <code>main</code>
        method where you can create instances of the <code>Book</code> class and sort them based on different
        criteria.
    </p>

   <p>
        The <code>Book</code> class represents a book with properties such as <code>bookName</code>,
        <code>pageCount</code>, <code>author</code>, and <code>publishedDate</code>. It implements the
        <code>Comparable</code> interface, allowing books to be sorted based on their names.
    </p>

   <p>
        To sort books by name, the program uses the <code>CompareBookName</code> class, which implements the
        <code>Comparator</code> interface and defines a custom comparison logic based on book names. Similarly, the
        <code>ComparePageCount</code> class is used to sort books by page count.
    </p>

   <h2 id="examples">Examples</h2>

   <p>Here's an example usage of the program:</p>

   <pre><code>
&lt;Set&gt;bookSetByName = new TreeSet&lt;&gt;(new CompareBookName());
bookSetByName.add(new Book("Book1", 200, "Author1", "2021-01-01"));
bookSetByName.add(new Book("Book3", 150, "Author2", "2022-02-02"));
bookSetByName.add(new Book("Book2", 300, "Author3", "2020-03-03"));

System.out.println("Books sorted by name:");
for (Book book : bookSetByName) {
    System.out.println(book.getBookName());
}
    </code></pre>

   <p>
        This code snippet creates a <code>Set</code> of books and sorts them by name using the
        <code>CompareBookName</code> comparator. It then prints the sorted book names to the console.
    </p>

   <h2 id="contributing">Contributing</h2>

   <p>
        Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please
        open a new issue or submit a pull request.
    </p>

   <h2 id="license">License</h2>

  <p>
        This project is licensed under the <a href="LICENSE">MIT License</a>.
    </p>
