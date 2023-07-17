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

package com.liferay.training.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.model.Emp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Emp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmpCacheModel implements CacheModel<Emp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmpCacheModel)) {
			return false;
		}

		EmpCacheModel empCacheModel = (EmpCacheModel)object;

		if (employeeId.equals(empCacheModel.employeeId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", mappingId=");
		sb.append(mappingId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Emp toEntityModel() {
		EmpImpl empImpl = new EmpImpl();

		if (uuid == null) {
			empImpl.setUuid("");
		}
		else {
			empImpl.setUuid(uuid);
		}

		if (employeeId == null) {
			empImpl.setEmployeeId("");
		}
		else {
			empImpl.setEmployeeId(employeeId);
		}

		if (name == null) {
			empImpl.setName("");
		}
		else {
			empImpl.setName(name);
		}

		if (description == null) {
			empImpl.setDescription("");
		}
		else {
			empImpl.setDescription(description);
		}

		if (mappingId == null) {
			empImpl.setMappingId("");
		}
		else {
			empImpl.setMappingId(mappingId);
		}

		empImpl.resetOriginalValues();

		return empImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		employeeId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		mappingId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (employeeId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employeeId);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (mappingId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mappingId);
		}
	}

	public String uuid;
	public String employeeId;
	public String name;
	public String description;
	public String mappingId;

}