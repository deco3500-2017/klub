package clubhub.resources;

import java.util.List;

public class Club {

	private String clubname;
	private String name;
	// Events

	private String summary;
	private List<String> description;

	// Contact details
	private String logo;
	private int membershipPrice;
	private List<String> tags;

	public Club(String clubname, String name, List<String> description, String summary, String logo,
			int membershipPrice, List<String> tags) {
		this.clubname = clubname;
		this.name = name;
		this.summary = summary;
		this.description = description;
		this.logo = logo;
		this.membershipPrice = membershipPrice;
		this.tags = tags;
	}

	/**
	 * @return the clubname
	 */
	public String getClubname() {
		return clubname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return description;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @return the membershipPrice
	 */
	public int getMembershipPrice() {
		return membershipPrice;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

}
