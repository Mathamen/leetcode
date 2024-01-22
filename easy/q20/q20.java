class q20 {
    public boolean isValid(String s) {
        char[] ar = s.toCharArray();
        int parE = 0, parD = 0, chaE = 0, chaD = 0, colE = 0, colD = 0;

        for (int i = 0; i < ar.length; i++) {
            switch (ar[i]) {
                case '(' -> { parE++; break; }
                case ')' -> { parD++; break; }
                case '{' -> { chaE++; break; }
                case '}' -> { chaD++; break; }
                case '[' -> { colE++; break; }
                case ']' -> { colD++; break; }
            }
        }

        if (parE != parD || chaE != chaD || colE != colD) {
            return false;
        }

        return true;
    }
}
