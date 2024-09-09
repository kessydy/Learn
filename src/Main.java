class Main {
public static void main(String [] args) {
    int x = 0;
    int y = 30;
    for(int ouner = 0; ouner < 3; ouner++) {
        for (int inner = 4; inner > 1; inner--) {
            x = x + 6;
            y = y - 2;
            if (x == 6) {
                break;
                }
                x = x + 3;
            }
        y = y - 2;
        }
    }
}