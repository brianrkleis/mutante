package teste.java.PiTest;
import main.java.PiTest.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest
{
    @Test
    public void MyFirstTestMethod(){
        Employee sut = new Employee("Alice", "Programmer", (float) 100000);

        sut = new Employee("Alice", "Programmer", (float) 100000);
        String  expected = "Hi! My name is Alice and I work as a Programmer.";
        String result = sut.Introduce();
        Assert.assertEquals(expected, result);

    }

    @Test
    public void SemNome()
    {
        Employee sut = new Employee("", "Programmer", (float)100000);
        String expected = "Funcionario sem nome";
        String result = sut.Introduce();
        Assert.assertEquals(expected, result);

    }
}