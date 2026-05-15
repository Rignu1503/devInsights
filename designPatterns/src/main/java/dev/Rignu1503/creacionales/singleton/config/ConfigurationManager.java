package dev.Rignu1503.creacionales.singleton.config;


import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config;

    // Constructor privado para prevenir instanciación
    private ConfigurationManager() {
        config = new HashMap<>();
        loadConfiguration();
    }

    // Simulacion carga de configuración
    private void loadConfiguration() {
        config.put("apiUrl", "https://api.example.com");
        config.put("dbConnection", "jdbc:postgresql://localhost:5432/mydb");
        config.put("maxRetries", "3");
        config.put("timeout", "5000");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }
}
