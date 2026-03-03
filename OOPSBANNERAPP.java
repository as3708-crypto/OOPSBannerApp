import java.util.HashMap;
import java.util.Map;

public class BannerUC8 {

    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  OOOOO  ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                "  OOOOO  "
        });

        patternMap.put('P', new String[]{
                " PPPPPP  ",
                " PP   PP ",
                " PP   PP ",
                " PPPPPP  ",
                " PP      ",
                " PP      ",
                " PP      "
        });

        patternMap.put('S', new String[]{
                "  SSSSS  ",
                " SS   SS ",
                " SS      ",
                "  SSSSS  ",
                "      SS ",
                " SS   SS ",
                "  SSSSS  "
        });

        return patternMap;
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) { 

            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray()) { 
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[row]).append("   ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}

