
public class BannerUC7 {

    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  OOOOO  ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                " OO   OO ",
                "  OOOOO  "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " PPPPPP  ",
                " PP   PP ",
                " PP   PP ",
                " PPPPPP  ",
                " PP      ",
                " PP      ",
                " PP      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  SSSSS  ",
                " SS   SS ",
                " SS      ",
                "  SSSSS  ",
                "      SS ",
                " SS   SS ",
                "  SSSSS  "
        });

        CharacterPattern[] letters = { O, O, P, S };

        String[] banner = new String[7];

        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();

            for (CharacterPattern cp : letters) {
                sb.append(cp.getPattern()[row]).append("   ");
            }

            banner[row] = sb.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
