package StudentDBMysql;


//import StudentDBMysql.StudentDBMysql;
import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentTest {
    private StudentDBMysql studenttester;
    @BeforeClass
    public static void setUpAll(){
        System.out.println("Before execution");
    }

    @Before
    public void setUp(){
        studenttester = new StudentDBMysql();
    }

    @Test
    public void shouldAupdateDB(){
        assertTrue(studenttester.updateDB());
//        System.out.println("Manual database Update successful");
    }
    @Test
    public void shouldBaddRecords(){
        assertTrue(studenttester.addRecords("36","Harshal","Kudale","ABC"));
//        System.out.println("New Record added from test function");
    }
    @Test
    public void shouldCUpdateRecords(){
        assertTrue(studenttester.updateRecords(36,"63","Harshal","Kudale","ABC"));
//        System.out.println("Record Modified from test function");
    }
    @Test
    public void shouldDDeleteRecord(){
        assertTrue(studenttester.deleteRecords(63));
//        System.out.println("Record Successfully deleted from test function");
    }
    @Test
    public void shouldEResetFields(){
        assertTrue(studenttester.resetRecords());
//        System.out.println("Fields Reset successful");
    }
    @Test
    public void shouldFPrintRecords(){
        assertTrue(studenttester.printRecords());
//        System.out.println("Printing wizard opened");
    }
    @After
    public void tearDown(){
    }

    @AfterClass
    public static void tearDownAll(){
        System.out.println("After execution");
    }
}
