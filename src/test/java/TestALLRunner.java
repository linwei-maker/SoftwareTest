import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ MyTreeListTest.class,TestMainTest.class})
public class TestALLRunner {
        public static Test suite(){
        TestSuite suite = new TestSuite("All JUnit test");
        suite.addTest(new JUnit4TestAdapter(MyTreeList.class));
        return (Test)suite;
    }
    public void testsuite(){
        System.out.println("开始运行测试集");
    }
}