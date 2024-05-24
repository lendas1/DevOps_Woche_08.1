package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class ToDoTest {

    @Test
    public void testToDo() {
        var toDo1 = new ToDo(1, "title", "description");
        assertEquals("title", toDo1.getTitle());
        assertEquals("description", toDo1.getDescription());
        assertEquals(1, toDo1.getId());
        var toDo2 = new ToDo();
        assertNotNull(toDo2); // Ensure the object is created
    }

}
