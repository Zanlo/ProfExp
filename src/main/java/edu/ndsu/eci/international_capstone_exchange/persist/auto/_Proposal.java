package edu.ndsu.eci.international_capstone_exchange.persist.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import edu.ndsu.eci.international_capstone_exchange.persist.Institution;
import edu.ndsu.eci.international_capstone_exchange.persist.Pairing;
import edu.ndsu.eci.international_capstone_exchange.persist.PairingCompany;
import edu.ndsu.eci.international_capstone_exchange.persist.ProposalType;
import edu.ndsu.eci.international_capstone_exchange.persist.Subject;
import edu.ndsu.eci.international_capstone_exchange.persist.User;
import edu.ndsu.eci.international_capstone_exchange.util.ProposalStatus;

/**
 * Class _Proposal was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Proposal extends CayenneDataObject {

    public static final String COST_PROPERTY = "cost";
    public static final String CREATED_PROPERTY = "created";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String DURATION_IN_WEEKS_PROPERTY = "durationInWeeks";
    public static final String LAST_MODIFIED_PROPERTY = "lastModified";
    public static final String NAME_PROPERTY = "name";
    public static final String PER_STUDENT_WEEKLY_PROPERTY = "perStudentWeekly";
    public static final String POTENTIAL_START_PROPERTY = "potentialStart";
    public static final String PROPOSAL_STATUS_PROPERTY = "proposalStatus";
    public static final String TEAM_SIZE_PROPERTY = "teamSize";
    public static final String COMPANY_PROPERTY = "company";
    public static final String INSTITUTION_PROPERTY = "institution";
    public static final String PAIRING_PROPERTY = "pairing";
    public static final String SUBJECTS_PROPERTY = "subjects";
    public static final String TYPES_PROPERTY = "types";
    public static final String USER_PROPERTY = "user";

    public static final String PK_PK_COLUMN = "pk";

    public void setCost(Double cost) {
        writeProperty("cost", cost);
    }
    public Double getCost() {
        return (Double)readProperty("cost");
    }

    public void setCreated(Date created) {
        writeProperty("created", created);
    }
    public Date getCreated() {
        return (Date)readProperty("created");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setDurationInWeeks(Integer durationInWeeks) {
        writeProperty("durationInWeeks", durationInWeeks);
    }
    public Integer getDurationInWeeks() {
        return (Integer)readProperty("durationInWeeks");
    }

    public void setLastModified(Date lastModified) {
        writeProperty("lastModified", lastModified);
    }
    public Date getLastModified() {
        return (Date)readProperty("lastModified");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setPerStudentWeekly(Double perStudentWeekly) {
        writeProperty("perStudentWeekly", perStudentWeekly);
    }
    public Double getPerStudentWeekly() {
        return (Double)readProperty("perStudentWeekly");
    }

    public void setPotentialStart(Date potentialStart) {
        writeProperty("potentialStart", potentialStart);
    }
    public Date getPotentialStart() {
        return (Date)readProperty("potentialStart");
    }

    public void setProposalStatus(ProposalStatus proposalStatus) {
        writeProperty("proposalStatus", proposalStatus);
    }
    public ProposalStatus getProposalStatus() {
        return (ProposalStatus)readProperty("proposalStatus");
    }

    public void setTeamSize(Integer teamSize) {
        writeProperty("teamSize", teamSize);
    }
    public Integer getTeamSize() {
        return (Integer)readProperty("teamSize");
    }

    public void setCompany(PairingCompany company) {
        setToOneTarget("company", company, true);
    }

    public PairingCompany getCompany() {
        return (PairingCompany)readProperty("company");
    }


    public void setInstitution(Institution institution) {
        setToOneTarget("institution", institution, true);
    }

    public Institution getInstitution() {
        return (Institution)readProperty("institution");
    }


    public void setPairing(Pairing pairing) {
        setToOneTarget("pairing", pairing, true);
    }

    public Pairing getPairing() {
        return (Pairing)readProperty("pairing");
    }


    public void addToSubjects(Subject obj) {
        addToManyTarget("subjects", obj, true);
    }
    public void removeFromSubjects(Subject obj) {
        removeToManyTarget("subjects", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Subject> getSubjects() {
        return (List<Subject>)readProperty("subjects");
    }


    public void addToTypes(ProposalType obj) {
        addToManyTarget("types", obj, true);
    }
    public void removeFromTypes(ProposalType obj) {
        removeToManyTarget("types", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ProposalType> getTypes() {
        return (List<ProposalType>)readProperty("types");
    }


    public void setUser(User user) {
        setToOneTarget("user", user, true);
    }

    public User getUser() {
        return (User)readProperty("user");
    }


}
