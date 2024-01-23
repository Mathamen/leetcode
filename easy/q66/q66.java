class q66 {
    public int[] plusOne(int[] digits) {
        int tam = digits.length;
        digits[tam - 1] = digits[tam - 1] + 1;

        for (int i = tam - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }

        if (digits[0] != 10) {
            return digits;
        } else {
            int[] arrayNovo = new int[tam + 1];
            arrayNovo[0] = 1;
            arrayNovo[1] = 0;

            for (int i = 2; i <= tam; i++) {
                arrayNovo[i] = digits[i - 1];
            }

            return arrayNovo;
        }
    }
}