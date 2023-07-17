package com.liferay.training.internal.resource.v1_0;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.training.dto.v1_0.Emp;
import com.liferay.training.resource.v1_0.EmpResource;
import com.liferay.training.service.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/emp.properties",
	scope = ServiceScope.PROTOTYPE, service = EmpResource.class
)
public class EmpResourceImpl extends BaseEmpResourceImpl {
	@Reference
	CounterLocalService counterLocalService;
	
	@SuppressWarnings("serial")
	protected Emp _toEmp(com.liferay.training.model.Emp emp) {
		return new Emp() {{
			employeeId = emp.getEmployeeId();
			description = emp.getDescription();
			name = emp.getName();
			mappingId = emp.getMappingId();
		}};
	}
	
	@Override
	public Page<Emp> getApps() throws Exception {
		
		List<com.liferay.training.model.Emp> emp =  EmpLocalServiceUtil.getEmps(-1, -1);
		List<Emp> empList = new ArrayList<>();
		
		for(com.liferay.training.model.Emp e : emp) {
			empList.add(_toEmp(e));
		}
		return Page.of(empList);
	}
	
	
	
	@Override
	public Emp addApp(Emp emp) throws Exception {
	   System.out.println(emp);
		com.liferay.training.model.Emp e = EmpLocalServiceUtil.createEmp(Long.toString(counterLocalService.increment(com.liferay.training.model.Emp.class.getName())));
		e.setName(emp.getName());
		e.setDescription(emp.getDescription());
		e.setMappingId(emp.getMappingId());
		return _toEmp(EmpLocalServiceUtil.addEmp(e));
	}
	
	
	@Override
	public void deleteApp(String employeeId) throws Exception {
		EmpLocalServiceUtil.deleteEmp(employeeId);
	}
	
	public Emp updateApp(String employeeId,Emp emp)
		throws Exception {
		com.liferay.training.model.Emp e = EmpLocalServiceUtil.getEmp(employeeId);
		e.setDescription(emp.getDescription());
		e.setName(emp.getName());
		e.setMappingId(emp.getMappingId());
		
		return _toEmp(EmpLocalServiceUtil.updateEmp(e));
	}

}