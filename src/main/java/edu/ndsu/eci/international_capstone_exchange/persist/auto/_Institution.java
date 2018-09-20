package edu.ndsu.eci.international_capstone_exchange.persist.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import edu.ndsu.eci.international_capstone_exchange.persist.Country;
import edu.ndsu.eci.international_capstone_exchange.persist.Proposal;
import edu.ndsu.eci.international_capstone_exchange.persist.User;
import edu.ndsu.eci.international_capstone_exchange.util.Status;

/**
 * Class _Institution was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Institution extends CayenneDataObject {

    public static final String CREATED_PROPERTY = "created";
    public static final String CURRENCY_PK_PROPERTY = "currencyPk";
    public static final String NAME_PROPERTY = "name";
    public static final String STATUS_PROPERTY = "status";
    public static final String URL_PROPERTY = "url";
    public static final String COUNTRY_PROPERTY = "country";
    public static final String PROPOSALS_PROPERTY = "proposals";
    public static final String USERS_PROPERTY = "users";

    public static final String PK_PK_COLUMN = "pk";

    public void setCreated(Date created) {
        writeProperty("created", created);
    }
    public Date getCreated() {
        return (Date)readProperty("created");
    }

    public void setCurrencyPk(Integer currencyPk) {
        writeProperty("currencyPk", currencyPk);
    }
    public Integer getCurrencyPk() {
        return (Integer)readProperty("currencyPk");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setStatus(Status status) {
        writeProperty("status", status);
    }
    public Status getStatus() {
        return (Status)readProperty("status");
    }

    public void setUrl(String url) {
        writeProperty("url", url);
    }
    public String getUrl() {
        return (String)readProperty("url");
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }


    public void addToProposals(Proposal obj) {
        addToManyTarget("proposals", obj, true);
    }
    public void removeFromProposals(Proposal obj) {
        removeToManyTarget("proposals", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Proposal> getProposals() {
        return (List<Proposal>)readProperty("proposals");
    }


    public void addToUsers(User obj) {
        addToManyTarget("users", obj, true);
    }
    public void removeFromUsers(User obj) {
        removeToManyTarget("users", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        return (List<User>)readProperty("users");
    }


}
