package ua.lviv.lgs.entrant.domain;

public class Reting {
	private Integer id;
	private Integer userId;
	private Integer subjectId;
	private Integer reting;
	
	public Reting() {
	}

	public Reting(Integer userId, Integer subjectId, Integer reting) {
		this.userId = userId;
		this.subjectId = subjectId;
		this.reting = reting;
	}

	public Reting(Integer id, Integer userId, Integer subjectId, Integer reting) {
		this.id = id;
		this.userId = userId;
		this.subjectId = subjectId;
		this.reting = reting;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getReting() {
		return reting;
	}

	public void setReting(Integer reting) {
		this.reting = reting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reting == null) ? 0 : reting.hashCode());
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Reting other = (Reting) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reting == null) {
			if (other.reting != null)
				return false;
		} else if (!reting.equals(other.reting))
			return false;
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reting [id=" + id + ", userId=" + userId + ", subjectId=" + subjectId + ", reting=" + reting + "]";
	}
	
	
	
	

}
