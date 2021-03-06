package music;

import java.awt.*;

public class UC {
    public static final int WINDOW_WIDTH = 1000, WINDOW_HEIGHT = 600;
    public static final int INK_BUFFER_MAX = 300;

    public static final int NORM_SAMPLE_SIZE = 25;
    public static final int NORM_COORD_MAX = 1000;
    public static final Color INK_COLOR = Color.BLACK;
    public static final int NO_MATCH_DIST = 1000000;
    public static final int DOT_THRESHOLD = 5;
    public static final int PROTOTYPE_LIST_MARGIN = 10;
    public static final int PROTOTYPE_LIST_SIZE = 60;
    public static final int PROTOTYPE_LIST_Y_LIM = PROTOTYPE_LIST_MARGIN + PROTOTYPE_LIST_SIZE;
    public static final Color SHAPE_TRAINER_BACKGROUND_COLOR = new Color(93, 188, 210);
    public static final int NO_BID = 10000;
}
