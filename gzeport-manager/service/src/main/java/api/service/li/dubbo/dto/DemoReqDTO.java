package api.service.li.dubbo.dto;

import api.service.li.dao.model.DemoCriteria;

import com.ai.ecp.server.front.dto.BaseInfo;

public class DemoReqDTO extends BaseInfo<DemoCriteria>{

private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String entname;
	
	private String orgcode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public String toString() {
		return "DemoReqDTO [id=" + id + ", entname=" + entname + ", orgcode="
				+ orgcode + "]";
	}
	
	
}
