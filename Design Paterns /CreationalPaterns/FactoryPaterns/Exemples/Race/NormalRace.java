public class NormalRace extends Race {
  @Override
  Bicycle createBicycle(){
    return new Bicycle();
  }
}
