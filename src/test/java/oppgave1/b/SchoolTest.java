package oppgave1.b;

import oppgave1.b.School;
import oppgave1.b.Student;
import oppgave1.b.Subject;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class SchoolTest {

    private List<School> schools;
    private List<Student> students;

    @Before
    public void setUp() throws Exception {
        students = Arrays.asList(
                new Student("Aaron", 1, Arrays.asList(Subject.HISTORY, Subject.MATH)),
                new Student("Ben", 2, Arrays.asList(Subject.MUSIC, Subject.MATH)),
                new Student("Carina", 3, Arrays.asList(Subject.PROGRAMMING, Subject.MATH)),
                new Student("Daniel", 4, Arrays.asList(Subject.LAW, Subject.MUSIC)),
                new Student("Elon", 5, Arrays.asList(Subject.PROGRAMMING, Subject.MUSIC))
        );

        schools = Arrays.asList(
                new School("Westerdals", "Oslo", students),
                new School("NTNU", "Trondheim", students),
                new School("RMIT", "Melbourne", students),
                new School("Kingston", "London", students)
        );
    }

    @Test
    public void findAllStudentsInOslo() throws Exception {
        List<Student> studentsInOslo = null;

        assertThat(studentsInOslo).hasSize(5);
    }

    @Test
    public void findAllStudentsWhoStudyProgramming() throws Exception {
        List<Student> studentsStudyingProgramming = null;

        assertThat(studentsStudyingProgramming).hasSize(8);
    }

}