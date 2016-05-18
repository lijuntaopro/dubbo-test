package api.service.li.dubbo.dto;

import com.ai.ecp.server.front.dto.BaseResponseDTO;

public class DemoRespDTO extends BaseResponseDTO{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String entname;
	
	private String orgcode;
	
	private String regnum;
	
	private String regaddress;
	
	private String customregcode;
	
	private String regcustom;
	
	private String inspectionregcode;
	
	private String reginspection;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntname() {
		return entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getRegnum() {
		return regnum;
	}

	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}

	public String getRegaddress() {
		return regaddress;
	}

	public void setRegaddress(String regaddress) {
		this.regaddress = regaddress;
	}

	public String getCustomregcode() {
		return customregcode;
	}

	public void setCustomregcode(String customregcode) {
		this.customregcode = customregcode;
	}

	public String getRegcustom() {
		return regcustom;
	}

	public void setRegcustom(String regcustom) {
		this.regcustom = regcustom;
	}

	public String getInspectionregcode() {
		return inspectionregcode;
	}

	public void setInspectionregcode(String inspectionregcode) {
		this.inspectionregcode = inspectionregcode;
	}

	public String getReginspection() {
		return reginspection;
	}

	public void setReginspection(String reginspection) {
		this.reginspection = reginspection;
	}

	@Override
	public String toString() {
		return "DemoRespDTO [id=" + id + ", entname=" + entname + ", orgcode="
				+ orgcode + ", regnum=" + regnum + ", regaddress=" + regaddress
				+ ", customregcode=" + customregcode + ", regcustom="
				+ regcustom + ", inspectionregcode=" + inspectionregcode
				+ ", reginspection=" + reginspection + "]";
	}
	
	
}
