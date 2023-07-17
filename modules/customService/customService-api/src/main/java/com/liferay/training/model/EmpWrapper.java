/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Emp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Emp
 * @generated
 */
public class EmpWrapper
	extends BaseModelWrapper<Emp> implements Emp, ModelWrapper<Emp> {

	public EmpWrapper(Emp emp) {
		super(emp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("mappingId", getMappingId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String employeeId = (String)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String mappingId = (String)attributes.get("mappingId");

		if (mappingId != null) {
			setMappingId(mappingId);
		}
	}

	/**
	 * Returns the description of this emp.
	 *
	 * @return the description of this emp
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the employee ID of this emp.
	 *
	 * @return the employee ID of this emp
	 */
	@Override
	public String getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the mapping ID of this emp.
	 *
	 * @return the mapping ID of this emp
	 */
	@Override
	public String getMappingId() {
		return model.getMappingId();
	}

	/**
	 * Returns the name of this emp.
	 *
	 * @return the name of this emp
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this emp.
	 *
	 * @return the primary key of this emp
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this emp.
	 *
	 * @return the uuid of this emp
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the description of this emp.
	 *
	 * @param description the description of this emp
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the employee ID of this emp.
	 *
	 * @param employeeId the employee ID of this emp
	 */
	@Override
	public void setEmployeeId(String employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the mapping ID of this emp.
	 *
	 * @param mappingId the mapping ID of this emp
	 */
	@Override
	public void setMappingId(String mappingId) {
		model.setMappingId(mappingId);
	}

	/**
	 * Sets the name of this emp.
	 *
	 * @param name the name of this emp
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this emp.
	 *
	 * @param primaryKey the primary key of this emp
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this emp.
	 *
	 * @param uuid the uuid of this emp
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected EmpWrapper wrap(Emp emp) {
		return new EmpWrapper(emp);
	}

}