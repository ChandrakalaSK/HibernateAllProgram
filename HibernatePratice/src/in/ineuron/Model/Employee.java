package in.ineuron.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPTAB")
public class Employee {
	@Id
	@Column(name = "id")
	private Integer eid;
	@Column(name = "name",length = 20)
	private String ename;
	@Column(name="age")
	private Integer eage;
	@Column(name="addr",length = 20)
	private String eaddr;
	
	public Employee() {
		System.out.println("Employee constuctor uses hibernate");
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

}
