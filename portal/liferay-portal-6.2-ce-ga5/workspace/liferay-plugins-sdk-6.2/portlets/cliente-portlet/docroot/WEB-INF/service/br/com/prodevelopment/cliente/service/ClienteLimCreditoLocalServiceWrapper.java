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

package br.com.prodevelopment.cliente.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ClienteLimCreditoLocalService}.
 *
 * @author marcelo
 * @see ClienteLimCreditoLocalService
 * @generated
 */
public class ClienteLimCreditoLocalServiceWrapper
	implements ClienteLimCreditoLocalService,
		ServiceWrapper<ClienteLimCreditoLocalService> {
	public ClienteLimCreditoLocalServiceWrapper(
		ClienteLimCreditoLocalService clienteLimCreditoLocalService) {
		_clienteLimCreditoLocalService = clienteLimCreditoLocalService;
	}

	/**
	* Adds the cliente lim credito to the database. Also notifies the appropriate model listeners.
	*
	* @param clienteLimCredito the cliente lim credito
	* @return the cliente lim credito that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito addClienteLimCredito(
		br.com.prodevelopment.cliente.model.ClienteLimCredito clienteLimCredito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.addClienteLimCredito(clienteLimCredito);
	}

	/**
	* Creates a new cliente lim credito with the primary key. Does not add the cliente lim credito to the database.
	*
	* @param clienteLimCreditoId the primary key for the new cliente lim credito
	* @return the new cliente lim credito
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito createClienteLimCredito(
		long clienteLimCreditoId) {
		return _clienteLimCreditoLocalService.createClienteLimCredito(clienteLimCreditoId);
	}

	/**
	* Deletes the cliente lim credito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteLimCreditoId the primary key of the cliente lim credito
	* @return the cliente lim credito that was removed
	* @throws PortalException if a cliente lim credito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito deleteClienteLimCredito(
		long clienteLimCreditoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.deleteClienteLimCredito(clienteLimCreditoId);
	}

	/**
	* Deletes the cliente lim credito from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteLimCredito the cliente lim credito
	* @return the cliente lim credito that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito deleteClienteLimCredito(
		br.com.prodevelopment.cliente.model.ClienteLimCredito clienteLimCredito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.deleteClienteLimCredito(clienteLimCredito);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clienteLimCreditoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.prodevelopment.cliente.model.impl.ClienteLimCreditoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.prodevelopment.cliente.model.impl.ClienteLimCreditoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito fetchClienteLimCredito(
		long clienteLimCreditoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.fetchClienteLimCredito(clienteLimCreditoId);
	}

	/**
	* Returns the cliente lim credito with the primary key.
	*
	* @param clienteLimCreditoId the primary key of the cliente lim credito
	* @return the cliente lim credito
	* @throws PortalException if a cliente lim credito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito getClienteLimCredito(
		long clienteLimCreditoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.getClienteLimCredito(clienteLimCreditoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cliente lim creditos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.prodevelopment.cliente.model.impl.ClienteLimCreditoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cliente lim creditos
	* @param end the upper bound of the range of cliente lim creditos (not inclusive)
	* @return the range of cliente lim creditos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<br.com.prodevelopment.cliente.model.ClienteLimCredito> getClienteLimCreditos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.getClienteLimCreditos(start, end);
	}

	/**
	* Returns the number of cliente lim creditos.
	*
	* @return the number of cliente lim creditos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getClienteLimCreditosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.getClienteLimCreditosCount();
	}

	/**
	* Updates the cliente lim credito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clienteLimCredito the cliente lim credito
	* @return the cliente lim credito that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito updateClienteLimCredito(
		br.com.prodevelopment.cliente.model.ClienteLimCredito clienteLimCredito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.updateClienteLimCredito(clienteLimCredito);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _clienteLimCreditoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_clienteLimCreditoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _clienteLimCreditoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito addClienteLimCredito(
		long clienteId, double valorLimiteMaximoCredito,
		java.lang.String dataLimiteMaximoCredito,
		double valorLimiteMaximoCheque, int qtdeLimiteMaximoCheque)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.addClienteLimCredito(clienteId,
			valorLimiteMaximoCredito, dataLimiteMaximoCredito,
			valorLimiteMaximoCheque, qtdeLimiteMaximoCheque);
	}

	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito update(
		long clienteLimCreditoId, double valorLimiteMaximoCredito,
		java.lang.String dataLimiteMaximoCredito,
		double valorLimiteMaximoCheque, int qtdeLimiteMaximoCheque)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.update(clienteLimCreditoId,
			valorLimiteMaximoCredito, dataLimiteMaximoCredito,
			valorLimiteMaximoCheque, qtdeLimiteMaximoCheque);
	}

	@Override
	public br.com.prodevelopment.cliente.model.ClienteLimCredito fetchByClienteLimCredito(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.fetchByClienteLimCredito(clienteId);
	}

	@Override
	public br.com.prodevelopment.cliente.model.Cliente fetchByCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clienteLimCreditoLocalService.fetchByCliente(clienteId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ClienteLimCreditoLocalService getWrappedClienteLimCreditoLocalService() {
		return _clienteLimCreditoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedClienteLimCreditoLocalService(
		ClienteLimCreditoLocalService clienteLimCreditoLocalService) {
		_clienteLimCreditoLocalService = clienteLimCreditoLocalService;
	}

	@Override
	public ClienteLimCreditoLocalService getWrappedService() {
		return _clienteLimCreditoLocalService;
	}

	@Override
	public void setWrappedService(
		ClienteLimCreditoLocalService clienteLimCreditoLocalService) {
		_clienteLimCreditoLocalService = clienteLimCreditoLocalService;
	}

	private ClienteLimCreditoLocalService _clienteLimCreditoLocalService;
}