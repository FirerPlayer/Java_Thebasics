public class flourPack {
    public static void main(String[] args) {
        if (canPack(2, 10, 18)) {
            System.out.println("Can pack");
        } else {
            System.out.println("Can't pack");
        }

    }

    public static boolean canPack(int bigBag, int smallBag, int goal) {
        if (bigBag < 0 || smallBag < 0 || goal < 0) {
            return false;
        }
        int v1 = smallBag, v2 = bigBag * 5;
        if (goal % (v1 + v2) == 0) {
            return true;
        }
        if (goal > (v1 + v2)) {
            return false;
        }
        if (v1 + v2 > goal) {
            if (v2 == 0) {
                return true;
            } else if (v1 == 0) {
                if (goal % v2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            for (int i = 0; i <= bigBag; i++) {
                for (int j = 0; j <= v1; j++) {
                    if (j + (i * 5) == goal) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
