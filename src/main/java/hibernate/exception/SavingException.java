package hibernate.exception;

import java.sql.SQLException;

public class SavingException extends SQLException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5417866939529458623L;

	public SavingException() {
		super();
	}

	public SavingException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public SavingException(String reason, Throwable cause) {
		super(reason, cause);
	}

	public SavingException(String reason) {
		super(reason);
	}

	public SavingException(Throwable cause) {
		super(cause);
	}

}
