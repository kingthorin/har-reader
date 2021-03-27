package de.sstoehr.harreader.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

public class HarTest extends AbstractMapperTest<Har>{

    @Test
    public void testLogNull() {
        Har har = new Har();
        har.setLog(null);
        Assert.assertNotNull(har.getLog());
    }

    @Override
    public void testMapping() {
        Har har = map("{\"log\": {}}", Har.class);
        Assert.assertNotNull(har.getLog());

        har = map(UNKNOWN_PROPERTY, Har.class);
        Assert.assertNotNull(har);
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.simple().forClass(Har.class).verify();
    }

}
