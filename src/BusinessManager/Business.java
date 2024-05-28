package BusinessManager;

import java.util.List;

public class Business {

    private int id;
    private String businessName;
    private String businessSector;
    private String legalEntity;
    private List<Customer> customers;

    public Business() {

    }

    public Business(int id, String businessName, String businessSector, String legalEntity, List<Customer> customers) {
        this.id = id;
        this.businessName = businessName;
        this.businessSector = businessSector;
        this.legalEntity = legalEntity;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public void setBusinessSector(String businessSector) {
        this.businessSector = businessSector;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", businessSector='" + businessSector + '\'' +
                ", legalEntity='" + legalEntity + '\'' +
                ", customers=" + customers +
                '}';
    }
}