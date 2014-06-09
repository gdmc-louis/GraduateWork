package action;

import java.util.Date;
import java.util.List;

import model.Ozq.OutpDoctorRegist;
import bo.OzqBo;

public class OzqAction{

	private OzqBo OzqBo;
	private List<OutpDoctorRegist> OutpDoctorRegist;
	private Date start_time;
	private Date end_time;
	private String clinic_dept;
	private String doctor_no;

	public OzqBo getOzqBo() {
		return OzqBo;
	}
	public void setOzqBo(OzqBo OzqBo) {
		this.OzqBo = OzqBo;
	}
	
	public List<OutpDoctorRegist> getOutpDoctorRegist() {
		return OutpDoctorRegist;
	}
	public void setOutpDoctorRegist(List<OutpDoctorRegist> outpDoctorRegist) {
		OutpDoctorRegist = outpDoctorRegist;
	}
	
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	
	public String getClinic_dept() {
		return clinic_dept;
	}
	public void setClinic_dept(String clinic_dept) {
		this.clinic_dept = clinic_dept;
	}
	
	public String getDoctor_no() {
		return doctor_no;
	}
	public void setDoctor_no(String doctor_no) {
		this.doctor_no = doctor_no;
	}
	
	//���Ű�
	public String CheckOnDuty(){
		System.out.println("action1...");
		String str1 = "2014/01/23";
		String str2 = "2014/01/25";
		OutpDoctorRegist = OzqBo.CheckOnDuty(str1, str2, "0101", "1106");
		System.out.println("action2...");
		
		//OutpDoctorRegist = OzqBo.CheckOnDuty(start_time, end_time, clinic_dept, doctor_no);
		return "success";
	}
	
	public static void main(String[] args) {
		OzqAction test = new OzqAction();
		test.CheckOnDuty();
	}
}