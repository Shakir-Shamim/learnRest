package com.liferay.training.client.serdes.v1_0;

import com.liferay.training.client.dto.v1_0.Emp;
import com.liferay.training.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class EmpSerDes {

	public static Emp toDTO(String json) {
		EmpJSONParser empJSONParser = new EmpJSONParser();

		return empJSONParser.parseToDTO(json);
	}

	public static Emp[] toDTOs(String json) {
		EmpJSONParser empJSONParser = new EmpJSONParser();

		return empJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Emp emp) {
		if (emp == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (emp.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(emp.getDescription()));

			sb.append("\"");
		}

		if (emp.getEmployeeId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"employeeId\": ");

			sb.append("\"");

			sb.append(_escape(emp.getEmployeeId()));

			sb.append("\"");
		}

		if (emp.getMappingId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mappingId\": ");

			sb.append("\"");

			sb.append(_escape(emp.getMappingId()));

			sb.append("\"");
		}

		if (emp.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(emp.getName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EmpJSONParser empJSONParser = new EmpJSONParser();

		return empJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Emp emp) {
		if (emp == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (emp.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(emp.getDescription()));
		}

		if (emp.getEmployeeId() == null) {
			map.put("employeeId", null);
		}
		else {
			map.put("employeeId", String.valueOf(emp.getEmployeeId()));
		}

		if (emp.getMappingId() == null) {
			map.put("mappingId", null);
		}
		else {
			map.put("mappingId", String.valueOf(emp.getMappingId()));
		}

		if (emp.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(emp.getName()));
		}

		return map;
	}

	public static class EmpJSONParser extends BaseJSONParser<Emp> {

		@Override
		protected Emp createDTO() {
			return new Emp();
		}

		@Override
		protected Emp[] createDTOArray(int size) {
			return new Emp[size];
		}

		@Override
		protected void setField(
			Emp emp, String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					emp.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "employeeId")) {
				if (jsonParserFieldValue != null) {
					emp.setEmployeeId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "mappingId")) {
				if (jsonParserFieldValue != null) {
					emp.setMappingId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					emp.setName((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}