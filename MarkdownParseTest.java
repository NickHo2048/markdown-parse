import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void paranthesisInWrongPlace() throws IOException{
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));   
    }

    @Test
    public void test1() throws IOException{
        boolean check = false;
        try {
            MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md")));
        } catch (Exception e) {
            check = true;
        }
        assertTrue("Check constructor with invalid argument", check);
    }

    @Test
    public void test2() throws IOException{
        assertEquals(List.of("https://something.com"), MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void test3() throws IOException{
        assertEquals(List.of("https://test.com", "https://thing.com"), MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }
}
