package com.soni;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.soni.dao.EmployeeDAO;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {

	private static EmployeeDAO empdao;
	private static Employee emp1;
	private static Employee emp2;

	@BeforeClass
	public static void initilization() {

		empdao = mock(EmployeeDAO.class);

		emp1 = new Employee(1001L, "Lucky", 99999.99, 29, true);
		emp2 = new Employee(1002L, "Sudipto", 9999.90, 27, true);

		when(empdao.getAll()).thenReturn(Arrays.asList(emp1, emp2));
		when(empdao.getEmployee(1001L)).thenReturn(emp1);
		when(empdao.addEmployee(emp2)).thenReturn(emp2.getEmpName());
		when(empdao.updateEmployee(emp2)).thenReturn(emp2.getEmpName());

		when(empdao.deleteEmployee(1001L)).thenReturn("Deleted");
		when(empdao.deleteEmployee(1001L)).thenReturn("REMOVED");
		when(empdao.empStatus(emp1)).thenReturn(true).thenReturn(false).thenReturn(true).thenReturn(false);
	}

	@Test
	public void getAllTest() {
		List<Employee> allemp = empdao.getAll();
		assertNotNull(allemp);
		assertEquals(2, allemp.size());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void getEmployeeTest() {
		Employee emp = empdao.getEmployee(1001L);
		assertNotNull(emp);
		Assert.assertEquals(1001L, emp.getEmpId());
		Assert.assertEquals("Lucky", emp.getEmpName());
		Assert.assertEquals(99999.99, emp.getEmpSalary(), 0);
		Assert.assertEquals(29, emp.getEmpAge());
		Assert.assertEquals(true, emp.isEmpStatus());
	}

	@Test
	public void updateEmployeeTest() {
		String newName = empdao.updateEmployee(emp2);
		assertNotNull(newName);
		Assert.assertEquals("Sudipto", newName);
	}

	@Test
	public void addEmployeeTest() {
		String empName = empdao.addEmployee(emp2);
		assertNotNull(empName);
		Assert.assertEquals("Sudipto", empName);
	}

	@Test
	public void deleteEmployeeTest() {
		String delEmp = empdao.deleteEmployee(1001L);
		assertNotNull(delEmp);
		Assert.assertEquals("REMOVED", delEmp);
	}

	@Test
	public void MulipleCallsTest() {
		boolean val = empdao.empStatus(emp1);
		System.out.println(val);
		val = empdao.empStatus(emp1);
		System.out.println(val);
		val = empdao.empStatus(emp1);
		System.out.println(val);
		val = empdao.empStatus(emp1);
		System.out.println(val);
	}

}
