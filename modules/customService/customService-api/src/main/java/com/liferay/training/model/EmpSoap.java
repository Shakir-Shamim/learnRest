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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.service.http.EmpServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmpSoap implements Serializable {

	public static EmpSoap toSoapModel(Emp model) {
		EmpSoap soapModel = new EmpSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setMappingId(model.getMappingId());

		return soapModel;
	}

	public static EmpSoap[] toSoapModels(Emp[] models) {
		EmpSoap[] soapModels = new EmpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpSoap[][] toSoapModels(Emp[][] models) {
		EmpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpSoap[] toSoapModels(List<Emp> models) {
		List<EmpSoap> soapModels = new ArrayList<EmpSoap>(models.size());

		for (Emp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpSoap[soapModels.size()]);
	}

	public EmpSoap() {
	}

	public String getPrimaryKey() {
		return _employeeId;
	}

	public void setPrimaryKey(String pk) {
		setEmployeeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(String employeeId) {
		_employeeId = employeeId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getMappingId() {
		return _mappingId;
	}

	public void setMappingId(String mappingId) {
		_mappingId = mappingId;
	}

	private String _uuid;
	private String _employeeId;
	private String _name;
	private String _description;
	private String _mappingId;

}