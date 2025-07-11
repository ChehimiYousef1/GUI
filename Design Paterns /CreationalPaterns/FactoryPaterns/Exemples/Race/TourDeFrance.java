public class TourDeFrance extends Race {
  @Override 
  Bicycle createBicycle(){
    return RoadBicycle();
  }
}
