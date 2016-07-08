package com.rsaseguros.persistence.model;

import org.apache.ibatis.type.Alias;

@Alias("TendcampDO")
public class TendcampDO {
	private Integer  cdtipend;
	private Integer  nmtabcam;
	private String   dscampo;	
	private String   cdtabla;	
	private String   cdcampo;	
	private Integer  cdatribu;
	private Integer  cdnivel;	
	private String   sqlcatal;
	private String   swhabili;
	
	
	public Integer getCdtipend() {
		return cdtipend;
	}
	public void setCdtipend(Integer cdtipend) {
		this.cdtipend = cdtipend;
	}
	public Integer getNmtabcam() {
		return nmtabcam;
	}
	public void setNmtabcam(Integer nmtabcam) {
		this.nmtabcam = nmtabcam;
	}
	public String getDscampo() {
		return dscampo;
	}
	public void setDscampo(String dscampo) {
		this.dscampo = dscampo;
	}
	public String getCdtabla() {
		return cdtabla;
	}
	public void setCdtabla(String cdtabla) {
		this.cdtabla = cdtabla;
	}
	public String getCdcampo() {
		return cdcampo;
	}
	public void setCdcampo(String cdcampo) {
		this.cdcampo = cdcampo;
	}
	public Integer getCdatribu() {
		return cdatribu;
	}
	public void setCdatribu(Integer cdatribu) {
		this.cdatribu = cdatribu;
	}
	public Integer getCdnivel() {
		return cdnivel;
	}
	public void setCdnivel(Integer cdnivel) {
		this.cdnivel = cdnivel;
	}
	public String getSqlcatal() {
		return sqlcatal;
	}
	public void setSqlcatal(String sqlcatal) {
		this.sqlcatal = sqlcatal;
	}
	public String getSwhabili() {
		return swhabili;
	}
	public void setSwhabili(String swhabili) {
		this.swhabili = swhabili;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdatribu == null) ? 0 : cdatribu.hashCode());
		result = prime * result + ((cdcampo == null) ? 0 : cdcampo.hashCode());
		result = prime * result + ((cdnivel == null) ? 0 : cdnivel.hashCode());
		result = prime * result + ((cdtabla == null) ? 0 : cdtabla.hashCode());
		result = prime * result + ((cdtipend == null) ? 0 : cdtipend.hashCode());
		result = prime * result + ((dscampo == null) ? 0 : dscampo.hashCode());
		result = prime * result + ((nmtabcam == null) ? 0 : nmtabcam.hashCode());
		result = prime * result + ((sqlcatal == null) ? 0 : sqlcatal.hashCode());
		result = prime * result + ((swhabili == null) ? 0 : swhabili.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TendcampDO other = (TendcampDO) obj;
		if (cdatribu == null) {
			if (other.cdatribu != null)
				return false;
		} else if (!cdatribu.equals(other.cdatribu))
			return false;
		if (cdcampo == null) {
			if (other.cdcampo != null)
				return false;
		} else if (!cdcampo.equals(other.cdcampo))
			return false;
		if (cdnivel == null) {
			if (other.cdnivel != null)
				return false;
		} else if (!cdnivel.equals(other.cdnivel))
			return false;
		if (cdtabla == null) {
			if (other.cdtabla != null)
				return false;
		} else if (!cdtabla.equals(other.cdtabla))
			return false;
		if (cdtipend == null) {
			if (other.cdtipend != null)
				return false;
		} else if (!cdtipend.equals(other.cdtipend))
			return false;
		if (dscampo == null) {
			if (other.dscampo != null)
				return false;
		} else if (!dscampo.equals(other.dscampo))
			return false;
		if (nmtabcam == null) {
			if (other.nmtabcam != null)
				return false;
		} else if (!nmtabcam.equals(other.nmtabcam))
			return false;
		if (sqlcatal == null) {
			if (other.sqlcatal != null)
				return false;
		} else if (!sqlcatal.equals(other.sqlcatal))
			return false;
		if (swhabili == null) {
			if (other.swhabili != null)
				return false;
		} else if (!swhabili.equals(other.swhabili))
			return false;
		return true;
	}
	
}
