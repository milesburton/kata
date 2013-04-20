class NumbersToWords {

    Map specialCases = [
            1: 'one',
            2: 'two',
            3: 'three',
            4: 'four',
            5: 'five',
            6: 'six',
            7: 'seven',
            8: 'eight',
            9: 'nine',
            10: 'ten',
            11: 'eleven',
            12: 'twelve',
            13: 'thirteen',
            14: 'fourteen',
            15: 'fifthteen',
            16: 'sixteen',
            17: 'seventeen',
            18: 'eightteen',
            19: 'nighteen'
    ]

    Map tens = [
            20: 'twenty',
            30: "thirty",
            40: "fourty",
            50: 'fifty',
            60: 'sixty',
            70: 'seventy',
            80: 'eighty',
            90: 'ninety'
    ]

    Map quantifiers = [
            100: "hundred",
    ]

    String fetch(int n) {

        if (isSpecialCase(n)) {

            return specialCases.get(n)
        }

        if (isMultipleOfTen(n) && isLessThan10Times(n, 10)) {
            return tens.get(n)
        }

        if (!isMultipleOfTen(n) && isLessThan10Times(n, 10)) {
            int tens = n - (n % 10)
            return fetch(tens) + " " + fetch(n % 10)
        }

        if (n < 1000) {

            int hundreds = Math.floor(n / 100)
            String str = fetch(hundreds) + " " + quantifiers.get(100)

            if (n % 100 > 0) {
                str += " " + fetch(n % 100)
            }

            return str
        }

        throw new RuntimeException()

    }

    private boolean isLessThan10Times(int n, int multipleOfTen) {
        n / 10 < multipleOfTen
    }

    private boolean isMultipleOfTen(int n) {
        n % 10 == 0
    }

    boolean isSpecialCase(Integer n) {

        specialCases.containsKey(n)
    }
}
