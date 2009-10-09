/*
 * eID Digital Signature Service Project.
 * Copyright (C) 2009 FedICT.
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

package be.fedict.eid.dss;

import javax.ejb.Local;
import javax.ejb.Remove;

@Local
public interface XMLResponse {

	// accessors
	String getTarget();

	void setTarget(String target);

	String getEncodedSignatureResponse();

	void setEncodedSignatureResponse(String encodedSignatureResponse);

	String getSignatureStatus();

	void setSignatureStatus(String signatureStatus);

	void setEncodedSignatureCertificate(String encodedSignatureCertificate);

	String getEncodedSignatureCertificate();

	// lifecycle
	@Remove
	void destroy();
}
