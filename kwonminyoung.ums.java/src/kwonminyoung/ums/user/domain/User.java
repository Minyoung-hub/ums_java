package kwonminyoung.ums.user.domain;

import java.time.LocalDate;

public class User {
	private String name;
	private LocalDate date;

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(LocalDate localDate) {
		this.date = localDate;
	}
	
	public String toString() {
		return String.format("%s  %s", name, date);
	}
}