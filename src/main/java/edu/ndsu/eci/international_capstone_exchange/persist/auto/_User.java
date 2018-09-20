package edu.ndsu.eci.international_capstone_exchange.persist.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import edu.ndsu.eci.international_capstone_exchange.persist.Institution;
import edu.ndsu.eci.international_capstone_exchange.persist.Pairing;
import edu.ndsu.eci.international_capstone_exchange.persist.PairingNotes;
import edu.ndsu.eci.international_capstone_exchange.persist.Proposal;
import edu.ndsu.eci.international_capstone_exchange.persist.Role;
import edu.ndsu.eci.international_capstone_exchange.util.Status;

/**
 * Class _User was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _User extends CayenneDataObject {

    public static final String CREATED_PROPERTY = "created";
    public static final String DEPARTMENT_NAME_PROPERTY = "departmentName";
    public static final String EMAIL_PROPERTY = "email";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String SOURCE_PROPERTY = "source";
    public static final String SSO_EMAIL_PROPERTY = "ssoEmail";
    public static final String SSO_NAME_PROPERTY = "ssoName";
    public static final String STATUS_PROPERTY = "status";
    public static final String URL_PROPERTY = "url";
    public static final String WORK_PHONE_PROPERTY = "workPhone";
    public static final String INSTITUTION_PROPERTY = "institution";
    public static final String PAIRING_NOTES_PROPERTY = "pairingNotes";
    public static final String PAIRS_MADE_PROPERTY = "pairsMade";
    public static final String PROPOSALS_PROPERTY = "proposals";
    public static final String ROLES_PROPERTY = "roles";

    public static final String PK_PK_COLUMN = "pk";

    public void setCreated(Date created) {
        writeProperty("created", created);
    }
    public Date getCreated() {
        return (Date)readProperty("created");
    }

    public void setDepartmentName(String departmentName) {
        writeProperty("departmentName", departmentName);
    }
    public String getDepartmentName() {
        return (String)readProperty("departmentName");
    }

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setId(String id) {
        writeProperty("id", id);
    }
    public String getId() {
        return (String)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setSource(String source) {
        writeProperty("source", source);
    }
    public String getSource() {
        return (String)readProperty("source");
    }

    public void setSsoEmail(String ssoEmail) {
        writeProperty("ssoEmail", ssoEmail);
    }
    public String getSsoEmail() {
        return (String)readProperty("ssoEmail");
    }

    public void setSsoName(String ssoName) {
        writeProperty("ssoName", ssoName);
    }
    public String getSsoName() {
        return (String)readProperty("ssoName");
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

    public void setWorkPhone(String workPhone) {
        writeProperty("workPhone", workPhone);
    }
    public String getWorkPhone() {
        return (String)readProperty("workPhone");
    }

    public void setInstitution(Institution institution) {
        setToOneTarget("institution", institution, true);
    }

    public Institution getInstitution() {
        return (Institution)readProperty("institution");
    }


    public void addToPairingNotes(PairingNotes obj) {
        addToManyTarget("pairingNotes", obj, true);
    }
    public void removeFromPairingNotes(PairingNotes obj) {
        removeToManyTarget("pairingNotes", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PairingNotes> getPairingNotes() {
        return (List<PairingNotes>)readProperty("pairingNotes");
    }


    public void addToPairsMade(Pairing obj) {
        addToManyTarget("pairsMade", obj, true);
    }
    public void removeFromPairsMade(Pairing obj) {
        removeToManyTarget("pairsMade", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Pairing> getPairsMade() {
        return (List<Pairing>)readProperty("pairsMade");
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


    public void addToRoles(Role obj) {
        addToManyTarget("roles", obj, true);
    }
    public void removeFromRoles(Role obj) {
        removeToManyTarget("roles", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Role> getRoles() {
        return (List<Role>)readProperty("roles");
    }


}
