class TitleCapitalizationKata {

    private static final String REGEX_FOR_WHITESPACE = "\\s"
    def stopWords = ['the', 'to', 'at', 'in', 'with', 'and', 'but', 'or']

    def capitalize(String title) {

        splitByWhiteSpace(title)
                .collect {

            if (stopWords.contains(it)) {
                it.toLowerCase()
            } else {
                capitaliseFirstLetterAndLowerCaseRemaining(it)
            }
        }
        .join(" ")
    }

    private def capitaliseFirstLetterAndLowerCaseRemaining(String it) {
        capitaliseFirstLetter(it) + lowercaseAllCharactersAfterFirstLetter(it)
    }

    private String lowercaseAllCharactersAfterFirstLetter(String it) {
        it.substring(1).toLowerCase()
    }

    private String capitaliseFirstLetter(String it) {
        it.substring(0, 1).toUpperCase()
    }

    private def splitByWhiteSpace(String title) {
        title.split(REGEX_FOR_WHITESPACE)
    }
}
