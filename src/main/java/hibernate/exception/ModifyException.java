package hibernate.exception;

import java.sql.SQLException;

public class ModifyException extends SQLException {
	
	private static final long serialVersionUID = -1100990262562749762L;

	public ModifyException() {
		super();
	}

	public ModifyException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public ModifyException(String reason, Throwable cause) {
		super(reason, cause);
	}

	public ModifyException(String reason) {
		super(reason);
	}

	public ModifyException(Throwable cause) {
		super(cause);
	}
	
}
