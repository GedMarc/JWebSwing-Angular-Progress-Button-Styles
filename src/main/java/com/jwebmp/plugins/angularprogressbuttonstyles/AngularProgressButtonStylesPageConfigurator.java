/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularprogressbuttonstyles;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Progress Button Styles",
		pluginDescription = "A set of flat and 3D progress button styles where the button itself serves as a progress indicator. 3D styles are used for showing the progress indication on one side of the button while rotating the button in perspective.",
		pluginUniqueName = "jwebswing-angular-animate",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,animations, ui,web ui, framework",
		pluginSubtitle = "hese animation hooks are set in place to trigger animations during the life cycle of various directives ",
		pluginSourceUrl = "https://github.com/akveo/angular-progress-button-styles",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Progress-Button-Styles/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Progress-Button-Styles",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://lugovsky.github.io/angular-progress-button-styles/example.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularProgressButtonStyles.jar/download")
public class AngularProgressButtonStylesPageConfigurator
		implements IPageConfigurator
{
	/*
	 * Constructs a new AngularProgressButtonStylesPageConfigurator
	 */
	public AngularProgressButtonStylesPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularProgressButtonStylesReferencePool.AngularProgressButtonStyles.getJavaScriptReference());
		}
		return page;
	}
}
