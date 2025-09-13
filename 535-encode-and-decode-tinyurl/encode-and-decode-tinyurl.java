public class Codec {
    private Map<String, String> map = new HashMap<>();
    private static final String BASE_URL = "http://tinyurl.com/";
    private int counter = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = String.valueOf(counter++);
        String shortUrl = BASE_URL + key;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}