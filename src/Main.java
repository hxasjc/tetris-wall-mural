import javadraw.*;

public class Main extends Window {
    //define pattern of colour squares
    private static final Color[][] COLOR_PATTERN = {
            {Color.WHITE, Color.RED, Color.RED, Color.WHITE, Color.WHITE, Color.BLACK, Color.BLACK, Color.WHITE, Color.WHITE, Color.GREEN, Color.GREEN, Color.WHITE},
            {Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN},
            {Color.CYAN, Color.CYAN, Color.CYAN, Color.CYAN, Color.CYAN, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.GREEN, Color.GREEN, Color.GREEN},
            {Color.CYAN, Color.CYAN, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.CYAN, Color.CYAN},
            {Color.BLACK, Color.GREEN, Color.GREEN, Color.RED, Color.RED, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.BLACK, Color.BLACK, Color.CYAN},
            {Color.YELLOW, Color.YELLOW, Color.GREEN, Color.GREEN, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.GREEN, Color.GREEN, Color.YELLOW, Color.YELLOW},
            {Color.BLACK, Color.BLACK, Color.BLACK, Color.CYAN, Color.CYAN, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.GREEN, Color.GREEN, Color.YELLOW},
            {Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.CYAN, Color.CYAN, Color.BLACK, Color.BLACK, Color.GREEN, Color.GREEN, Color.BLACK, Color.BLACK},
            {Color.RED, Color.YELLOW, Color.YELLOW, Color.CYAN, Color.CYAN, Color.CYAN, Color.CYAN, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN, Color.BLACK}
    };

    //define the size of each square
    private static final double SQUARE_SIZE = 50;

    //define the starting position for the pattern (indent)
    private static final double START_POS = 10;

    public static void main(String[] args) {
        Window screen = new Window();
        screen.open(620, 470, "Tetris Wall Mural");
    }

    public void start() {
        double x = START_POS; //initialize square coordinates
        double y = START_POS;

        for (Color[] arr : COLOR_PATTERN) { //loop through 2d array
            for (Color color : arr) { //loop through sub array
                new Rectangle(screen, x, y, SQUARE_SIZE, SQUARE_SIZE, color); //create rectangle
                x += SQUARE_SIZE; //increase x-axis coordinate
            }

            x = START_POS; //reset x-axis coordinate
            y += SQUARE_SIZE; //increase y-axis coordinate
        }
    }
}
