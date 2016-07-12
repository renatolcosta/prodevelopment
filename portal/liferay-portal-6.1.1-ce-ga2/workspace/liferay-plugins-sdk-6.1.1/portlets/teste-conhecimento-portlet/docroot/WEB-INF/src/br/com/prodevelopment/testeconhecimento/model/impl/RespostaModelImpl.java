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

package br.com.prodevelopment.testeconhecimento.model.impl;

import br.com.prodevelopment.testeconhecimento.model.Resposta;
import br.com.prodevelopment.testeconhecimento.model.RespostaModel;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * The base model implementation for the Resposta service. Represents a row in the &quot;TC_Resposta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link br.com.prodevelopment.testeconhecimento.model.RespostaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RespostaImpl}.
 * </p>
 *
 * @author Marcelo Melo
 * @see RespostaImpl
 * @see br.com.prodevelopment.testeconhecimento.model.Resposta
 * @see br.com.prodevelopment.testeconhecimento.model.RespostaModel
 * @generated
 */
public class RespostaModelImpl extends BaseModelImpl<Resposta>
	implements RespostaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a resposta model instance should use the {@link br.com.prodevelopment.testeconhecimento.model.Resposta} interface instead.
	 */
	public static final String TABLE_NAME = "TC_Resposta";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "descricao", Types.VARCHAR },
			{ "correta", Types.BOOLEAN },
			{ "dataInclusao", Types.TIMESTAMP },
			{ "dataAlteracao", Types.TIMESTAMP },
			{ "perguntaId", Types.BIGINT },
			{ "userIdInclusao", Types.BIGINT },
			{ "userIdAlteracao", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table TC_Resposta (id_ LONG not null primary key,descricao STRING null,correta BOOLEAN,dataInclusao DATE null,dataAlteracao DATE null,perguntaId LONG,userIdInclusao LONG,userIdAlteracao LONG)";
	public static final String TABLE_SQL_DROP = "drop table TC_Resposta";
	public static final String ORDER_BY_JPQL = " ORDER BY resposta.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TC_Resposta.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.br.com.prodevelopment.testeconhecimento.model.Resposta"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.br.com.prodevelopment.testeconhecimento.model.Resposta"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.br.com.prodevelopment.testeconhecimento.model.Resposta"),
			true);
	public static long PERGUNTAID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.br.com.prodevelopment.testeconhecimento.model.Resposta"));

	public RespostaModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Resposta.class;
	}

	public String getModelClassName() {
		return Resposta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("descricao", getDescricao());
		attributes.put("correta", getCorreta());
		attributes.put("dataInclusao", getDataInclusao());
		attributes.put("dataAlteracao", getDataAlteracao());
		attributes.put("perguntaId", getPerguntaId());
		attributes.put("userIdInclusao", getUserIdInclusao());
		attributes.put("userIdAlteracao", getUserIdAlteracao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}

		Boolean correta = (Boolean)attributes.get("correta");

		if (correta != null) {
			setCorreta(correta);
		}

		Date dataInclusao = (Date)attributes.get("dataInclusao");

		if (dataInclusao != null) {
			setDataInclusao(dataInclusao);
		}

		Date dataAlteracao = (Date)attributes.get("dataAlteracao");

		if (dataAlteracao != null) {
			setDataAlteracao(dataAlteracao);
		}

		Long perguntaId = (Long)attributes.get("perguntaId");

		if (perguntaId != null) {
			setPerguntaId(perguntaId);
		}

		Long userIdInclusao = (Long)attributes.get("userIdInclusao");

		if (userIdInclusao != null) {
			setUserIdInclusao(userIdInclusao);
		}

		Long userIdAlteracao = (Long)attributes.get("userIdAlteracao");

		if (userIdAlteracao != null) {
			setUserIdAlteracao(userIdAlteracao);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	public String getDescricao() {
		if (_descricao == null) {
			return StringPool.BLANK;
		}
		else {
			return _descricao;
		}
	}

	public String getDescricao(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescricao(languageId);
	}

	public String getDescricao(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescricao(languageId, useDefault);
	}

	public String getDescricao(String languageId) {
		return LocalizationUtil.getLocalization(getDescricao(), languageId);
	}

	public String getDescricao(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getDescricao(), languageId,
			useDefault);
	}

	public String getDescricaoCurrentLanguageId() {
		return _descricaoCurrentLanguageId;
	}

	@JSON
	public String getDescricaoCurrentValue() {
		Locale locale = getLocale(_descricaoCurrentLanguageId);

		return getDescricao(locale);
	}

	public Map<Locale, String> getDescricaoMap() {
		return LocalizationUtil.getLocalizationMap(getDescricao());
	}

	public void setDescricao(String descricao) {
		_descricao = descricao;
	}

	public void setDescricao(String descricao, Locale locale) {
		setDescricao(descricao, locale, LocaleUtil.getDefault());
	}

	public void setDescricao(String descricao, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(descricao)) {
			setDescricao(LocalizationUtil.updateLocalization(getDescricao(),
					"Descricao", descricao, languageId, defaultLanguageId));
		}
		else {
			setDescricao(LocalizationUtil.removeLocalization(getDescricao(),
					"Descricao", languageId));
		}
	}

	public void setDescricaoCurrentLanguageId(String languageId) {
		_descricaoCurrentLanguageId = languageId;
	}

	public void setDescricaoMap(Map<Locale, String> descricaoMap) {
		setDescricaoMap(descricaoMap, LocaleUtil.getDefault());
	}

	public void setDescricaoMap(Map<Locale, String> descricaoMap,
		Locale defaultLocale) {
		if (descricaoMap == null) {
			return;
		}

		Locale[] locales = LanguageUtil.getAvailableLocales();

		for (Locale locale : locales) {
			String descricao = descricaoMap.get(locale);

			setDescricao(descricao, locale, defaultLocale);
		}
	}

	public boolean getCorreta() {
		return _correta;
	}

	public boolean isCorreta() {
		return _correta;
	}

	public void setCorreta(boolean correta) {
		_correta = correta;
	}

	public Date getDataInclusao() {
		return _dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		_dataInclusao = dataInclusao;
	}

	public Date getDataAlteracao() {
		return _dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		_dataAlteracao = dataAlteracao;
	}

	public long getPerguntaId() {
		return _perguntaId;
	}

	public void setPerguntaId(long perguntaId) {
		_columnBitmask |= PERGUNTAID_COLUMN_BITMASK;

		if (!_setOriginalPerguntaId) {
			_setOriginalPerguntaId = true;

			_originalPerguntaId = _perguntaId;
		}

		_perguntaId = perguntaId;
	}

	public long getOriginalPerguntaId() {
		return _originalPerguntaId;
	}

	public long getUserIdInclusao() {
		return _userIdInclusao;
	}

	public void setUserIdInclusao(long userIdInclusao) {
		_userIdInclusao = userIdInclusao;
	}

	public long getUserIdAlteracao() {
		return _userIdAlteracao;
	}

	public void setUserIdAlteracao(long userIdAlteracao) {
		_userIdAlteracao = userIdAlteracao;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Resposta.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		setDescricao(getDescricao(defaultImportLocale), defaultImportLocale,
			defaultImportLocale);
	}

	@Override
	public Resposta toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Resposta)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		RespostaImpl respostaImpl = new RespostaImpl();

		respostaImpl.setId(getId());
		respostaImpl.setDescricao(getDescricao());
		respostaImpl.setCorreta(getCorreta());
		respostaImpl.setDataInclusao(getDataInclusao());
		respostaImpl.setDataAlteracao(getDataAlteracao());
		respostaImpl.setPerguntaId(getPerguntaId());
		respostaImpl.setUserIdInclusao(getUserIdInclusao());
		respostaImpl.setUserIdAlteracao(getUserIdAlteracao());

		respostaImpl.resetOriginalValues();

		return respostaImpl;
	}

	public int compareTo(Resposta resposta) {
		int value = 0;

		if (getId() < resposta.getId()) {
			value = -1;
		}
		else if (getId() > resposta.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Resposta resposta = null;

		try {
			resposta = (Resposta)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = resposta.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		RespostaModelImpl respostaModelImpl = this;

		respostaModelImpl._originalPerguntaId = respostaModelImpl._perguntaId;

		respostaModelImpl._setOriginalPerguntaId = false;

		respostaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Resposta> toCacheModel() {
		RespostaCacheModel respostaCacheModel = new RespostaCacheModel();

		respostaCacheModel.id = getId();

		respostaCacheModel.descricao = getDescricao();

		String descricao = respostaCacheModel.descricao;

		if ((descricao != null) && (descricao.length() == 0)) {
			respostaCacheModel.descricao = null;
		}

		respostaCacheModel.correta = getCorreta();

		Date dataInclusao = getDataInclusao();

		if (dataInclusao != null) {
			respostaCacheModel.dataInclusao = dataInclusao.getTime();
		}
		else {
			respostaCacheModel.dataInclusao = Long.MIN_VALUE;
		}

		Date dataAlteracao = getDataAlteracao();

		if (dataAlteracao != null) {
			respostaCacheModel.dataAlteracao = dataAlteracao.getTime();
		}
		else {
			respostaCacheModel.dataAlteracao = Long.MIN_VALUE;
		}

		respostaCacheModel.perguntaId = getPerguntaId();

		respostaCacheModel.userIdInclusao = getUserIdInclusao();

		respostaCacheModel.userIdAlteracao = getUserIdAlteracao();

		return respostaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", descricao=");
		sb.append(getDescricao());
		sb.append(", correta=");
		sb.append(getCorreta());
		sb.append(", dataInclusao=");
		sb.append(getDataInclusao());
		sb.append(", dataAlteracao=");
		sb.append(getDataAlteracao());
		sb.append(", perguntaId=");
		sb.append(getPerguntaId());
		sb.append(", userIdInclusao=");
		sb.append(getUserIdInclusao());
		sb.append(", userIdAlteracao=");
		sb.append(getUserIdAlteracao());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("br.com.prodevelopment.testeconhecimento.model.Resposta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descricao</column-name><column-value><![CDATA[");
		sb.append(getDescricao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correta</column-name><column-value><![CDATA[");
		sb.append(getCorreta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataInclusao</column-name><column-value><![CDATA[");
		sb.append(getDataInclusao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataAlteracao</column-name><column-value><![CDATA[");
		sb.append(getDataAlteracao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>perguntaId</column-name><column-value><![CDATA[");
		sb.append(getPerguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userIdInclusao</column-name><column-value><![CDATA[");
		sb.append(getUserIdInclusao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userIdAlteracao</column-name><column-value><![CDATA[");
		sb.append(getUserIdAlteracao());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Resposta.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Resposta.class
		};
	private long _id;
	private String _descricao;
	private String _descricaoCurrentLanguageId;
	private boolean _correta;
	private Date _dataInclusao;
	private Date _dataAlteracao;
	private long _perguntaId;
	private long _originalPerguntaId;
	private boolean _setOriginalPerguntaId;
	private long _userIdInclusao;
	private long _userIdAlteracao;
	private long _columnBitmask;
	private Resposta _escapedModelProxy;
}