/*******************************************************************************
 * Copyright (c) 2014 GoPivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     GoPivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.wizard.gettingstarted.boot;

import org.springsource.ide.eclipse.commons.livexp.ui.Ilabelable;


/**
 * Contains information about a radio button (typically parsed from an html form element).
 */
public class RadioInfo implements Ilabelable {

	private final boolean isCheckedInitially;
	private final String value;
	private final String groupName;
	private String label;

	public RadioInfo(String groupName, String value, boolean checked) {
		this.groupName = groupName;
		this.value = value;
		this.label = value; //Default label
		this.isCheckedInitially = checked;
	}

	public boolean isCheckedInitially() {
		return isCheckedInitially;
	}

	@Override
	public String toString() {
		return "Radio(" + groupName+", "+value+")";
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getLabel() {
		return label;
	}

}
