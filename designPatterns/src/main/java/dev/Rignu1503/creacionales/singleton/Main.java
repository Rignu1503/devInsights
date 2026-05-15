package dev.Rignu1503.creacionales.singleton;

import dev.Rignu1503.creacionales.singleton.config.ConfigurationManager;

public class Main {
    public static void main(String[] args) {

        // Obtener instancia desde diferentes partes del código
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        // Verificar que son la misma instancia
        System.out.println("¿Son la misma instancia? " + (config1 == config2));

        // Usar configuración de ambas instancias
        System.out.println("API URL: " + config1.getConfig("apiUrl"));
        System.out.println("Max Retries: " + config2.getConfig("maxRetries"));

        // Modificar en una instancia se refleja en todas
        config1.setConfig("newKey", "newValue");
        System.out.println("New Key desde config2: " + config2.getConfig("newKey"));
    }
}
