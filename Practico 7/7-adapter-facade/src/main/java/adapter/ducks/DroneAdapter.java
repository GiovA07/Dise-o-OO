package adapter.ducks;

public class DroneAdapter  implements Duck{
  private Drone drone;

  public DroneAdapter(Drone drone) {
    this.drone = drone;
  }

  @Override
  public void fly() {
    drone.spin_rotors();
  }

  @Override
  public void quack() {
    drone.beep();
  }
}
