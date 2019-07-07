package ua.lviv.lgs.entrant.domain;

public class Enrolled {

	private Integer id;
	private Integer useId;
	private Integer facultryId;
	private Integer minimumReting;
	private Integer currentRating;
	private boolean enrolled;
	
	public Enrolled() {
	}

	public Enrolled(Integer useId, Integer facultryId, Integer minimumReting, Integer currentRating, boolean enrolled) {
		this.useId = useId;
		this.facultryId = facultryId;
		this.minimumReting = minimumReting;
		this.currentRating = currentRating;
		this.enrolled = enrolled;
	}

	public Enrolled(Integer id, Integer useId, Integer facultryId, Integer minimumReting, Integer currentRating,
			boolean enrolled) {
		super();
		this.id = id;
		this.useId = useId;
		this.facultryId = facultryId;
		this.minimumReting = minimumReting;
		this.currentRating = currentRating;
		this.enrolled = enrolled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUseId() {
		return useId;
	}

	public void setUseId(Integer useId) {
		this.useId = useId;
	}

	public Integer getFacultryId() {
		return facultryId;
	}

	public void setFacultryId(Integer facultryId) {
		this.facultryId = facultryId;
	}

	public Integer getMinimumReting() {
		return minimumReting;
	}

	public void setMinimumReting(Integer minimumReting) {
		this.minimumReting = minimumReting;
	}

	public Integer getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(Integer currentRating) {
		this.currentRating = currentRating;
	}

	public boolean isEnrolled() {
		return enrolled;
	}

	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentRating == null) ? 0 : currentRating.hashCode());
		result = prime * result + (enrolled ? 1231 : 1237);
		result = prime * result + ((facultryId == null) ? 0 : facultryId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((minimumReting == null) ? 0 : minimumReting.hashCode());
		result = prime * result + ((useId == null) ? 0 : useId.hashCode());
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
		Enrolled other = (Enrolled) obj;
		if (currentRating == null) {
			if (other.currentRating != null)
				return false;
		} else if (!currentRating.equals(other.currentRating))
			return false;
		if (enrolled != other.enrolled)
			return false;
		if (facultryId == null) {
			if (other.facultryId != null)
				return false;
		} else if (!facultryId.equals(other.facultryId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (minimumReting == null) {
			if (other.minimumReting != null)
				return false;
		} else if (!minimumReting.equals(other.minimumReting))
			return false;
		if (useId == null) {
			if (other.useId != null)
				return false;
		} else if (!useId.equals(other.useId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Enrolled [id=" + id + ", useId=" + useId + ", facultryId=" + facultryId + ", minimumReting="
				+ minimumReting + ", currentRating=" + currentRating + ", enrolled=" + enrolled + "]";
	}

	
	
	
}
