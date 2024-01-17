package nl.codingtime.deathplugin.discordwebhook;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DiscordWebhook {

    public static void hook(String message) throws Exception {
        String webhookUrl = "https://discord.com/api/webhooks/1196927407706357871/_GeCJIZ_rdPDzYofLc6e6MyliJiejyG7m9XoJnM4KEiVZuEgHG7qKnzu67KHTcZv9-VN"; // Replace with your webhook URL
        String jsonPayload = "{\"content\": \"" + message + "\"}"; // Your message in JSON format

        URL url = new URL(webhookUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        try(OutputStream os = con.getOutputStream()) {
            byte[] input = jsonPayload.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        con.getResponseCode();
        con.disconnect();
    }
}
