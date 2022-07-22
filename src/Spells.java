public enum Spells {
    minorIllusion("minor-illusion") {
        @Override
        public String toString() {
            return "Minor illusion";
        }
    };

    private final String apiString;

    Spells(String apiString) {
        this.apiString = apiString;
    }
    public String getSpellApiString() {
        return apiString;
    }
}
