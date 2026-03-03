public class BannerUC5 {
    public static void main(String[] args) {

        String[] banner = {
            String.join("", "+", "-".repeat(30), "+"),
            String.join("", "|", "                              ", "|"),
            String.join("", "|", "        WELCOME USER         ", "|"),
            String.join("", "|", "    INLINE ARRAY VERSION     ", "|"),
            String.join("", "|", "                              ", "|"),
            String.join("", "+", "-".repeat(30), "+"),
            String.join("", "        Program Completed        ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
