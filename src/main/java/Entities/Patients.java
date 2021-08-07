package Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patients
{
    @Id
	private String pat_id;
    private String pat_name;
    private String bed_No;
    private Date arrival_Date;
    private Date depart_Date;
   
	
    
    
    
    
   
	public Date getArrival_Date() {
		return arrival_Date;
	}
	public void setArrival_Date(Date arrival_Date) {
		this.arrival_Date = arrival_Date;
	}
	public Date getDepart_Date() {
		return depart_Date;
	}
	public void setDepart_Date(Date depart_Date) {
		this.depart_Date = depart_Date;
	}
	public String getPat_id() {
		return pat_id;
	}
	public void setPat_id(String pat_id) {
		this.pat_id = pat_id;
	}
	
	  public String getPat_name() {
			return pat_name;
		}
	
	  public void setPat_name(String pat_name) {
			this.pat_name = pat_name;
		}
	
	public String getBed_No() {
		return bed_No;
	}
	public void setBed_No(String bed_No) {
		this.bed_No = bed_No;
	}
	
    
   
}
