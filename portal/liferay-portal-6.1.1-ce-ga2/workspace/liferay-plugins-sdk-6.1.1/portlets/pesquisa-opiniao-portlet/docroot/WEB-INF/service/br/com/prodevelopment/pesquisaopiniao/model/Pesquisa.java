/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package br.com.prodevelopment.pesquisaopiniao.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Pesquisa service. Represents a row in the &quot;PO_Pesquisa&quot; database table, with each column mapped to a property of this class.
 *
 * @author Marcelo Melo
 * @see PesquisaModel
 * @see br.com.prodevelopment.pesquisaopiniao.model.impl.PesquisaImpl
 * @see br.com.prodevelopment.pesquisaopiniao.model.impl.PesquisaModelImpl
 * @generated
 */
public interface Pesquisa extends PesquisaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link br.com.prodevelopment.pesquisaopiniao.model.impl.PesquisaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Pesquisa, String> UUID_ACCESSOR = new Accessor<Pesquisa, String>() {
			public String get(Pesquisa pesquisa) {
				return pesquisa.getUuid();
			}
		};
}