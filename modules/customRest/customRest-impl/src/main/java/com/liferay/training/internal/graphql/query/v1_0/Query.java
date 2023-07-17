package com.liferay.training.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.training.dto.v1_0.Emp;
import com.liferay.training.resource.v1_0.EmpResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Query {

	public static void setEmpResourceComponentServiceObjects(
		ComponentServiceObjects<EmpResource>
			empResourceComponentServiceObjects) {

		_empResourceComponentServiceObjects =
			empResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {apps{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Get all emps")
	public EmpPage apps() throws Exception {
		return _applyComponentServiceObjects(
			_empResourceComponentServiceObjects, this::_populateResourceContext,
			empResource -> new EmpPage(empResource.getApps()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {app(employeeId: ___){employeeId, name, description, mappingId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves the emp")
	public Emp app(@GraphQLName("employeeId") String employeeId)
		throws Exception {

		return _applyComponentServiceObjects(
			_empResourceComponentServiceObjects, this::_populateResourceContext,
			empResource -> empResource.getApp(employeeId));
	}

	@GraphQLName("EmpPage")
	public class EmpPage {

		public EmpPage(Page empPage) {
			actions = empPage.getActions();

			items = empPage.getItems();
			lastPage = empPage.getLastPage();
			page = empPage.getPage();
			pageSize = empPage.getPageSize();
			totalCount = empPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Emp> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(EmpResource empResource)
		throws Exception {

		empResource.setContextAcceptLanguage(_acceptLanguage);
		empResource.setContextCompany(_company);
		empResource.setContextHttpServletRequest(_httpServletRequest);
		empResource.setContextHttpServletResponse(_httpServletResponse);
		empResource.setContextUriInfo(_uriInfo);
		empResource.setContextUser(_user);
		empResource.setGroupLocalService(_groupLocalService);
		empResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<EmpResource>
		_empResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}