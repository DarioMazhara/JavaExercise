import org.junit.Assert;
import org.junit.Test;
import practiceOOP.University;

public class UniversityTest {

    @Test
    public void testAddStudent() {
        University uni = new University("USF");
        uni.addStudent("Elizabeth Lee", 527);
        uni.addStudent("Matthew Jordan", 252);

        String str = uni.toString();
        Assert.assertEquals(str, "Elizabeth Lee, 527" + System.lineSeparator() +
                "Matthew Jordan, 252");

    }

    @Test
    public void testFindStudent() {
        University uni = new University("USF");
        uni.addStudent("Elizabeth Lee", 527);
        uni.addStudent("Matthew Jordan", 252);

        boolean foundSt1 = uni.findStudent("Elizabeth Lee");
        Assert.assertTrue(foundSt1);

        boolean foundSt2 = uni.findStudent("Justin Meyers");
        Assert.assertFalse(foundSt2);
    }

    @Test
    public void testSort() {
        University uni = new University("USF");
        uni.addStudent("Elizabeth Lee", 527);
        uni.addStudent("Matthew Jordan", 252);
        uni.addStudent("Fatima Ghrahamani", 145);

        uni.sort();
        String str = uni.toString();
        Assert.assertEquals(str, "Elizabeth Lee, 527" + System.lineSeparator() +
                        "Fatima Ghrahamani, 145" + System.lineSeparator() +
                        "Matthew Jordan, 252");

    }
}
