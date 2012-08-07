package demo.spring.dbutils.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DBCPDaoSupport extends JdbcDaoSupport {

	public Object executeQuery(String sql, Object[] filterKeys,
			ResultSetHandler<?> resultSetHandler) throws SQLException {

		filterKeys = filterKeys == null ? new Object[] {} : filterKeys;
		QueryRunner queryRunner = new QueryRunner(getDataSource());
		return queryRunner.query(sql, resultSetHandler, filterKeys);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> findListOfMaps(String sql, Object[] filterKeys) throws SQLException {
		return (List<Map<String, Object>>) executeQuery(sql, filterKeys, new MapListHandler());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<?> findListOfBeans(String sql, Object[] filterKeys, Class<?> beanClass) throws SQLException {
		return (List<?>) executeQuery(sql, filterKeys, new BeanListHandler(beanClass));
	}

}
