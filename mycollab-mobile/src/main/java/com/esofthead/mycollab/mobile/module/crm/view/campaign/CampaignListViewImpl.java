/**
 * This file is part of mycollab-mobile.
 *
 * mycollab-mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.mobile.module.crm.view.campaign;

import com.esofthead.mycollab.eventmanager.EventBus;
import com.esofthead.mycollab.mobile.module.crm.events.CampaignEvent;
import com.esofthead.mycollab.mobile.ui.AbstractListViewComp;
import com.esofthead.mycollab.mobile.ui.AbstractPagedBeanList;
import com.esofthead.mycollab.module.crm.domain.SimpleCampaign;
import com.esofthead.mycollab.module.crm.domain.criteria.CampaignSearchCriteria;
import com.esofthead.mycollab.vaadin.mvp.ViewComponent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

/**
 * 
 * @author MyCollab Ltd.
 * @since 4.0
 * 
 */

@ViewComponent
public class CampaignListViewImpl extends
		AbstractListViewComp<CampaignSearchCriteria, SimpleCampaign> implements
		CampaignListView {
	private static final long serialVersionUID = -8743010493576179868L;

	public CampaignListViewImpl() {
		super();

		setCaption("Campaigns");
		setToggleButton(true);
	}

	@Override
	protected AbstractPagedBeanList<CampaignSearchCriteria, SimpleCampaign> createBeanTable() {
		return new CampaignListDisplay("campaignname");
	}

	@Override
	protected Component createRightComponent() {
		Button addCampaign = new Button(null, new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent arg0) {
				EventBus.getInstance().fireEvent(
						new CampaignEvent.GotoAdd(this, null));
			}
		});
		addCampaign.setStyleName("add-btn");
		return addCampaign;
	}

}