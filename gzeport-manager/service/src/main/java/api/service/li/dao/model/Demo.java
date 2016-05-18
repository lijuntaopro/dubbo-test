package api.service.li.dao.model;

import java.io.Serializable;

public class Demo implements Serializable {
    private Long id;

    private String entname;

    private String orgcode;

    private String regnum;

    private String regaddress;

    private String customregcode;

    private String regcustom;

    private String inspectionregcode;

    private String reginspection;

    private static final long serialVersionUID = 1L;

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
        this.entname = entname == null ? null : entname.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum == null ? null : regnum.trim();
    }

    public String getRegaddress() {
        return regaddress;
    }

    public void setRegaddress(String regaddress) {
        this.regaddress = regaddress == null ? null : regaddress.trim();
    }

    public String getCustomregcode() {
        return customregcode;
    }

    public void setCustomregcode(String customregcode) {
        this.customregcode = customregcode == null ? null : customregcode.trim();
    }

    public String getRegcustom() {
        return regcustom;
    }

    public void setRegcustom(String regcustom) {
        this.regcustom = regcustom == null ? null : regcustom.trim();
    }

    public String getInspectionregcode() {
        return inspectionregcode;
    }

    public void setInspectionregcode(String inspectionregcode) {
        this.inspectionregcode = inspectionregcode == null ? null : inspectionregcode.trim();
    }

    public String getReginspection() {
        return reginspection;
    }

    public void setReginspection(String reginspection) {
        this.reginspection = reginspection == null ? null : reginspection.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", entname=").append(entname);
        sb.append(", orgcode=").append(orgcode);
        sb.append(", regnum=").append(regnum);
        sb.append(", regaddress=").append(regaddress);
        sb.append(", customregcode=").append(customregcode);
        sb.append(", regcustom=").append(regcustom);
        sb.append(", inspectionregcode=").append(inspectionregcode);
        sb.append(", reginspection=").append(reginspection);
        sb.append("]");
        return sb.toString();
    }
}