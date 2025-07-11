public class CycloCrossRace extends Race {
  @Override
  Bicycle createBicycle(){
    return new MountainBycycle();
  }
}
