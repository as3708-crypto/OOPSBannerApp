public class BannerUC6 {

    public static String[] getOPattern() {
        return new String[]{
            String.join("", "  OOOOO  "),
            String.join("", " OO   OO "),
            String.join("", " OO   OO "),
            String.join("", " OO   OO "),
            String.join("", " OO   OO "),
            String.join("", " OO   OO "),
            String.join("", "  OOOOO  ")
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            String.join("", " PPPPPP  "),
            String.join("", " PP   PP "),
            String.join("", " PP   PP "),
            String.join("", " PPPPPP  "),
            String.join("", " PP      "),
            String.join("", " PP      "),
            String.join("", " PP      ")
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            String.join("", "  SSSSS  "),
            String.join("", " SS   SS "),
            String.join("", " SS      "),
            String.join("", "  SSSSS  "),
            String.join("", "      SS "),
            String.join("", " SS   SS "),
            String.join("", "  SSSSS  ")
        };
    }

    public static void main(String[] args) {

        String[] O1 = getOPattern();
        String[] O2 = getOPattern(); 
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] banner = {
            String.join("   ", O1[0], O2[0], P[0], S[0]),
            String.join("   ", O1[1], O2[1], P[1], S[1]),
            String.join("   ", O1[2], O2[2], P[2], S[2]),
            String.join("   ", O1[3], O2[3], P[3], S[3]),
            String.join("   ", O1[4], O2[4], P[4], S[4]),
            String.join("   ", O1[5], O2[5], P[5], S[5]),
            String.join("   ", O1[6], O2[6], P[6], S[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
