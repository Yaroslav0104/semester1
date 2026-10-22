package semester1.practice07;

public class GameSession {
    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private static int activeSessionsCount = 0;
    public static final int MAX_SESSIONS = 3;

    private GameSession(String host) {
        this.hostPlayer = host;
        this.isActive = true;
        this.sessionToken = "TOKEN-" + (System.currentTimeMillis() % 100000);
    }

    public static GameSession createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new GameSession(host);
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            if (activeSessionsCount > 0) {
                activeSessionsCount--;
            }
            System.out.println("Сесія " + sessionToken + " була завершена.");
        }
    }

    public void printSessionInfo() {
        System.out.println("Токен: " + sessionToken + " | Хост: " + hostPlayer + " | Активна: " + isActive);
    }
}
