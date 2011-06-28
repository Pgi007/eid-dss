/*
 * eID Identity Provider Project.
 * Copyright (C) 2010 FedICT.
 * Copyright (C) 2010 Frank Cornelis.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.fedict.eid.dss.admin.portal.control;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface XmlStyleSheet {

	/*
	 * Lifecycle.
	 */
	void destroy();

	/*
	 * Actions.
	 */
	String add();

	void delete();

	/*
	 * Accessors.
	 */
	InputStream getUploadedFile();

	void setUploadedFile(InputStream uploadedFile);

	String getRevision();

	void setRevision(String revision);
	
	String getNamespace();
	
	void setNamespace(String namespace);

	/*
	 * Factories.
	 */
	void initList();
}
