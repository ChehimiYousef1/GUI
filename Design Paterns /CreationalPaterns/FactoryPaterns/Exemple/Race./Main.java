class Main {
    public static void main(String[] args) {
        Race race = new CycloCrossRace();
        race.createRace(3);  // creates 3 bikes
        Race race0 = new NormalRace();
        race0.createRace(3);
        Race race00 = new TourDeFrance();
        race00.createRace(3);
    }
}
