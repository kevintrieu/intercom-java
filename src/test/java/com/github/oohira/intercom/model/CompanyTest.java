package com.github.oohira.intercom.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.github.oohira.intercom.Intercom;

/**
 * Test class of {@link Company}.
 */
public class CompanyTest {

    @Test
    public void deserializeNull() {
        Intercom intercom = new Intercom();
        String json = "";
        Company company = intercom.deserialize(json, Company.class);
        assertThat(company, is(nullValue()));
    }

    @Test
    public void deserializeEmpty() {
        Intercom intercom = new Intercom();
        String json = "{}";
        Company company = intercom.deserialize(json, Company.class);
        assertThat(company.getId(), is(nullValue()));
        assertThat(company.getName(), is(nullValue()));
        assertThat(company.getCreatedAt(), is(nullValue()));
        assertThat(company.getPlanId(), is(nullValue()));
        assertThat(company.getMonthlySpend(), is(nullValue()));
        assertThat(company.getCustomAttributes(), is(nullValue()));
    }

    @Test
    public void deserialize() {
        Intercom intercom = new Intercom();
        String json = "{" +
                "'id'            : '6'," +
                "'name'          : 'Intercom'," +
                "'created_at'    : 1270000000," +
                "'plan_id'          : 'Pro'," +
                "'monthly_spend' : 12.3," +
                "'custom_attributes': {" +
                "    'email'                : 'john.doe@example.com'," +
                "    'last_plan_changed_at' : 1300000000," +
                "    'team_mates'           : 7" +
                "}" +
                "}";
        Company company = intercom.deserialize(json, Company.class);
        assertThat(company.getId(), is("6"));
        assertThat(company.getName(), is("Intercom"));
        assertThat(company.getCreatedAt(), is(new Date(1270000000L * 1000)));
        assertThat(company.getPlanId(), is("Pro"));
        assertThat(company.getMonthlySpend(), is(12.3));
        assertThat((String) company.getCustomAttributes().get("email"), is("john.doe@example.com"));
        assertThat((Double) company.getCustomAttributes().get("last_plan_changed_at"), is(1300000000.0));
        assertThat((Double) company.getCustomAttributes().get("team_mates"), is(7.0));
    }

    @Test
    public void serializeNull() {
        Intercom intercom = new Intercom();
        Company company = null;
        String json = intercom.serialize(company);
        assertThat(json, is("null"));
    }

    @Test
    public void serializeEmpty() {
        Intercom intercom = new Intercom();
        Company company = new Company();
        String json = intercom.serialize(company);
        assertThat(json, is("{}"));
    }

    @Test
    public void serialize() {
        Intercom intercom = new Intercom();
        Company company = new Company();
        company.setCompanyId("6");
        company.setName("Intercom");
        company.setRemoteCreatedAt(new Date(1270000000L * 1000));
        company.setPlanId("Pro");
        company.setMonthlySpend(12.3);
        Map<String, Object> customData = new LinkedHashMap<String, Object>();
        customData.put("email", "john.doe@example.com");
        customData.put("last_plan_changed_at", new Date(1300000000L * 1000));
        customData.put("team_mates", 7);
        customData.put("null", null);
        company.setCustomAttributes(customData);

        String json = intercom.serialize(company);
        assertThat(json, is("{" +
        		"\"remote_created_at\":1270000000," +
                "\"company_id\":\"6\"," +
                "\"name\":\"Intercom\"," +
                "\"custom_attributes\":{" +
                "\"email\":\"john.doe@example.com\"," +
                "\"last_plan_changed_at\":1300000000," +
                "\"team_mates\":7" +
                "}," +
                "\"monthly_spend\":12.3," +
                "\"plan_id\":\"Pro\"" +
                "}"));
    }
}
