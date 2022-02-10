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
    public void test1() throws IOException{
        boolean check = false;
        try {
            MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md")));
        } catch (Exception e) {
            check = true;
        }
        assertTrue("Check constructor with invalid argument", check);
    }
}
