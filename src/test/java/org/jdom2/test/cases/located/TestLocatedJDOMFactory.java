package org.jdom2.test.cases.located;

import org.jdom2.JDOMFactory;
import org.jdom2.located.LocatedJDOMFactory;
import org.jdom2.test.cases.AbstractTestJDOMFactory;

@SuppressWarnings("javadoc")
public class TestLocatedJDOMFactory extends AbstractTestJDOMFactory {
	
	/**
	 * @param located
	 */
	public TestLocatedJDOMFactory() {
		super(true);
	}

	@Override
	protected JDOMFactory buildFactory() {
		return new LocatedJDOMFactory();
	}
}
