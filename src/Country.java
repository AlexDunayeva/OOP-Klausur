public enum Country implements Airport{
    BERLIN,
    LONDON,
    MADRIT,
    PARIS,
    NEW_YORK,
    OSAKA,
    OSLO;

    @Override
    public String generateAirportCode() {
        char[] code = this.toString().toCharArray();
        String airportCode = "";
        for(int i = 0; i<= 2; i++){
            airportCode += code[i];
        }
        return airportCode;
    }

}
