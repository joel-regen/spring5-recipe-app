package guru.springframework.domain;

import lombok.val;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void shouldSetId() {
        Long testId = 4l;
        category.setId(testId);
        assertEquals(testId, category.getId());
    }

    @Test
    public void shouldSetDescription() {
    }

    @Test
    public void shouldSetRecipes() {
    }
}