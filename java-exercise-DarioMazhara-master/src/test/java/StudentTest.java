import org.junit.Assert;
import org.junit.Test;
import practiceOOP.Student;

public class StudentTest {

    @Test
    public void testGetName() {
        Student st = new Student("Jessie", 145);
        String name = st.getName();
        Assert.assertEquals(name, "Jessie"); // your getName method should return Jessie
    }

    @Test
    public void testGetId() {
        Student st = new Student("Jessie", 145);
        int id = st.getId();
        Assert.assertEquals(id, 145); // your getId method should return id 145
    }

    @Test
    public void testToString() {
        Student st = new Student("John Li", 296);
        String actual = st.toString();
        String expected = "John Li, 296";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCompareTo() {
        Student st1 = new Student("John Li", 296);
        Student st2 = new Student("Swetha Kumar", 132);
        int res = st1.compareTo(st2);
        Assert.assertTrue(res <= -1); // your compareTo method should return -1 because "John" is less than "Swetha"

        Student st3 = new Student("Abigail Smith", 637);
        int res1 = st2.compareTo(st3);
        Assert.assertTrue(res1 >= 1); // your compareTo method should return 1 because "Swetha" is larger than "Abigail"
    }
}