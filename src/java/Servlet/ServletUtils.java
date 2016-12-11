package Servlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;


public class ServletUtils {
	public static final float OPPORTUNITY_MAX = 95;
	public static final float OPPORTUNITY_MIN = 20;
	public static final float THRESHOLD_TIME = 15;
	public static final int BCRYPT_SALT = 15;

	public static boolean isLogged(HttpServletRequest req) {

		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("user") != null) {
			return true;
		}
		return false;
	}

	public static boolean isEmail(String email) {
		if (email != null && !email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
			return false;
		}
		return true;
	}

	public static String getParam(HttpServletRequest request, String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}

	

	public static String cryptPassword(String pwd) {
		return BCrypt.hashpw(pwd, BCrypt.gensalt(BCRYPT_SALT));
	}

	public static boolean isMatched(String pwd, String cryptPwd) {
		return BCrypt.checkpw(pwd, cryptPwd);
	}
}