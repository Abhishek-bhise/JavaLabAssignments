class 2023BIT502 {
    public static void main(String[] args) {
        String[] regNos = { "2020MEC403", "2023bit532", "2023504", "bce034", "2021BCS304","2009CHE302"};
        int validRegistrationCount = getValidRegistrationCounts(regNos);
        System.out.println("Valid Registration Counts: " + validRegistrationCount);
    }

    public static int getValidRegistrationCounts(String[] regNos) {
        int validCount = 0;
        String[] expectedString = {"BIT", "BCS", "CHE", "MEC"};
        for (String regNo : regNos) {
            if (isValidReg(regNo, expectedString)) {
                validCount++;
            }
        }
        return validCount;
    }

    public static boolean isValidReg(String regNo, String[] expectedString) {
        if (regNo.length() != 10) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            char ch = regNo.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        String middleLetters = regNo.substring(4, 7);
        for (String expected : expectedString) {
            if (middleLetters.equalsIgnoreCase(expected)) {
                return true;
            }
        }
        return false;
    }
}