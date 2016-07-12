/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package br.com.prodevelopment.municipio.service.base;

import br.com.prodevelopment.municipio.model.Municipio;
import br.com.prodevelopment.municipio.service.MunicipioService;
import br.com.prodevelopment.municipio.service.persistence.MunicipioPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the municipio remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.prodevelopment.municipio.service.impl.MunicipioServiceImpl}.
 * </p>
 *
 * @author marcelo
 * @see br.com.prodevelopment.municipio.service.impl.MunicipioServiceImpl
 * @see br.com.prodevelopment.municipio.service.MunicipioServiceUtil
 * @generated
 */
public abstract class MunicipioServiceBaseImpl extends BaseServiceImpl
	implements MunicipioService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link br.com.prodevelopment.municipio.service.MunicipioServiceUtil} to access the municipio remote service.
	 */

	/**
	 * Returns the municipio local service.
	 *
	 * @return the municipio local service
	 */
	public br.com.prodevelopment.municipio.service.MunicipioLocalService getMunicipioLocalService() {
		return municipioLocalService;
	}

	/**
	 * Sets the municipio local service.
	 *
	 * @param municipioLocalService the municipio local service
	 */
	public void setMunicipioLocalService(
		br.com.prodevelopment.municipio.service.MunicipioLocalService municipioLocalService) {
		this.municipioLocalService = municipioLocalService;
	}

	/**
	 * Returns the municipio remote service.
	 *
	 * @return the municipio remote service
	 */
	public br.com.prodevelopment.municipio.service.MunicipioService getMunicipioService() {
		return municipioService;
	}

	/**
	 * Sets the municipio remote service.
	 *
	 * @param municipioService the municipio remote service
	 */
	public void setMunicipioService(
		br.com.prodevelopment.municipio.service.MunicipioService municipioService) {
		this.municipioService = municipioService;
	}

	/**
	 * Returns the municipio persistence.
	 *
	 * @return the municipio persistence
	 */
	public MunicipioPersistence getMunicipioPersistence() {
		return municipioPersistence;
	}

	/**
	 * Sets the municipio persistence.
	 *
	 * @param municipioPersistence the municipio persistence
	 */
	public void setMunicipioPersistence(
		MunicipioPersistence municipioPersistence) {
		this.municipioPersistence = municipioPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Municipio.class;
	}

	protected String getModelClassName() {
		return Municipio.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = municipioPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = br.com.prodevelopment.municipio.service.MunicipioLocalService.class)
	protected br.com.prodevelopment.municipio.service.MunicipioLocalService municipioLocalService;
	@BeanReference(type = br.com.prodevelopment.municipio.service.MunicipioService.class)
	protected br.com.prodevelopment.municipio.service.MunicipioService municipioService;
	@BeanReference(type = MunicipioPersistence.class)
	protected MunicipioPersistence municipioPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MunicipioServiceClpInvoker _clpInvoker = new MunicipioServiceClpInvoker();
}