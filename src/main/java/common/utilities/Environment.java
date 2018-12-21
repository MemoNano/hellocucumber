package common.utilities;

// TODO: This is not implemented for determining environment. Work on this next - malexander 12/20/18

/**
 * Environment Object Class
 */
public class Environment {

    String SPRINT = "";
    String DEPLOY = "";
    String PROD = "";
    private Environments env;

    public Environment(Environments env) {
        this.env = env;
    }

    public Environments getEnvironment() {
        return env;
    }

    public String get_env(Environment env) {
        String url = "";
        switch (env.getEnvironment()) {
            case SPRINT:
                url = "https://staging-m-sprint.pizzahut.com/index.php";
                break;
            case DEPLOY:
                url = "https://staging-m-deploy.pizzahut.com/index.php";
                break;
            case PROD:
                url = "https://www.pizzahut.com/index.php";
                break;
        }
        return url;
    }

    public enum Environments {
        SPRINT, DEPLOY, PROD
    }
}
