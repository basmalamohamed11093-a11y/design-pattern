package SingleTon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginService {
    private final List<String> exceptions = new ArrayList<>();
    private static final LoginService INSTANCE = new LoginService();

    private LoginService() {
    }

    public static LoginService getInstance() {
        return INSTANCE;
    }

    public synchronized void logException(String exception) {
        exceptions.add(exception);
    }

    public synchronized List<String> listExceptions() {
        return Collections.unmodifiableList(new ArrayList<>(exceptions));
    }
}
