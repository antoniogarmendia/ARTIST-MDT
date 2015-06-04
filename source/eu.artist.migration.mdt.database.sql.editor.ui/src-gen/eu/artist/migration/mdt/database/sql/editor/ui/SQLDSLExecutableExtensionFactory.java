/*
 * generated by Xtext
 */
package eu.artist.migration.mdt.database.sql.editor.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.artist.migration.mdt.database.sql.editor.ui.internal.SQLDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SQLDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SQLDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SQLDSLActivator.getInstance().getInjector(SQLDSLActivator.EU_ARTIST_MIGRATION_MDT_DATABASE_SQL_EDITOR_SQLDSL);
	}
	
}