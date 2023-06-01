/** Write a function public String getArticle(String title) that returns the contents (HTML) of a wikipedia article.
 * For that reason you can use the following public endpoint from the wikipedia
 * REST API: https://en.wikipedia.org/api/rest_v1/page/html/{title}.

 Hint: you can use the java.net.HttpURLConnection class. */

public class Question16 {
    public static String getArticle(String title) {
        String apiUrl = "https://en.wikipedia.org/api/rest_v1/page/html/" + title;
        StringBuilder content = new StringBuilder();

        try {
            java.net.URL url = new java.net.URL(apiUrl);
            java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == java.net.HttpURLConnection.HTTP_OK) {
                try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line);
                    }
                }
            } else {
                return "false";
            }

            connection.disconnect();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

}
