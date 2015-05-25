/**
 *
 */
package com.domain.documents.spring.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.domain.documents.java.model.Type;

/**
 * @author Rantidev Singh
 *
 */
public class TypeRowMapper implements RowMapper<Type>{

	@Override
	public Type mapRow(ResultSet rs, int rowNum) throws SQLException {
		Type type = new Type(rs.getString("typeId"),
				rs.getString("name"),
				rs.getString("description"),
				rs.getString("extension"));
		return type;
	}

}
