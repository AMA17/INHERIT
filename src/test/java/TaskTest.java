import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test

    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        Todos todos = new Todos();

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        Todos todos = new Todos();

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testEpicMatches() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);
        Todos todos = new Todos();


        boolean actual = epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testEpicNotMatches() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);
        Todos todos = new Todos();


        boolean actual = epic.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testTopicMeetingMatches () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testProjectMeetingMatches () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testNotMeetingMatches () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        boolean actual = meeting.matches("Позвонить");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

}