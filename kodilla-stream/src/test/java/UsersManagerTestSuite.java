import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTestSuite {

    @Test
    public void testFilterChemistGroupUsernames()
    {
        List<String> actual = UsersManager.getFilteredUsernames();

        List<String> expected = new ArrayList<String>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        assertEquals(expected, actual);
    }

    @Test
    public void testUsersOlderThan40()
    {
        List<String> actual = UsersManager.getFilteredAge();

        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gus Firing");
        expected.add("Gale Boetticher");
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterUsersWhereAgeIsUnder40AndNumberOfPostsIsBiggerThan300()
    {
        List<String> actual = UsersManager.getFilteredPosts();

        List<String> expected = new ArrayList<>();
        expected.add("Jessie Pinkman");
        expected.add("Mike Ehrmantraut");
        assertEquals(expected, actual);
    }
}
